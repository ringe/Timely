Feature: Import
	To keep the database up to date
	As a time planner
	I should be able to import data from csv files retrieved from FS
			
	Scenario: Import Students
		Given the file "spec/import/STUDENTTABELL_FS.csv"
		And I convert the content to Students
		Then I should have 3 students
	
	Scenario:	Import Rooms
		Given the file "spec/import/ROMTABELL.csv"
		And I convert the content to rooms
		Then I should have 3 rooms
	
	Scenario: Assign Acessories to Rooms
		Given the file "spec/import/ROMUTSTYR.csv"
		When i extract the Rooms from the file
		Then I should have 3 Rooms with Accessories
		
	Scenario: Import Teachers
		Given the file "spec/import/FAGLEARERTABELL_kunFS.csv"
		And I convert the content to Teachers
		Then I should have 3 teachers
		
	Scenario: Import Classes
		Given the file "spec/import/KLASSETABELL.csv"
		And I convert the content to Classes
		Then I should have 3 Classes
		
	Scenario: Assign Students to Groups
		Given the file "spec/import/STUDENTTABELL_FS.csv"
		And I convert the content to Students
		Then I should have 3 students
		
		Given the file "spec/import/KLASSESTUDENTER.csv"
		And I assign Students to Groups
		Then I should have 1 different Student in 3 Groups