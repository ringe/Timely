require 'spec_helper'

describe Person do
  
  before(:each) do
    @attr = { 
      :name => "Example Person",
      :email => "person@example.com",
      :password => "foobar",
      :password_confirmation => "foobar"
    }
  end
  
  it "should create a new instance given a valid attribute" do
    Person.create!(@attr)
  end
  
  it "should require an email address" do
    no_email_person = Person.new(@attr.merge(:email => ""))
    no_email_person.should_not be_valid
  end
  
  it "should accept valid email addresses" do
    addresses = %w[person@foo.com THE_person@foo.bar.org first.last@foo.jp]
    addresses.each do |address|
      valid_email_person = Person.new(@attr.merge(:email => address))
      valid_email_person.should be_valid
    end
  end
  
  it "should reject invalid email addresses" do
    addresses = %w[person@foo,com person_at_foo.org example.person@foo.]
    addresses.each do |address|
      invalid_email_person = Person.new(@attr.merge(:email => address))
      invalid_email_person.should_not be_valid
    end
  end
  
  it "should reject duplicate email addresses" do
    Person.create!(@attr)
    person_with_duplicate_email = Person.new(@attr)
    person_with_duplicate_email.should_not be_valid
  end
  
  it "should reject email addresses identical up to case" do
    upcased_email = @attr[:email].upcase
    Person.create!(@attr.merge(:email => upcased_email))
    person_with_duplicate_email = Person.new(@attr)
    person_with_duplicate_email.should_not be_valid
  end
  
  describe "passwords" do

    before(:each) do
      @person = Person.new(@attr)
    end

    it "should have a password attribute" do
      @person.should respond_to(:password)
    end

    it "should have a password confirmation attribute" do
      @person.should respond_to(:password_confirmation)
    end
  end
  
  describe "password validations" do

    it "should require a password" do
      Person.new(@attr.merge(:password => "", :password_confirmation => "")).
        should_not be_valid
    end

    it "should require a matching password confirmation" do
      Person.new(@attr.merge(:password_confirmation => "invalid")).
        should_not be_valid
    end
    
    it "should reject short passwords" do
      short = "a" * 5
      hash = @attr.merge(:password => short, :password_confirmation => short)
      Person.new(hash).should_not be_valid
    end
    
  end
  
  describe "password encryption" do
    
    before(:each) do
      @person = Person.create!(@attr)
    end
    
    it "should have an encrypted password attribute" do
      @person.should respond_to(:encrypted_password)
    end

    it "should set the encrypted password attribute" do
      @person.encrypted_password.should_not be_blank
    end

  end

end
