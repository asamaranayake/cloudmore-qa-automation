package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.PricingPage;
import com.cloudmore.pageobjects.SolutionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PricingPageTestSteps {

    PricingPage pricingPageObj= new PricingPage();

    @Then("Verify the Pricing Page availability")
    public void verifying_solution_page_is_available() {
        Assert.assertTrue(pricingPageObj.isPageAvailable(), "Checking Pricing Page Visibility");
    }

    @Then("Verifying the Company logo is visible from the Pricing page")
    public void verifyCompanyLogo() {
        Assert.assertTrue(pricingPageObj.isCompanyLogoVisible(),"Company logo is not visible");
    }

    @Then("Verifying the {string} Menu link is visible from the Pricing page")
    public void verifyMenuLinks(String menuName) {
        Assert.assertTrue(pricingPageObj.isMenuItemsAreVisible(menuName),menuName +" Menu is not visible from the Pricing page");
    }

    @When("Navigate to {string} page from Pricing Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(pricingPageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }

}
