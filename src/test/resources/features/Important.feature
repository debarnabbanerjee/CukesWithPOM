Feature: Booking a Garment for Woman First Feature

  @important
  Scenario Outline: Test to validate the correct UI functioning of the Woman Cloth Booking Page

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
      | Values |
      | S (7)  |
      | M (7)  |
      | L (7)  |
      #| XXL (8) |

    Then In the Woman Page I can see the following under "Color":
      | Values     |
      | Beige (1)  |
      | White (2)  |
      | Black (2)  |
      | Orange (3) |
      | Blue (2)   |
      | Green (1)  |
      | Yellow (3) |
      | Pink (1)   |
    #  | light blue |

    Then In the Woman Page I can see the following under "Compositions":
      | Values        |
      | Cotton (3)    |
      | Viscose (2)   |
      | Polyester (2) |
      | Bad           |

    Examples:
      | email                       | password     | browser | loginInName |
      | debarnab.banerjee@gmail.com | California0! | chrome  | Deb Bane    |
      | debarnab.banerjee@gmail.com | California0! | edge    | Deb Bane    |

  @important
  Scenario Outline: Test to validate the purchase of Items from the Woman Page

    Given I open Browser using "<browser>"
    When I navigate to the base Url
    And I click on Sigin Link
    And I enter userName and Password as "<email>" and "<password>"
    Then I should see logged in as "<loginInName>"
    And In the Home Page I click on "Woman" section

    Then I want to see the item with name "<itemName>"
    Examples:
      | email                       | password     | browser | loginInName | itemName              | payementConfirmationText                                                    | orderConfirmationMessage                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
      | debarnab.banerjee@gmail.com | California0! | chrome  | Deb Bane    | Printed Chiffon Dress | You have chosen to pay by bank wire. Here is a short summary of your order: | Your order on My Store is complete.Please send us a bank wire with  - Amount $(\\d+)\\.(\\d+)  - Name of account owner Pradeep Macharla  - Include these details xyz  - Bank name RTP  - Do not forget to insert your order reference TOCYTIOTT in the subject of your bank wire.  An email has been sent with this information. Your order will be sent as soon as we receive payment. If you have questions, comments or concerns, please contact our expert customer support team. |
      | debarnab.banerjee@gmail.com | California0! | firefox | Deb Bane    | Printed Chiffon Dress | You have chosen to pay by bank wire. Here is a short summary of your order: | Your order on My Store is complete.Please send us a bank wire with  - Amount $(\\d+)\\.(\\d+)  - Name of account owner Pradeep Macharla  - Include these details xyz  - Bank name RTP  - Do not forget to insert your order reference TOCYTIOTT in the subject of your bank wire.  An email has been sent with this information. Your order will be sent as soon as we receive payment. If you have questions, comments or concerns, please contact our expert customer support team. |
