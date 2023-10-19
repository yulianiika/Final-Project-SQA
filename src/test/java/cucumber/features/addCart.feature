Feature: Add product to cart

  @Regression @Positive
  Scenario: User can add product to cart
    Given Success login in web
    When select the product to add to the cart
    And tap Add to Cart button
    Then CheckOut page

  @Regression @Negative
  Scenario: User can add product to cart more than one
    Given Success login in web
    When add more than one product
    And tap Add to Cart button
    Then CheckOut page