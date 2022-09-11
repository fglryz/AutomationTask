package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilteringPage {

    public FilteringPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='searchBarTextInput']")
    public WebElement searchBox;

    @FindBy(xpath = "(//a[@class='card_KqPyHJul top-category-card'])[1]")
    public WebElement adhesive;

    @FindBy(xpath = "//button[@class='Box-sc-1a4tiu7-0 Flex-sc-ftxd62-0 SearchBar__SearchBarSubmitButton-sc-okj0vs-1 fkPizT']")
    public WebElement enter;

    @FindBy(id = "terminalNodeFilter-accordion-title-0")
    public WebElement brand;

    @FindBy(xpath = "//*[contains(text(),'Raytech')][1]")
    public WebElement raytech;

    @FindBy(xpath = "(//span[.='Apply filters'])[1]")
    public WebElement applyFilters;

    @FindBy(xpath = "(//td)[1]//following-sibling::td[1]")
    public WebElement brandName;

    @FindBy(xpath = "(//td)[1]//following-sibling::td[2]")
    public WebElement adhesiveType;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement popUp;

    @FindBy(xpath = "//span[.='CLEAR ALL']")
    public WebElement clearFilter;


    public void clickOnBrand() {

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

            if (popUp.isDisplayed()){
                popUp.click();
                brand.click();
            } else if (!(popUp.isDisplayed())) {
                brand.click();
            }
        }


    public void clickonRaytech() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", raytech);
        raytech.click();
    }

    public void applyFilter() {
        applyFilters.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(clearFilter));


    }
}