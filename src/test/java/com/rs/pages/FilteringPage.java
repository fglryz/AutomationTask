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

    @FindBy(xpath ="//button[@class='Box-sc-1a4tiu7-0 Flex-sc-ftxd62-0 SearchBar__SearchBarSubmitButton-sc-okj0vs-1 fkPizT']")
    public WebElement enter;

    @FindBy(xpath = "//div[@id='terminalNodeFilter-accordion-title-0']")
    public WebElement brand ;

    @FindBy(xpath = "//p[contains(text(),'GORILLA GLUE EUROPE LTD')]")
    public WebElement gorillaGlue;

    @FindBy(xpath = "(//span[.='Apply filters'])[2]")
    public WebElement applyFilters;

    @FindBy(xpath = "(//td)[1]//following-sibling::td[1]")
    public WebElement brandName;

    @FindBy(xpath = "(//td)[1]//following-sibling::td[2]")
    public WebElement adhesiveType;


}
