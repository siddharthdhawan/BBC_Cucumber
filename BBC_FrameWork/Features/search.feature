Feature: Verify the heading of first result

Scenario Outline: From the search result clicking on result1 and verifying heading
	Given Intialize the browser with chrome
	And Navigate to "https://bbc.com/" site
	And Click on Search icon on homepage
	Then read data from excel and send in search box
	And Click on search button
	Then Click on the first result
	And verify the heading is <text> or not
	Then terminate the browser
	
	Examples:
	|text  |
	|London|