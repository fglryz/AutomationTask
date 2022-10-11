package com.rs.pages;

import com.rs.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummaryPage extends BasePage {

    @FindBy(xpath = "//a[contains(.,'Proceed')]")
    public WebElement proceedButton;


    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement SecondProceedButton;


}
