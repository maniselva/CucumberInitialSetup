@saveform
Feature: Save form
Scenario: Launch browser functionality

Given Customer launch the Browser
Then Customer login with user credintials
			 | InputFileName 	| SheetName| RowId |
			 | Input_sugarcrm    |   Login_user | User1 |
And Customer Close the Browser		 