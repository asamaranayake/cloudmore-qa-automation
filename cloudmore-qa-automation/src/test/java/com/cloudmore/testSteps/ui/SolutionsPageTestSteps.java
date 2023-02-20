package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.SolutionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SolutionsPageTestSteps {

    SolutionPage solutionPageObj= new SolutionPage();

    @Then("Verify the Solutions Page availability")
    public void verifying_solution_page_is_available() {
        Assert.assertTrue(solutionPageObj.isPageAvailable(), "Checking SolutionPage Visibility");
    }

    @Then("Verifying the Company logo is visible from the Solutions page")
    public void verifyCompanyLogo() {
        Assert.assertTrue(solutionPageObj.isCompanyLogoVisible(),"Company logo is not visible");
    }

    @Then("Verifying the {string} Menu link is visible from the Solutions page")
    public void verifyMenuLinks(String menuName) {
        Assert.assertTrue(solutionPageObj.isMenuItemsAreVisible(menuName),menuName +" Menu is not visible from the Solution page");
    }

    @When("Navigate to {string} page from Solutions Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(solutionPageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }

}
