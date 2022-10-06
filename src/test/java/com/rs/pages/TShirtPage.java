package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TShirtPage extends BasePage {


    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement TShirtButton;

    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[1]")
    public WebElement FadedShortSleeveTShirt;

    @FindBy(xpath ="//span[text()='More']" )
    public  WebElement moreButton;
    @FindBy(id = "quantity_wanted")
    public WebElement quantity;
    //@FindBy(id = "layered_id_attribute_group_2")
    //public WebElement MSize;
    @FindBy(id = "group_1")
    public WebElement size;
    @FindBy(xpath = "//a[@name='Blue']")
    public WebElement color;

    @FindBy(xpath = "//a[@class='product_img_link']")
    public WebElement hoverTShirt;
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToChart;

    //a[contains(@class,'button ajax_add_to_cart')]//span[text()='Add to cart']

    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement DressButton;


    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    public WebElement eveningDress;

    @FindBy(xpath = "//a[@class='product_img_link']")
    public WebElement hoverprintedDress;

    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement SSize;

    @FindBy(id = "layered_id_attribute_group_7")
    public WebElement BeigeColor;
    @FindBy(xpath = "(//li[@class='last'])[1]")
    public WebElement summerDress;
    @FindBy(xpath = "(//a[@title='Printed Summer Dress'])[1]")
    public WebElement hoverSummerDresses;


    @FindBy(xpath = "//input[@id='layered_id_attribute_group_13']")
    public WebElement OrangeColor;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public WebElement proceedCheckout;

    @FindBy(xpath = "(//td[@class='cart_delete text-center'])[2]")
    public WebElement removePrintedDress;

    @FindBy(xpath = "(//i[@class='icon-plus'])[1]")
    public WebElement addButton1;

    @FindBy(id = "total_price")
    public WebElement totalPrize;
    @FindBy(id = "total_product_price_1_1_0")
    public WebElement TshirtPrize;
    @FindBy(id = "total_product_price_5_19_0")
    public WebElement PSummerDressPrize;

   // @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    //public WebElement TShirtButton;

   // @FindBy(xpath = "//a[@class='product_img_link']")
    //public WebElement hoverTShirt;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement quantityBox;

    @FindBy(xpath = "//a[contains(@class,'button ajax_add_to_cart')]//span[text()='Add to cart']")
    public WebElement addToCartButton1;

    @FindBy(css = "#add_to_cart>button")
    public WebElement addToCartButton;



    @FindBy(xpath = "//h2[contains(.,'successfully added')]")
    public WebElement successMessage;



    public void selectColor(String colorName) {
        WebElement color = Driver.getDriver().findElement(By.cssSelector("a[name='" + colorName + "']"));
        color.click();
    }
    public void selectSize(String sizeName) {
        WebElement size = Driver.getDriver().findElement(By.cssSelector("#group_1"));
        Select select = new Select(size);
        select.selectByVisibleText(sizeName);
}}