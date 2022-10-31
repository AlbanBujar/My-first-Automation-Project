package com.cloud.step_definitions;

import com.cloud.pages.LogoutPages;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logoutStepDefinition {

    LogoutPages LogoutPages = new LogoutPages();
    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/dashboard/");


        System.out.println("User is on the dashboard page");

    }
    @Given("user is able to see  profile icon")
    public void user_is_able_to_see_profile_icon() {
        LogoutPages.iconButton.isDisplayed();
    }
    @When("user should be see under profile ican")
    public void user_should_be_see_under_profile_ican() {
        LogoutPages.underIconButton.isDisplayed();


    }
    @When("user clicks to logout button")
    public void user_clicks_to_logout_button() {
        LogoutPages.logoutButton.click();

    }

    @Then("user shouldn`t be able see` to go to dashboard again")
    public void user_shouldn_t_be_able_see_to_go_to_dashboard_again() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user shouldn`t be able see` to go to dashboard again {string}")
    public void user_shouldn_t_be_able_see_to_go_to_dashboard_again(String pageTitle) {
        Assert.assertEquals(pageTitle, Driver.getDriver().getTitle());
        Driver.getDriver().navigate().back();

        System.out.println(pageTitle);


    }


}
