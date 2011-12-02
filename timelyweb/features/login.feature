Feature: User login via Active Directory
	As a User
	I want to log in
	
	Scenario: Logging in
		Given I am a Student with id 434034
		And I visit the login page
		Then I should see the login form
		
		When I fill in username with 434034
		And I fill in password with "eplekake"
		Then I should be logged in
