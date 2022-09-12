package com.rs.pages;

import com.rs.utilities.BrowserUtils;
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

    @FindBy(xpath="//div[@id='terminalNodeFilter-accordion-title-0']")
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

    @FindBy(xpath="//*[contains(text(),'MPN')]")
    public WebElement mpn;

    @FindBy(css="span.search-term")
    public WebElement topMatching;

    @FindBy(xpath="(//span[@class='name_20C8Bnnw'])[1]")
    public WebElement box;

    @FindBy(xpath="//div[@id='terminalNodeFilter-accordion-title-3']")
    public WebElement size;

    @FindBy(xpath="(//*[contains(text(),'109')])[1]")
    public WebElement sizeOpt ;

    @FindBy(xpath="//div[@data-qa='product-tile-title']")
    public WebElement product ;

    @FindBy(xpath="//*[contains(text(),'Number of Poles')]")
    public WebElement poles ;

    @FindBy(xpath="(//p[@class='sc-csuQGl hpLYIn'])[1]")
    public WebElement abb ;

    @FindBy(xpath="(//p[@class='sc-csuQGl hpLYIn'])[101]")
    public WebElement firstOption;

    @FindBy(xpath = "//div[@data-qa='applied-filter-panel-body-4294957372']")
    public WebElement verifyABB;

    @FindBy(xpath = "//div[@data-qa='applied-filter-panel-body-4294885776']")
    public WebElement verify1;




    public void clickOnBrandTwo() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        if (popUp.isDisplayed()){
            popUp.click();
            brand.click();
        } else if (!(popUp.isDisplayed())) {
            brand.click();
        }
    }


    public void polesMethod() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", poles);
        firstOption.click();
        BrowserUtils.waitFor(1);

    }


    public void clickOnSize() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        if (popUp.isDisplayed()){
            popUp.click();
            brand.click();
        } else if (!(popUp.isDisplayed())) {
            size.click();
        }
    }

    public void sizeOpt() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", brand);
        size.click();
        BrowserUtils.waitFor(1);
        sizeOpt.click();
    }



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