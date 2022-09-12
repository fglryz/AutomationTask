package com.rs.stepDefinitions;

import com.rs.pages.BasePage;
import com.rs.pages.FilteringPage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class FilteringFunctionalityDefs {

    FilteringPage filteringPage=new FilteringPage();
    BasePage basePage=new BasePage();

    @When("User types adhesives to search box")
    public void user_types_adhesives_to_search_box() {
    filteringPage.searchBox.sendKeys("adhesive");
    filteringPage.enter.click();

    }
    @Then("User sees Adhesives under top matching categories")
    public void user_sees_adhesives_under_top_matching_categories() {
        BrowserUtils.waitFor(5);
        filteringPage.adhesive.getText();

    }

    @Then("User clicks on Adhesives")
    public void user_clicks_on_adhesives() {
      filteringPage.adhesive.click();
    }

    @Then("User clicks on Brand")

    public void user_clicks_on_brand() {
        BrowserUtils.waitFor(5);
     filteringPage.clickOnBrand();


    }


    @Then("User clicks on Raytech")
    public void user_clicks_on_raytech() {

        filteringPage.clickonRaytech();
    }
    @Then("User clicks Apply Filters")
    public void user_clicks_apply_filters() {

        filteringPage.applyFilter();
    }

    @Then("User sees {string}")
    public void user_sees(String brandName) {
        Assert.assertEquals(brandName, filteringPage.brandName.getText() );
        //Assert.assertEquals(Adhesive, filteringPage.adhesiveType.getText());


    }

    @When("User toggles  MPN")
    public void user_toggles_mpn() {

     filteringPage.mpn.click();
    }
    @When("User types {int} in search box")
    public void user_types_in_search_box(Integer int1) {
    filteringPage.searchBox.sendKeys("702060");
    filteringPage.enter.click();

    }


    @Then("User clicks on Temperature Controllers box")
    public void user_clicks_on_temperature_controllers_box() {

       filteringPage.box.click();

    }

    @Then("User clicks on  Size")
    public void user_clicks_on_size() {

      filteringPage.clickOnSize();

    }
    @And("User clicks on {string}")
    public void userClicksOn(String arg0) {
        BrowserUtils.waitFor(5);
      filteringPage.sizeOpt();


    }
    @Then("User clicks on Apply Filters")
    public void user_clicks_on_apply_filters() {
        filteringPage.applyFilters.click();

    }
    @Then("User locates {string} product on the page")
    public void user_locates_product_on_the_page(String product) {

        Assert.assertEquals(product,filteringPage.product.getText());


    }

    @When("User clicks on {string} and {string} and {string}")
    public void user_clicks_on_and_and(String string, String string2, String string3) {




    }
    @Then("User sees {string} and {string} and {string}")
    public void user_sees_and_and(String string, String string2, String string3) {



    }







}
