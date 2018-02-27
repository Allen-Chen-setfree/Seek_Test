Feature: Test the search feature on website www.seek.com.au

Scenario: Search "tester" in ICT field in Sydeny NSW for today and show the results

Given that the homepage "www.seek.com.au" is available
When I input "tester" for "What"
And tick the "Information & Communication Technology" in "Any Classification"
And input "Sydeny" for "Where"
And click "More options"
And click "listed any time"
And choose "Today"
And click "SEEK" 
Then I get the search results