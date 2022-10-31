package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {


    public LoginPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='hidden-visually']")
    public WebElement dashboardTestboxes;

    @FindBy(name = "user")
    public WebElement inputEmployeeUsername;

    @FindBy(name = "password")
    public WebElement inputEployeePassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[1]/a")
    public WebElement dashboard;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginEnterButton;

    // @FindBy(xpath = "//*[@id=\"appmenu\"]/li[1]/a")
    //public WebElement dashboardPage;

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement iconButton;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement underProfile;

    @FindBy(name = "user")
    public WebElement invalidUserName;

    @FindBy(name = "password")
    public WebElement invalidUserPassword;

    @FindBy(xpath = "//*[@id=\"body-login\"]/div[1]/div/main/div/div/form/fieldset/p[3]")
    public WebElement errorMessage;

    @FindBy(name = "user")
    public WebElement blankUserName;

    @FindBy(name = "password")
    public WebElement realPassword;

    @FindBy(xpath = "//label[@for='user']")
    public WebElement blankErrorMessage1;


    @FindBy(name = "user")
    public WebElement realUserName;

    @FindBy(name = "password")
    public WebElement blankPassword;


}




/**
 * No parameters.
 * When we call this method, it will directly login using
 * <p>
 * Username: Test
 * Password: Tester
 */




/*

 */