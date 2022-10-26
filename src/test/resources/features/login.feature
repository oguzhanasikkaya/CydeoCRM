@AZLC-1428
Feature: Login functionality
  User Story:
  1-All users can log in with valid credentials.
  2-"Incorrect login or password." should be displayed for invalid data
  3- "Please fill out this field" message should be displayed if the password or username is empty
  4-User land on the ‘Get Password’ page after clicking on the "Forgot your password?" link
  5-User can see "Remember Me" link exists and is clickable on the login page
  6-User should see the password in bullet signs by default
  7-Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
  8-All users can see their own usernames in the profile menu, after successful login

  Accounts are: hr, helpdesk, marketing

  @AZLC-1427  @AZLC-1440
  Scenario Outline: As a User, I successfully login the app
    Given User is on the login page
    When  User enters valid username "<username>"
    And   User enters valid password "<password>"
    And   User click login button
    Then  user access the home page
    Then  user see their "<own username>"

    Examples:
      | username                       | password | own username                   |
      | hr50@cybertekschool.com        | UserUser | hr50@cybertekschool.com        |
      | helpdesk95@cybertekschool.com  | UserUser | helpdesk95@cybertekschool.com  |
      | marketing85@cybertekschool.com | UserUser | marketing85@cybertekschool.com |

  @AZLC-1429
  Scenario Outline: As a User, I should warning message when I try to login with invalid credentials
    Given User is on the login page
    When  user enters any username "<username>"
    And   user enters any password "<password>"
    And   User click login button
    Then  user should see warning message invalid

    Examples:
      | username                | password |
      | invalid                 | invalid  |
      | hr50@cybertekschool.com | invalid  |
      | invalid                 | UserUser |

  @AZLC-1430
  Scenario Outline: When the password or username is empty, User should see "Please fill out this field" message
    Given User is on the login page
    When user enters any username "<username>"
    And  user enters any password "<password>"
    And user click login button
    Then  user should see warning message-fill out

    Examples:
      | username                | password |
      |                         |          |
      | hr50@cybertekschool.com |          |
      |                         | UserUser |

  @AZLC-1436
  Scenario: After clicking on the "Forgot your password", User land on the "Get Password" page
    Given User is on the login page
    When User click Forgot your password link
    Then User land  on the Get Password page


  @AZLC-1437
  Scenario: User can see "Remember Me" link exists and is clickable on the login page
    Given User is on the login page
    Then  Remember Me link is clickable

  @AZLC-1438
  Scenario: User should see the password  in bullet signs by default
    Given User is on the login page
    Then User should see the password in bullet signs by default

  @AZLC-1439
  Scenario: verify Enter key is working on the login page
    Given User is on the login page
    And  user enter valid username and password
    And  user press ENTER
    Then user access the home page


