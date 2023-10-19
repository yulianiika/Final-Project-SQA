Feature: Checkout

  @Regression @Positive
  Scenario: Checkout one item
    Given Add to carta
    When Klik Checkout
    Then user on Address page

  @Regression @Negative
  Scenario: Checkout zero item
    Given Add to cartb
    When Klik Checkout
    Then user on Address page

  @Regression @Positive
  Scenario: Checkout more than one item
    Given Add to cartc
    When Klik Checkout
    Then user on Address page