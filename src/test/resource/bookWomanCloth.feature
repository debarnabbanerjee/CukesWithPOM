Feature: Booking a Garment for Woman

  Scenario Outline: Test to validate the correct functioning of the Woman Cloth Booking Page

    Given I open Browser using "<browser>"
    When I navigate to the base Url
    And I click on Sigin Link
    And I enter userName and Password as "<email>" and "<password>"
    Then I should see logged in as "<loginInName>"
    And In the Home Page I click on "Woman" section
    Then In the Woman Page I can see the following under "Categories":
      | Values      |
      | Tops (2)    |
      | Dresses (5) |

    Then In the Woman Page I can see the following under "Size":
      | Values  |
      | S (7)   |
      | M (7)   |
      | L (7)   |
      | XXL (8) |

#      | Size         | S         |
#      | Size         | M         |
#      | Size         | L         |
#      | Color        | Beige     |
#      | Color        | White     |
#      | Color        | Black     |
#      | Color        | Orange    |
#      | Color        | Blue      |
#      | Color        | Green     |
#      | Color        | Yellow    |
#      | Color        | Pink      |
#      | Compositions | Cotton    |
#      | Compositions | Polyester |
#      | Compositions | Viscose   |
#      | Styles       | Cotton    |
#      | Styles       | Polyester |
#      | Styles       | Viscose   |










    Examples:
      | email                       | password     | browser | loginInName |
      | debarnab.banerjee@gmail.com | California0! | chrome  | Deb Bane    |
      #| abc@test.com                | 145879       | chrome  | Deb Bane    |


