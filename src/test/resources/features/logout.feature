@CLOUD-1358
Feature: TryCloud app logout feature
  User Story:
  As a user, I should be able to click logout button


  Account: Employee1

  Background: For the scenarios in the feature file, user is expected to be on under profile
    Given user is on the dashboard page

  @CLOUD-1356
  Scenario: Logout button click
    Given user is able to see username and pasword textboxes
    When user enters employee username
    And user enters employee password
    And user clicks to login button
    Given user is able to see  profile icon
    When user clicks to profile icon
    And user should be see under profile ican
    And user clicks to logout button
    Then user is on the trycloud login page


  @CLOUD-1357
  Scenario: Navigate back click
    Given user is able to see username and pasword textboxes
    Then user shouldn`t be able see` to go to dashboard again