package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.ResourcesPage;
import com.cloudmore.pageobjects.SolutionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ResourcesPageTestSteps {

    ResourcesPage resourcesPageObj= new ResourcesPage();

    @Then("Verify the Resources Page availability")
    public void verifying_solution_page_is_available() {
        Assert.assertTrue(resourcesPageObj.isPageAvailable(), "Checking ResourcesPage Visibility");
    }

    @Then("Verifying the Company logo is visible from the Resources page")
    public void verifyCompanyLogo() {
        Assert.assertTrue(resourcesPageObj.isCompanyLogoVisible(),"Company logo is not visible");
    }

    @Then("Verifying the {string} Menu link is visible from the Resources page")
    public void verifyMenuLinks(String menuName) {
        Assert.assertTrue(resourcesPageObj.isMenuItemsAreVisible(menuName),menuName +" Menu is not visible from the Resources page");
    }

    @When("Navigate to {string} page from Resources Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(resourcesPageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }

}
