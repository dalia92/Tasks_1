Feature: Delete New User

Scenario: Verify number of records after deletion
Given I click on Admin Tab
And I search with username for new user
And I press on search button
When I press on delete button for the new user
Then the number of records decreased by one