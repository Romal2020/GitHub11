@login @spring2
Feature: login

  Background: 
    Given I open browser and navigate to SyntaxHrms#precondition

  @tag1
  Scenario: validate positive login functionality
    When I enter username
    And I enter password
    And I click on Login button
    Then I successfully login SyntaxHrm

  @regression
  Scenario Outline: Validate error messages with Negative Login
    When I enter username <username>
    When I enter password <password>
    And I click on Login button
    Then I verify the <errMsg> in step

    Examples: 
      | username | password    | status              |
      | Admin    | Hum@nhrm123 | success             |
      | Admi     | Hum@nhrm123 | Invalid credentials |
