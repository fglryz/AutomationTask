package com.rs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchingPage  extends  BasePage{


    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement TShirtButton;

    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[1]")
    public WebElement FadedShortSleeveTShirt;

   @FindBy(id = "layered_id_attribute_group_2")
    public WebElement MSize;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_14']")
    public WebElement BlueColor;

    @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default'] ")
    public WebElement addChartButton;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = " (//a[contains(text(),'Dresses')])[1]")
    public WebElement DressButton;


@FindBy(xpath = "(//a[contains(text(),'Evening Dresses')])[1]")
    public WebElement eveningDress;

    @FindBy(xpath = "(//a[contains(text(),'Evening Dresses')])[1]")
    public WebElement printedDress;

    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement SSize;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_7']")
    public WebElement BeigeColor;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_13']")
    public WebElement OrangeColor;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public WebElement proceedCheckout;

    @FindBy(xpath = "//i[@class='icon-trash']")
    public WebElement removeButton;
    @FindBy(xpath = "//i[@class='icon-plus']")
    public WebElement addButton;












}
