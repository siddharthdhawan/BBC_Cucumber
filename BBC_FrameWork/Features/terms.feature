Feature: Verify the title of Sports Page

Scenario: In the Homepage click on sports and verifying title
	Given Intialize the browser with chrome
	And Navigate to "https://bbc.com/" site
	And Click on Terms of use
	Then Verify the first headinging
	Then terminate the browser