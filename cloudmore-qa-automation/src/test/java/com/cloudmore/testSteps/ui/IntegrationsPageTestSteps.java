package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.IntegrationsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class IntegrationsPageTestSteps {

    IntegrationsPage integrationsPageObj = new IntegrationsPage();

    @Then("Verify the Integrations Page availability")
    public void verifying_solution_page_is_available() {
        Assert.assertTrue(integrationsPageObj.isPageAvailable(), "Checking SolutionPage Visibility");
    }

    @Then("Verifying the Company logo is visible from the Integrations page")
    public void verifyCompanyLogo() {
        Assert.assertTrue(integrationsPageObj.isCompanyLogoVisible(),"Company logo is not visible");
    }

    @Then("Verifying the {string} Menu link is visible from the Integrations page")
    public void verifyMenuLinks(String menuName) {
        Assert.assertTrue(integrationsPageObj.isMenuItemsAreVisible(menuName),menuName +" Menu is not visible from the Solution page");
    }

    @When("Navigate to {string} page from Integrations Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(integrationsPageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }

}
