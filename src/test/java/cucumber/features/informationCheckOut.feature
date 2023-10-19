Feature: Information Check Out

  @Regression @Positive
  Scenario: Inform Checkout 1 item
    Given Checkouta
    When Input Your Information
    And klik Continue button
    Then user on Overview page

  @Regression @Negative
  Scenario: Inform Checkout = 0 item
    Given Checkoutb
    When Input Your Information
    And klik Continue button
    Then user on Overview page

  @Regression @Positive
  Scenario: Inform Checkout > 1 item
    Given Checkoutc
    When Input Your Information
    And klik Continue button
    Then user on Overview page