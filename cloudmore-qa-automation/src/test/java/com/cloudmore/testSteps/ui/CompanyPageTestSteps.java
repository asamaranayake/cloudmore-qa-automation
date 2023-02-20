package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.CompanyPage;
import com.cloudmore.pageobjects.SolutionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CompanyPageTestSteps {

    CompanyPage companyPageObj= new CompanyPage();

    @Then("Verify the Company Page availability")
    public void verifying_solution_page_is_available() {
        Assert.assertTrue(companyPageObj.isPageAvailable(), "Checking Company Visibility");
    }

    @Then("Verifying the Company logo is visible from the Company page")
    public void verifyCompanyLogo() {
        Assert.assertTrue(companyPageObj.isCompanyLogoVisible(),"Company logo is not visible");
    }

    @Then("Verifying the {string} Menu link is visible from the Company page")
    public void verifyMenuLinks(String menuName) {
        Assert.assertTrue(companyPageObj.isMenuItemsAreVisible(menuName),menuName +" Menu is not visible from the Company page");
    }

    @When("Navigate to {string} page from Company Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(companyPageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }

}
