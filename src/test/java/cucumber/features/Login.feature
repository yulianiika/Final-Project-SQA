Feature: Login web

  @Regression @Positive
  Scenario: Success login
    Given open link in browser
    When input registered username
    And input registered password
    And tap Login button
    Then open dashboard page

  @Regression @Negative
  Scenario: Failed login
    Given open link in browser
    When input a unregistered user
    And input registered password
    And tap Login button
    Then User get error

  @TDD
  Scenario Outline: User login
    Given I open link in browser
    When I input <username> as username
    And I input <password> as password
    And I tap Login button
    Then I Verify <status> login result

    Examples:
      |username |password | status|
      |standard_user|secret_sauce|success|
      |performance_glitch_user|secret_sauce|success|
      |standard_user|secret_sauce1|failed|
      |standard_user1|secret_sauce|failed|
      |standard_user1||failed|
      ||1234|failed|
      |||failed|
      |ika|secret_sauce|failed|
      |ika|ika|failed|