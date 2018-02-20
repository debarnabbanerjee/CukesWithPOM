Feature: testing Login Test Case

  Scenario Outline: Creating a new account
    Given I am not authenticated
    When I go to Login page
    And I fill in "user_email" with "<email>"
    And I fill in "user_password" with "<password>"
    And I press "Sign up"
    Then I should see "logged in as <email>"

    Examples:
      | email            | password   |
      | testing@xyz.com  | secretpass |
      | testing2@xyz.com | fr33z3     |