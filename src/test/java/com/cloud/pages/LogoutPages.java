package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPages {

    public LogoutPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(xpath = "//h1[@class='hidden-visually']")
   // public WebElement dashboardTestboxes;

@FindBy(xpath = "//img[@src='/index.php/avatar/Employee73/32?v=0']")
    public WebElement iconButton;


    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement underIconButton;


    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logoutButton;


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

