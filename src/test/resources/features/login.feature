Feature: Login functionality
  User Story:
  1-All users can log in with valid credentials (We have 3 types of users such as HR user, Marketing user, Helpdesk user).
  2-"Incorrect login or password." should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
  3- "Please fill out this field" message should be displayed if the password or username is empty
  4-User land on the ‘Get Password’ page after clicking on the "Forgot your password?" link
  5-User can see "Remember Me" link exists and is clickable on the login page
  6-User should see the password in bullet signs by default
  7- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
  8-All users can see their own usernames in the profile menu, after successful login

  Accounts are: hr, helpdesk, marketing

  @hr @login @smoke
  Scenario Outline: As a HR user successfully login
    Given user is on the crm login page
    When  user enters username "<hr username>"
    And   user enters password "<hr password>"
    And   user click login button
    Then  user should see the hr "<his/her name>"
    Examples:
      | hr username             | hr password | his/her name            |
      | hr50@cybertekschool.com | UserUser    | hr50@cybertekschool.com |
      | hr70@cybertekschool.com | UserUser    | hr70@cybertekschool.com |
      | hr88@cybertekschool.com | UserUser    | hr88@cybertekschool.com |

  @marketing @login @smoke
  Scenario Outline: Login as marketing
    Given user is on the crm login page
    When user enter username "<marketing username>"
    And  user enters "<marketing password>"
    Then user should see the marketing "<his/her name>"
    Examples:
      | marketing username             | marketing password | his/her name                   |
      | marketing25@cybertekschool.com | UserUser           | marketing25@cybertekschool.com |
      | marketing35@cybertekschool.com | UserUser           | marketing35@cybertekschool.com |
      | marketing51@cybertekschool.com | UserUser           | marketing51@cybertekschool.com |


  @helpdesk @login @smoke
  Scenario Outline: Login as helpdesk
    Given user is on the crm login page
    When  user enters helpdesk "<helpdesk username>"
    And   user enters helpdesk "<helpdesk password>"
    Then  user should see the helpdesk "<his/her name>"
    Examples:
      | helpdesk username             | helpdesk password | his/her name                  |
      | helpdesk35@cybertekschool.com | UserUser          | helpdesk35@cybertekschool.com |
      | helpdesk53@cybertekschool.com | UserUser          | helpdesk53@cybertekschool.com |
      | helpdesk93@cybertekschool.com | UserUser          | helpdesk93@cybertekschool.com |



