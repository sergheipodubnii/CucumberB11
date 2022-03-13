Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigates to the WebOrder website
  @smoke  @regression @ahmet
  Scenario: Validation of WebOrder Login Positive Scenario
  #  Given the user navigates to the WebOrder website
    When THE USER provides credentials
    Then the user is on the home page

    Scenario: Validation of WebOrder Login Negative Scenario 1
    #  Given the user navigates to the WebOrder website
      When the user provides correct username and wrong password
      Then the user validates the "Sign in Failed" error message

  Scenario: Validation of WebOrder Login Negative Scenario 2
   # Given the user navigates to the WebOrder website
    When the user provides wrong "fdsfdsf" and "dsfsdfjs"
    Then the user validates the "Sign in Failed" error message

    #last scenario 3 should be provided empty for both
  #and validate the same message.
@smoke @regression  @tc1
  Scenario: Validation of WebOrder Login Negative Scenario 3
   # Given the user navigates to the WebOrder website
    When the user provides empty "" and ""
    Then the user validates the "Sign in Failed" error message

