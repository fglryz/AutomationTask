package com.rs.pages;


import com.rs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PrintedSummaryPage extends BasePage {

    @FindBy(css = "#add_to_cart>button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//h2[contains(.,'successfully added')]")
    public WebElement successMessage;

    @FindBy(xpath = "//a[contains(.,'Proceed')]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//input[@class='text']")
    public WebElement quantityBox;


    public void selectColor(String colorName) {
        WebElement color = Driver.getDriver().findElement(By.cssSelector("a[name='" + colorName + "']"));
        color.click();
    }


    public void selectSize(String sizeName) {
        WebElement size = Driver.getDriver().findElement(By.cssSelector("#group_1"));
        Select select = new Select(size);
        select.selectByVisibleText(sizeName);
    }

}
