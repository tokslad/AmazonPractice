Feature: Registration

  Scenario: Valid Registration
    Given I navigate to Amazon site
    And I click on Hello, Sign in
    And I click create your amazon account
    When I enter name
    And I enter email
    And I enter password
    And I re-enter password
    Then I click on create account
    And I confirm that Verify e-mail address is displayed
    Then I close my window



