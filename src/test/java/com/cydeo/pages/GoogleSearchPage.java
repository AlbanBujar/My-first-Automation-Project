package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {



    //create constructor
    //initialize the driver instance and this class instance using PageFactory.initElements
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //We can start locating web elements using @FindBy annotation

//   WebElement cookiesButton = Driver.getDriver().findElement(By.xpath("//div[text()='Accept all']"));
//   cookiesButton.

    @FindBy(xpath = "//div[text()='Accept all']")
    public WebElement cookiesButton;

    // Accep Quikes icin yazdim ama click butonunu bulamadim.

    @FindBy(name = "q")
    public WebElement searcBox;
    //    public WebElement capitalElement(String capital){
    //        return Driver.getDriver().findElement(By.linkText(capital));
    //




}
