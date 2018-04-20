Feature: Booking a Garment for Woman

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
      | email | password | browser | loginInName |
      | debarnab.banerjee@gmail.com | California0! | phantom  | Deb Bane    |

  Scenario Outline: Test to validate the purchase of Items from the Woman Page

    Given I open Browser using "<browser>"
    When I navigate to the base Url
    And I click on Sigin Link
    And I enter userName and Password as "<email>" and "<password>"
    Then I should see logged in as "<loginInName>"
    And In the Home Page I click on "Woman" section

    Then I want to see the item with name "<itemName>"

#    And I hover on the item and validate the following:
#      | Field     | Values        |
#      | Name      | <itemName>    |
#      | Price     | IsNotNull     |
#      | AddToCart | itemDisplayed |
#
#    And I click Add To Cart for the item and validate the following:
#      | Field             | Values                                           |
#      | Header Text       | Product successfully added to your shopping cart |
#      | Name              | <itemName>                                       |
#      | Color,Size        | IsNotNull                                        |
#      | Quantity          | IsNotNull                                        |
#      | TotalPricePerItem | IsNotNull                                        |
#      | TotalProducts     | IsNotNull                                        |
#      | TotalShipping     | IsNotNull                                        |
#      | TotalForAllItems  | IsNotNull                                        |
#
#    Then I store the value of the Name,Color,Size,Quantity,TotalPricePerItem,TotalProducts,TotalShipping,TotalForAllItems for validation below
#
#    And I click on Proceed to Checkout
#
#    Then I validate that the followings value matches with the above stored ones:
#      | Field             | Values     |
#      | Name              | <itemName> |
#      | Color,Size        | IsNotNull  |
#      | Quantity          | IsNotNull  |
#      | TotalPricePerItem | IsNotNull  |
#      | TotalProducts     | IsNotNull  |
#      | TotalShipping     | IsNotNull  |
#      | TotalForAllItems  | IsNotNull  |
#
#    Then I validate the Invoice Address and Delivery Address Sections are present
#    And I click on Proceed to Checkout
#
#    Then I validate the Invoice Address and Delivery Address Sections are present
#    And I click on Proceed to Checkout
#    And I select Terms of Service and click check in the Shipping Page
#    Then I validate that the followings elements are displayed accordingly:
#      | Field             | Values     |
#      | Name              | <itemName> |
#      | Color,Size        | IsNotNull  |
#      | Quantity          | IsNotNull  |
#      | TotalPricePerItem | IsNotNull  |
#      | TotalProducts     | IsNotNull  |
#      | TotalShipping     | IsNotNull  |
#      | TotalForAllItems  | IsNotNull  |
#
#    Then I validate that the following two payement options are present in the page:
#      | Values           |
#      | Pay By Bank Wire |
#      | Pay By Check     |
#
#    And I click on "Pay By Bank Wire" as payement option
#    Then I validate that the "<payementConfirmationText>" is present in the Payement Page
#    And I click "I Confirm My Order" in the payement Page
#    Then In the Order Confirmation Page I validate the order confirmation message matches "<orderConfirmationMessage>"

    Examples:
      | email                       | password     | browser | loginInName | itemName              | payementConfirmationText                                                    | orderConfirmationMessage                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
   #   | debarnab.banerjee@gmail.com | California0! | phantom  | Deb Bane    | Printed Chiffon Dress | You have chosen to pay by bank wire. Here is a short summary of your order: | Your order on My Store is complete.Please send us a bank wire with  - Amount $(\\d+)\\.(\\d+)  - Name of account owner Pradeep Macharla  - Include these details xyz  - Bank name RTP  - Do not forget to insert your order reference TOCYTIOTT in the subject of your bank wire.  An email has been sent with this information. Your order will be sent as soon as we receive payment. If you have questions, comments or concerns, please contact our expert customer support team. |
