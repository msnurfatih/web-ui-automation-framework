Feature: Login

  @valid-login
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @invalid-login
  Scenario: Login using invalid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid"
    When user click login button
    Then user able to see error message

  @empty-username
  Scenario: Login using empty username
    Given user is on login page
    And user input username with ""
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message

  @long-username
  Scenario: Login using very long username
    Given user is on login page
    And user input very long username
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message
