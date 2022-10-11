package com.rs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BasePage {

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

}
