package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.BasePage;
import com.cloudmore.pageobjects.HomePage;
import com.cloudmore.utils.PropertyFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageTestSteps {
    HomePage homePageObj = new HomePage();

    @Given("User direct to the Home Page")
    public void userDirectToTheHomePage() {
        String homePageUrl = PropertyFileReader.getInstance().getProperty("app.homepage");
        BasePage.getToUrl(homePageUrl);
        Assert.assertEquals(BasePage.getPageURL(), homePageUrl);
    }

    @Then("Verify the HomePage availability")
    public void verifying_home_page_is_available() {
        Assert.assertTrue(homePageObj.isPageAvailable(), "Checking HomePage Visibility");
    }

    @When("Navigate to {string} page from home Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(homePageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }

    @Then("Verifying the Company logo is visible from the Home page")
    public void verifyCompanyLogo() {
        Assert.assertTrue(homePageObj.isCompanyLogoVisible(),"Company logo is not visible");
    }

    @Then("Verifying the {string} Menu link is visible from the Home page")
    public void verifyMenuLinks(String menuName) {
        Assert.assertTrue(homePageObj.isMenuItemsAreVisible(menuName),menuName +" Menu is not visible from the Home page");
    }

    @And("User Accepts the Cookie Consent")
    public void acceptTheCookies(){
        homePageObj.acceptsTheCookie();
    }

}
