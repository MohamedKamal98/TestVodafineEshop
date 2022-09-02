Feature: Validate purchasing an iphone product
  Scenario Outline: Adding to iphone product to Cart
    Given User opens vodafone eshop Home Page
    And User chooses English Language
    And User selects iphone products
    When User added a product to basket
    And User Checkout
    And User entered Address
    And User entered personal info
    Then Product is placed successfully
    Examples:
      |  |