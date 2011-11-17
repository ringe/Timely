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
