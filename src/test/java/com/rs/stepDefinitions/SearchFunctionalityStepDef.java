package com.rs.stepDefinitions;


import com.rs.pages.TShirtPage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.ConfigurationReader;
import com.rs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchFunctionalityStepDef {
    TShirtPage tShirtPage = new TShirtPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("the user navigates to main page")
    public void theUserNavigatesToMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User clicks {string} tab")
    public void userClicksTab(String arg0) {
        tShirtPage.TShirtButton.click();
        BrowserUtils.sleep(10);
    }
    @And("User hovers over Faded Short Sleeve T Shirt")
    public void userHoversOverFadedShortSleeveTShirt() {
        BrowserUtils.hover(tShirtPage.hoverTShirt);

    }
    @When("User adds MORE button")
    public void userAddsMOREButton() {
        tShirtPage.moreButton.click();
        BrowserUtils.sleep(10);
    }
    @And("selects one, M and Blue of the T-Shirt")
    public void selectsOneMAndBlueOfTheTShirt() {
        tShirtPage.quantity.clear();
        BrowserUtils.sleep(10);
       tShirtPage.quantity.sendKeys("1");
        BrowserUtils.sleep(10);
        Select select=new Select(tShirtPage.size);
        BrowserUtils.sleep(10);
        select.selectByVisibleText("M");
        BrowserUtils.sleep(10);
        tShirtPage.color.click();



    }
    @When("User clicks the add to cart button")
    public void userClicksTheAddToCartButton() {
        tShirtPage.addToChart.click();
    }
    @And("User clicks continue shopping button")
    public void userClicksContinueShoppingButton() {
        tShirtPage.continueShoppingButton.click();
    }




    @When("User clicks Dress button")
    public void userClicksDressButton() {
        tShirtPage.DressButton.click();
        BrowserUtils.sleep(10);

    }

    @When("User clicks Evening Dress")
    public void userClicksEveningDress() {
        BrowserUtils.sleep(5);
       tShirtPage.eveningDress.click();
        BrowserUtils.sleep(15);
    }

    @When("User clicks the S size")
    public void userClicksTheSSize() {
        tShirtPage.SSize.click();
        BrowserUtils.sleep(10);

    }

    @When("User clicks the Beige colour")
    public void userClicksTheBeigeColour() {
        tShirtPage.BeigeColor.click();
        BrowserUtils.sleep(10);
    }



}


