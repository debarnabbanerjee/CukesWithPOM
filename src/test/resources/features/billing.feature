Feature: Billing
  @billing
  Scenario Outline: Billing scenario 1
    Given I open Browser using "<browser>"
    When I navigate to the base Url
    And I click on Sigin Link
    And I enter userName and Password as "<email>" and "<password>"
    Then I should see logged in as "<loginInName>"

    Examples:
      | email                       | password     | browser | loginInName |
      | debarnab.banerjee@gmail.com | California0! | chrome  | Deb Bane    |
      | abc@test.com                | 145879       | edge  | Deb Bane    |
  @billing
  Scenario Outline: Billing scenario 2
    Given I open Browser using "<browser>"
    When I navigate to the base Url
    And I click on Sigin Link
    And I enter userName and Password as "<email>" and "<password>"
    Then I should see logged in as "<loginInName>"

    Examples:
      | email                       | password     | browser | loginInName |
      | debarnab.banerjee@gmail.com | California0! | chrome  | Deb Bane    |
      | abc@test.com                | 145879       | firefox  | Deb Bane    |
