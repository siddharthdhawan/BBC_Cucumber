Feature: Verify the title of Sports Page

Scenario: In the Homepage click on sports and verifying title
	Given Intialize the browser with chrome
	And Navigate to "https://bbc.com/" site
	And Click on Sports button on homepage
	And In sportspage verify the title
	Then terminate the browser