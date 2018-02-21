Feature: testing Login Test Case

  Scenario Outline: Creating a new account
    Given I open Browser using "<browser>"
    When I navigate to the base Url
    And I click on Sigin Link
    And I enter userName and Password as "<email>" and "<password>"
    Then I should see logged in as "<loginInName>"
    And I exit browser

    Examples:
      | email                       | password     | browser | loginInName |
      | debarnab.banerjee@gmail.com | California0! | chrome  | Deb Bane    |
      | abc@test.com                | 145879       | chrome  | Deb Bane    |
