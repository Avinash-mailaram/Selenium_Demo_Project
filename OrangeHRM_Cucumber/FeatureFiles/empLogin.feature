#Author: Avinash Mailaram

@tag
Feature: Employee Login
  I want to use this template to check employee login

  @tag1
  Scenario: Check Employee login with valid inputs
    Given i open browser with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "Avinash2222"
    And i enter password as "Avinash@2677"
    And i click login
    Then i should see employee module
    When i click emplogout
    Then i should see login page
    When i close browser
    
    @tag2
  Scenario Outline: Check Employee Login with invalid credentials
    Given i open browser with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "<username>"
    And i enter password as "<password>"
    And i click login
    Then i should see error message
    When i close browser

    Examples: 
      |username    | password| 
      | Avinash2222|   Qedge |
      | Admin 	   |    xyz  | 
      |  acb       |    xyz  |
      |						 |				 |

 
