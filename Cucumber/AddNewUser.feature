Feature: Add New User

Scenario: Verify number of records after adding
Given I click on Admin Tab
And   I get number of records
And I press on add button
And I fill the required data
When I press on save button
Then the number of records increased by one
