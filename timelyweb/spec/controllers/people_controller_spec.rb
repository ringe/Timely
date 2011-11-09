require 'spec_helper'

describe PeopleController do

  before (:each) do
    @person = Factory(:person)
    sign_in @person
  end

  describe "GET 'show'" do
    
    it "should be successful" do
      get :show, :id => @person.id
      response.should be_success
    end
    
    it "should find the right person" do
      get :show, :id => @person.id
      assigns(:person).should == @person
    end
    
  end

end
