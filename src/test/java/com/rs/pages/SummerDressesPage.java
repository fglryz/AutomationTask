package com.rs.pages;

import com.rs.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SummerDressesPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
   // @FindBy(partialLinkText = "Printed Summer Dress")
    public WebElement summerDresses;

}
