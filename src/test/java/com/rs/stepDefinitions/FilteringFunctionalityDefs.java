package com.rs.stepDefinitions;

import com.rs.pages.BasePage;
import com.rs.pages.FilteringPage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.Driver;
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
     filteringPage.brand.click();


    }


    @Then("User clicks on GORILLA GLUE EUROPE LTD \\({int})")
    public void user_clicks_on_gorilla_glue_europe_ltd(Integer int1) {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(filteringPage.gorillaGlue);
        actions.click().perform();


   // filteringPage.gorillaGlue.click();
    }
    @Then("User clicks Apply Filters")
    public void user_clicks_apply_filters() {
    filteringPage.applyFilters.click();
    }

    @Then("User sees {string} and {string}")
    public void user_sees_and(String brandName, String Adhesive) {
    Assert.assertEquals(brandName, filteringPage.brandName.getText() );
    Assert.assertEquals(Adhesive, filteringPage.adhesiveType.getText());

    }


}
