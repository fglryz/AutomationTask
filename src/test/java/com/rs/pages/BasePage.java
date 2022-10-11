package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {




    @FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
    public WebElement summerDressesSubTab;


    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }













}
