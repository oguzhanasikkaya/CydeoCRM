Feature: Logout Functionality
  User Story: As a User I should be able to log out

  Acceptance Criteria:
  1- The user can log out and ends up on the login page
  2- The user can not go to the home page again by clicking
      the step back button after successfully logging out
  3- The user must be logged out if the user close the

@AZLC-1457
  Scenario: When the user log out , User should ends up on the login page
    Given User is on the home page
    When  user click the user menu
    And   user click the logout button
    Then  user ends up on login page

@AZLC-1458
  Scenario: User can not go to the home page again by clicking the step back button
    after successfully logging out

    Given User is on the home page
    When  user click the user menu
    And   user click the logout button
    And   user click the step back button
    Then  user can not go to home page


  @AZLC-1459
    Scenario: User must be logged out if the user close the open tab(all tabs if there are multiple open tabs)
      Given User is on the home page
      When user close the open tab(s)
      And  user open new tab with home page url
      Then user can not go to home page