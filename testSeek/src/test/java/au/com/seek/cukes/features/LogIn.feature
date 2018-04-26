Feature: Test the login feature on website www.seek.com.au

Scenario Outline: use more than one account to log in the seek homepage. 

	Given that homepage "https://www.seek.com.au" is available
	When enter into "Sign In" page
	Then navigate to "Sign In" page
	When input "<Email>" and "<Password>"
	And click "Sign In" button1
	Then go to next page
	When click "later" button2
	Then go to the following page
	When click "not now" button3
	Then get the login page

	Examples: 
	| Email | Password |
	| chenlimouse@sina.com | SeleniumTest |		