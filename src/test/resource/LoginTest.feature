Feature: testing Login Test Case

  Scenario Outline: Creating a new account
    Given I open Browser using "<browser>"
    When I go to Login page
    And I fill in "user_email" with "<email>"
    And I fill in "user_password" with "<password>"
    And I press "Sign up"
    Then I should see "logged in as <email>"
    And I exit browser

    Examples:
      | email            | password   | browser |
      | testing@xyz.com  | secretpass | chrome  |
      | testing2@xyz.com | fr33z3     | chrome  |