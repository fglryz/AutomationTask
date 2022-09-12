package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//button[@id='ensCloseBanner']")
        public WebElement bannerAcceptAllButton;

        @FindBy(xpath = "//a[@title='Contactors']")
        public WebElement Contactors;

        @FindBy(xpath = "(//div[@data-testid='add-to-basket-success-cart'][1])")
        public WebElement cart;


        //--------------------------- Contractors --------------------------//

        @FindBy(xpath = "(//div[@data-qa='product-tile-title'])[1]")
        public WebElement firstProductOnThePage;

        @FindBy(xpath = "(//button[@class='src__Component-sc-tb89nx-0 kFKHVW src__ButtonStyle-sc-1r3bpf8-0 eNNVSE'])[1]")
        public WebElement firstProductOnThePageButton;

        //--------------------------- Give Feed Back --------------------------//

        @FindBy(xpath = "//button[@class='fsrButton fsrButton__inviteDecline fsrDeclineButton']")
        public WebElement noThanks;


        //--------------------------- Inside Cart --------------------------//
        @FindBy(xpath = "//div[@data-testid='Product__description']")
        public WebElement inCartFirstProduct;

        //-----------------------------------

       @FindBy(css="#desktop-browse-icon")
       public WebElement browseOption;


       @FindBy(xpath="//button[@class='BrowseResultsDesktop__Button-sc-hxg8c3-8 BrowseResultsDesktop__BookButton-sc-hxg8c3-9 AcyoR']")
       public WebElement electricalAutomation;

       @FindBy(xpath="//button[@class='BrowseResultsDesktop__Button-sc-hxg8c3-8 gDOlQr']")
       public WebElement automationControl;

       @FindBy(xpath="//a[.='Contactors & Auxiliary Contacts']")
       public WebElement contactorsAuxilary;

       @FindBy(xpath = "//div[.='Contactors']")
        public WebElement contactors2;

   //-----------------------------------------

    @FindBy(xpath = "//button[contains(text(),'Guest Checkout')]")
    public WebElement checkOut;

    @FindBy(xpath ="//span[contains(text(),'Secure checkout')]" )
    public WebElement secureCheckOut;







    }

