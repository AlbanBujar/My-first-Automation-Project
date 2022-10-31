@CLOUD-1354
Feature: TryCloud app login feature
  User Story:
  As a user, I should be able to login with correct credential
  account.

  Account: Employee1

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the trycloud login page

   @CLOUD-1348
  Scenario: Login as valid employee
     Given user is able to see username and pasword textboxes
    When user enters employee username
    And user enters employee password
     And user clicks to login button
    Then user should see the dashboard
     And user clicks to logout button
     Then user is on the trycloud login page


  # @CLOUD-1349
  Scenario: Login as valid employee enter key
  #  When user enters employee username
   # And user enters employee password
  #  And user hit the enter on the keyboard
    #Then user should see the dashboard
    # And user clicks to logout button
     #Then user is on the trycloud login page

  #@Icon
 # Scenario:  Trycloud Profile Icon Verification
   # When user is on dashboard page
    #And user clicks to profile icon
    #Then user should see the under profile icon username

   @CLOUD-1350
  Scenario: Login as invvalid employee
    # Given user is able to see username and pasword textboxes
   # When user enters invalid employee username
   # And user enters invalid employee password
   # And user clicks to login button
   # Then user should be get error message

   @CLOUD-1351
  Scenario: Login as blank employee name
    # Given user is able to see username and pasword textboxes
    #When user lefts as blank  username
   # And user enters  employeeReal password
    #And user clicks to login button
   # Then user should be see Please fiil out this field

  @CLOUD-1353
  Scenario: Login as blank employee pasword
    #Given user is able to see username and pasword textboxes
   # When user enters  realEmployee   username
    #And user lefts as blank password
   # And user clicks to login button
   # Then user should be see Please fiil out this field


#this is how we add comments in feature file
# (cucumberda yorum eklemek icin kullaniyoruz)