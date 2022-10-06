package com.rs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerDressPage extends BasePage{
    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesTab;

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
    public WebElement summerDresses;

    @FindBy(xpath = "//a[@class='product_img_link']")
    public WebElement hoverPrintedSummerDress;
    @FindBy(id = "quantity_wanted")
    public WebElement quantity;
    @FindBy(id = "group_1")
    public WebElement size;
    @FindBy(xpath = "//a[@name='Orange']")
    public WebElement dressColor;
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToChart;


}
