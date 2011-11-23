Feature: Import
	To keep the database up to date
	As a time planner
	I should be able to import data from csv files retrieved from FS
	
	Scenario:	Import Rooms
		Given the file "spec/import/ROMTABELL.csv"
		When I read the contents of the file
		And I convert the content to rooms
		Then I should have 3 rooms
		
	Scenario: Import Students
		Given the file "spec/import/STUDENTTABELL_FS.csv"
		When I read the contents of the file
		And I convert the content to Students
		Then I should have 3 students
		
	Scenario: Assign Acessories to Rooms
		Given the file "spec/import/ROMUTSTYR.csv"
		When i extract the Rooms from the file
		And i assign Accessories to the correct Rooms
		Then I should have 3 Rooms with Accessories
		
	Scenario: Import Teachers
		Given the file "spec/import/FAGLEARERTABELL_kunFS.csv"
		When I read the contents of Teachers
		And I convert the content to Teachers
		Then I should have 3 teachers
		
	Scenario: Import Classes
		Given the file "spec/import/KLASSETABELL.csv"
		When I read the contents of the file
		And I convert the content to Classes
		Then I should have 3 Classes
		
	Scenario: Assign Students to Groups
		Given the file "spec/import/KLASSESTUDENTER.csv"
		When I read the contents of the file
		And I assign Students to Groups
		Then I should have 1 different Student in 3 Groups
		
