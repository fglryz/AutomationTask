package com.rs.stepDefinitions;


import com.github.javafaker.Faker;
import com.rs.pages.BasePage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.ConfigurationReader;
import com.rs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UITestsStepDefs {


    BasePage basePage = new BasePage();
    String actualNameOfFirstProduct;
    Faker faker = new Faker();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.bannerAcceptAllButton.click();

    }
    @When("User clicks Contactors")
    public void user_clicks_contactors() {
        basePage.Contactors.click();

    }
    @When("User clicks to Add button under the first product")
    public void user_clicks_to_add_button_under_the_first_product() {
        String FirstProductName = basePage.firstProductOnThePage.getText();
        actualNameOfFirstProduct = FirstProductName;
        basePage.firstProductOnThePageButton.click();

    }
    @When("User clicks to Cart button")
    public void user_clicks_to_cart_button() {

        BrowserUtils.waitFor(5);
        basePage.cart.click();
        basePage.noThanks.click();
    }
    @Then("User sees  chosen product in the cart")
    public void user_sees_chosen_product_in_the_cart() {

        basePage.noThanks.click();
        String inCartFirstProductName = basePage.inCartFirstProduct.getText();
        Assert.assertEquals(inCartFirstProductName, actualNameOfFirstProduct);
    }


    @When("User clicks on Browse option")
    public void user_clicks_on_browse_option() {
    basePage.browseOption.click();


    }
    @When("User clicks on Electrical,Automation&Cables")
    public void user_clicks_on_electrical_automation_cables() {
     basePage.electricalAutomation.click();
    }
    @When("User clicks on Automation&Control Gear")
    public void user_clicks_on_automation_control_gear() {
     basePage.automationControl.click();
    }
    @When("User clicks on Contactors&Auxiliary Contactors")
    public void user_clicks_on_contactors_auxiliary_contactors() {
    basePage.contactorsAuxilary.click();
    }
    @When("User clicks on Contactors")
    public void user_clicks_on_contactors() {
     basePage.contactors2.click();
    }


    @Then("User sees chosen product in the cart")
    public void userSeesChosenProductInTheCart() {

        basePage.noThanks.click();
        String inCartFirstProductName = basePage.inCartFirstProduct.getText();
        Assert.assertEquals(inCartFirstProductName, actualNameOfFirstProduct);


    }

    @And("User clicks on Guest Checkout")
    public void userClicksOnGuestCheckout() {
      basePage.checkOut.click();

    }










}


