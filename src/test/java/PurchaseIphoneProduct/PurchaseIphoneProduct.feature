Feature: Validate purchasing an iphone product
  Scenario: Adding to iphone product to Cart
    Given User opens vodafone eshop Home Page
    And User Choose English Language
    When User selects iphone products
    And User added a product to basket
    And User Checkout
    And User entered Address
    And User entered personal info
    Then Product is placed successfully