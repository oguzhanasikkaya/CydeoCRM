Feature: Login functionality
  Agile Story:
  1-All users can log in with valid credentials (We have 3 types of users such as HR user, Marketing user, Helpdesk user).
  2-"Incorrect login or password." should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
  3- "Please fill out this field" message should be displayed if the password or username is empty
  4-User land on the ‘Get Password’ page after clicking on the "Forgot your password?" link
  5-User can see "Remember Me" link exists and is clickable on the login page
  6-User should see the password in bullet signs by default
  7- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
  8-All users can see their own usernames in the profile menu, after successful login

  Scenario: Verification to Successfully login
    When  <user> is on the login page
    And   <user> enter valid <username>
    And   <user> enter valid <password>
    And   <user> click sing in button
    Then  <user> see his/her name on the dashboard

