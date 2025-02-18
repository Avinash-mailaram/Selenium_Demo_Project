#Author: Avinash Mailaram

@tag
Feature: New Employee Registration
  I want to use this template to check new employee registration

  @tag1
  Scenario: Check New Employee Registation with valid inputs
    Given i open browser with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "Admin"
    And i enter password as "Qedge123!@#"
    And i click login
    Then i should see admin module
    When i goto add employee page
    And i enter firstname as "David"
    And i enter lastname as "Joy"
    When i click on save button
    Then i should see new registered employee in the employee list
    When i click logout
    Then i should see login page
    When i close browser
