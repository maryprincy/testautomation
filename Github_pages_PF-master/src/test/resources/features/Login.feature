Feature: Login to github

  Scenario: Verify github login
    Given System navigate to github login page
    And I am login to the github
    Then System navigate to the github user Account home page