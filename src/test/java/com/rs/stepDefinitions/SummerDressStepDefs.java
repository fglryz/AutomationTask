package com.rs.stepDefinitions;
;
import com.rs.pages.AuthenticationPage;
import com.rs.pages.PrintedSummaryPage;
import com.rs.pages.ShoppingCartSummaryPage;
import com.rs.pages.SummerDressesPage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.ConfigurationReader;
import com.rs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SummerDressStepDefs {

    PrintedSummaryPage printedSummaryPage = new PrintedSummaryPage();
    SummerDressesPage summerDressesPage = new SummerDressesPage();
    ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();
    AuthenticationPage authenticationPage = new AuthenticationPage();


    @Given("the user navigates to main page")
    public void the_user_navigates_to_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("the user hovers over DRESSES and clicks on SUMMER DRESSES")
    public void the_user_hover_over_DRESSES_and_clicks_on_SUMMER_DRESSES() {
        Actions action = new Actions(Driver.getDriver());

        BrowserUtils.waitForVisibility(summerDressesPage.summerDresses, 15);
        BrowserUtils.hover(summerDressesPage.summerDresses);
        //action.moveToElement(summerDressesPage.summerDresses).perform();
        summerDressesPage.summerDressesSubTab.click();
    }


    @When("adds one of the SUMMER DRESSES to the cart")
    public void adds_one_of_the_SUMMER_DRESSES_to_the_cart() {
        printedSummaryPage.addToCartButton.click();
        BrowserUtils.waitForVisibility(printedSummaryPage.successMessage, 15);


    }

    @Then("verify successfully added message appeared in the pop-up window")
    public void verify_successfully_added_message_appeared_in_the_pop_up_window() {
        Assert.assertTrue(printedSummaryPage.successMessage.isDisplayed());
    }

    @When("the user clicks on proceed to checkout button in the pop-up window")
    public void the_user_clicks_on_proceed_to_checkout_button() {
        printedSummaryPage.checkoutButton.click();


    }

    @Then("verify that {string} is displayed")
    public void verify_that_is_displayed(String expectedMessage) {
        WebElement actualMessage = Driver.getDriver().findElement(By.id("cart_title"));
        Assert.assertTrue(actualMessage.getText().contains(expectedMessage));

    }

    @When("the user clicks on proceed to checkout button on shopping-cart summary")
    public void the_user_clicks_on_proceed_to_checkout_button_on_shopping_cart_summary() {

        shoppingCartSummaryPage.SecondProceedButton.click();

    }

    @Then("verify that sign-in button is displayed")
    public void verify_that_sign_in_button_is_diplayed() {

        Assert.assertTrue("Sign in button is not displayed", authenticationPage.signInButton.isDisplayed());
    }

    @And("clicks on the image of the dress")
    public void clicksOnTheImageOfTheDress() {
        summerDressesPage.summerDresses.click();


    }


    @And("selects {string}, {string} and {string} of the dress")
    public void selectsAndOfTheDress(String quantity, String size, String color) {

        printedSummaryPage.quantityBox.clear();
        printedSummaryPage.quantityBox.sendKeys(quantity);
        printedSummaryPage.selectSize(size);
        printedSummaryPage.selectColor(color);
        printedSummaryPage.addToCartButton.click();


    }
}
