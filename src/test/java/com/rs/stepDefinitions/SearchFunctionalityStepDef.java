package com.rs.stepDefinitions;

import com.rs.pages.SearchingPage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.ConfigurationReader;
import com.rs.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class SearchFunctionalityStepDef {
    SearchingPage searchingPage=new SearchingPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("User clicks {string} button")
    public void userClicksButton(String Tshirt) {
        searchingPage.TShirtButton.click();
        BrowserUtils.sleep(10);
    }
    @When("User clicks the {string} size")
    public void userClicksTheSize(String Msize) {
        searchingPage.MSize.click();
        BrowserUtils.sleep(5);
    }
    @When("User clicks the {string} colour radio button")
    public void userClicksTheColourRadioButton(String Blue) {

        searchingPage.BlueColor.click();
        BrowserUtils.sleep(10);
    }
    @When("User clicks the add to cart button")
    public void userClicksTheAddToCartButton() {
        BrowserUtils.sleep(5);
        searchingPage.addChartButton.click();
    }
    @When("clicks {string} button")
    public void clicksButton(String ContinueShopping) {
        searchingPage.continueShoppingButton.click();
        BrowserUtils.sleep(5);


    }


    @When("User clicks Dress button")
    public void userClicksDressButton() {
        searchingPage.DressButton.click();
    }
    @When("User clicks Evening Dress")
    public void userClicksEveningDress() {
        searchingPage.eveningDress.click();
    }
    @When("User clicks the S size")
    public void userClicksTheSSize() {
        searchingPage.SSize.click();
        BrowserUtils.sleep(5);

    }
    @When("User clicks the Beige colour")
    public void userClicksTheBeigeColour() {
        searchingPage.BeigeColor.click();
        BrowserUtils.sleep(5);
    }
    @When("User clicks proceed to checkout button")
    public void userClicksProceedToCheckoutButton() {
        searchingPage.proceedCheckout.click();
        BrowserUtils.sleep(5);
    }

    @When("User clicks {string}")
    public void userClicks(String summerDress) {

    }

    @When("User clicks the orange colour")
    public void userClicksTheOrangeColour() {
        searchingPage.OrangeColor.click();
        BrowserUtils.sleep(5);

    }


    @When("User removes Printed Dress")
    public void userRemovesPrintedDress() {
        BrowserUtils.sleep(5);
        searchingPage.removeButton.click();
    }

    @When("User add the a Faded Short Sleeve T-Shirts")
    public void userAddTheAFadedShortSleeveTShirts() {
        BrowserUtils.sleep(5);
        searchingPage.addButton.click();
    }


}
