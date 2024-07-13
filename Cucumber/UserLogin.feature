Feature: Login
  #Description (optinal): Login of user for Orangehrmlive website

  Scenario: User Login
    Given Navigate to home page of Orangehrmlive
    When I enter username as Admin
    And  I enter password as admin123
    Then login should be successful
    #BUT home page should not be missing


   #Feature -Name of the feature under test.
  #Description -Describe about feature under test.
  #Scenario − What is the test scenario.
  #Given − Prerequisite before the test steps get executed.
  #When − Specific condition which should match in order to execute the next step.
  #Then − What should happen if the condition mentioned in WHEN is satisfied.