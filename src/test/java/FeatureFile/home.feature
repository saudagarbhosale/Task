Feature: Tendable Tech Challenge

  Scenario: Confirm accessibility of the top-level menus
    Given Open the browser with application
    When user landing on homepage
    Then verify on homepage and Request a Demo
    And verify user can access Our Story	menu Request a Demo
    And verfiy user can access Our Solution menu Request a Demo
    And verify user can access Why Tendable menu Request a Demo

  Scenario: Validate error massage
    Given Open the browser with application
    When nevigate to the Contact Us section and choose Marketing
    Then complete marketing for with required details exclude massage field submite form
      | fullName | orgName  | PhoneNo    | Email         |
      | saudagar | saudagar | 7748758575 | abc@gmail.com |
    And verify error massage
