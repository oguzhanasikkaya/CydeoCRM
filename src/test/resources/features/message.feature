Feature: I should be able to add link, insert video, mention, quote, add tag in message

  Acceptance Criteria

  1. User should be able to add mentions about only department employees.
  2. User should be able to attach link to specified text.
  3. User should be able to insert YouTube and Vimeo video.
  4. User should be able to add quotes.
  5. User should be able to add tags in message.
  6. User should be able to remove tags before sending the message



  Background: This is pre conditions
    Given  User is on the home page
    And    user click Activity Stream module
    And    User click Message button

  Scenario: user should be able to add mentions about only department employees
    When  user remove All employees that writing by default
    And   user click the mention button
    And   user click the Employees and department button
    And   user click group2.2
    And   user select any user
    Then  user should see selected user in the message body


   Scenario: User should be able to attach link to specified text.
     When user click link button
     And  user write text name
     And  user write text link
     And user click save button
     Then message body contain link text


