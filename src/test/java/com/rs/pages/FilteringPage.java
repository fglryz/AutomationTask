package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilteringPage {

    public FilteringPage () {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@id='searchBarTextInput']")
    public WebElement  searchBox;

    @FindBy(xpath = "(//a[@class='card_KqPyHJul top-category-card'])[1]")
    public WebElement adhesive;

    @FindBy(xpath ="//button[@id='btnSearch']")
    public WebElement enter;

    @FindBy(xpath = "//div[@id='terminalNodeFilter-accordion-title-0']")
    public WebElement brand ;

    @FindBy(xpath = "//p[.='GORILLA GLUE EUROPE LTD']")
    public WebElement gorillaGlue;

    @FindBy(xpath = "(//span[.='Apply filters'])[2]")
    public WebElement applyFilters;

    @FindBy(xpath = "(//td)[1]//following-sibling::td[1]")
    public WebElement brandName;

    @FindBy(xpath = "(//td)[1]//following-sibling::td[2]")
    public WebElement adhesiveType;


}
