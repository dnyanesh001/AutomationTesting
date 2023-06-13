Feature: This feature contains valid login test for Vtiger

  Background: 
    Given User has a valid application URL "https://demo.vtiger.com/vtigercrm/index.php"
    And User hits a login page url
    And Enter the user name as "admin"
    And Enter the password as "Test@123"
    And Click on Signin button

  Scenario: Verify user is able to login in the application with valid credentinal
    Then User should reach to home page with title "Dashboard"
    And close the browser for vtiger

  Scenario: Verify user is able to logout from the application
    When click on profile symbol
    And click on sign out link
    Then User should able to navigate back to login page with title "vtiger"
    And close the browser for vtiger
