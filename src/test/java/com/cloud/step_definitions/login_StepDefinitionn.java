
package com.cloud.step_definitions;

import com.cloud.pages.LoginPages;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class login_StepDefinitionn {


    LoginPages LoginPages = new LoginPages();

    @Given("user is on the trycloud login page")
    public void user_is_on_the_trycloud_login_page() {


        Driver.getDriver().get("https://qa.trycloud.net/index.php/login?clear=1");


        System.out.println("User is on the page");
    }

    @Given("user is able to see username and pasword textboxes")
    public void userIsAbleToSeeUsernameAndPaswordTextboxes() {

        LoginPages.dashboardTestboxes.isDisplayed();


    }
    @When("user enters employee username")
    public void user_enters_employee_username() {

        LoginPages.inputEmployeeUsername.sendKeys("Employee73");

        //pagename.isim.sendKeys("");


    }

    @When("user enters employee password")
    public void user_enters_employee_password() {

        LoginPages.inputEployeePassword.sendKeys("Employee123");


    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {

        LoginPages.loginButton.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        String expectedTitle = "Dashboard - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @And("user hit the enter on the keyboard")
    public void userHitTheEnterOnTheKeyboard() {

        LoginPages.loginEnterButton.sendKeys(Keys.ENTER);
    }

    //@When("user is on dashboard page")
  //  public void userIsOnDashboardPage() {

       // LoginPages.dashboardPage.isDisplayed();
   // }
    @And("user clicks to profile icon")
    public void userClicksToProfileIcon() {

        LoginPages.iconButton.click();
    }

    @Then("user should see the under profile icon username")
    public void userShouldSeeTheUnderProfileIconUsername() {

        LoginPages.underProfile.isDisplayed();

        System.out.println("User should see be able to Under Profile");
    }

    @When("user enters invalid employee username")
    public void user_enters_invalid_employee_username() {
        LoginPages.invalidUserName.sendKeys("Employee1111");

    }
    @When("user enters invalid employee password")
    public void user_enters_invalid_employee_password() {
        LoginPages.invalidUserPassword.sendKeys("Employee1234");

    }
    @Then("user should be get error message")
    public void user_should_be_get_error_message() {
        LoginPages.errorMessage.isDisplayed();

    }

    @When("user lefts as blank  username")
    public void user_lefts_as_blank_username() {
        LoginPages.blankUserName.sendKeys("");
    }
    @When("user enters  employeeReal password")
    public void user_enters_employee_real_password() {
        LoginPages.realPassword.sendKeys("Employee123");

    }
    @Then("user should be see Please fiil out this field")
    public void user_should_be_see_please_fiil_out_this_field() {
        LoginPages.blankErrorMessage1.isDisplayed();

    }

    @When("user enters  realEmployee   username")
    public void user_enters_real_employee_username() {
        LoginPages.realUserName.sendKeys("Employee73");
    }

    @When("user lefts as blank password")
    public void user_lefts_as_blank_password() {
        LoginPages.blankPassword.sendKeys("");
    }




}


    /**
     * This method will accept two arguments and login.
     * @param username
     * @param password
     */
//public void login(String username, String password){
//  inputUsername.sendKeys(username);
// inputPassword.sendKeys(password);
// loginButton.click();