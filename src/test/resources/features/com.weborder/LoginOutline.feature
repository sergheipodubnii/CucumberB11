@smokeLoginTest
Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

  Scenario: Validation of WebOrder Login Positive Scenario
    When THE USER provides credentials
    Then the user is on the home page

  Scenario Outline: Validation of WebOrder Login Negative Scenarios
    When the user provides wrong "<username>" and "<password>"
    Then the user validates the "<errormessage>" error message
    Examples:
      | username              | password        | errormessage   |
      | ahmet                 | techtorial      | Sign in Failed |
      | tech                  | sdfsfs983403}   | Sign in Failed |
      | batch                 | eleven          | Sign in Failed |
      | $sdsdf                | torial          | Sign in Failed |
      | serghei               | torial          | Sign in Failed |
      | guest1@microworks.com | wrongpassword   | Sign in Failed |
      | 9786###               | torial          | Sign in Failed |
      | wrongusername         | Guest1!         | Sign in Failed |
      |                       |                 | Sign in Failed |
      | @gggfdg               | sdsd.@gmail.com | Sign in Failed |
