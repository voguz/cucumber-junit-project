@smoke @Regression @login
Feature: Library app login feature

  User Story :
  As a user, i should be able to login with correct credentials to different accounts
  Accounts are : librarian, student, admin

  Background: This Given part is common for all tests it is like BeforeMethod
    Given user is on the library login page


    @smoke @librarian @employee
    Scenario: login as a librarian // assume it is like a Test Case
    # Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard


    @student @db
    Scenario: Login as a student
     # Given user is on the library login page
      When user enters student username
      And user enters student password
      Then user should see dashboard


    @admin @employee
    Scenario: Login as a admin
    # Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard