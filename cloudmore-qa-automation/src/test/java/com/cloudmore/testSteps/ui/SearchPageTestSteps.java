package com.cloudmore.testSteps.ui;

import com.cloudmore.pageobjects.BasePage;
import com.cloudmore.pageobjects.HomePage;
import com.cloudmore.pageobjects.SearchPage;
import com.cloudmore.utils.PropertyFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.testng.Assert;

public class SearchPageTestSteps {
    SearchPage searchPageObj = new SearchPage();


    @Then("Verify the Search Page availability")
    public void verifying_home_page_is_available() {
        Assert.assertTrue(searchPageObj.isPageAvailable(), "Checking SearchPage Visibility");
    }

    @When("Navigate to {string} page from Search Page")
    public void navigateToTheURL(String page) {
        Assert.assertTrue(searchPageObj.navigateToPage(page).isPageAvailable(), "Navigate to " + page);
    }
    @When("Navigate to {string} page from Search Results Page")
    public void navigateToPageFromSearchResultsPage(String page) {
        Assert.assertTrue(searchPageObj.navigateToPageFromSearchResultsPage(page).isPageAvailable(), "Navigate to " + page);
    }

    @Then("Verify that the search results page is available")
    public void verify_searchResults_page_loaded(){
        Assert.assertTrue(searchPageObj.isSearchResultsPageLoaded(), "Search results page not loaded");
    }

    @Then("Verifying the Search Page URL After searching {string}")
    public void verify_search_page_URL(String searchKey) {
        Assert.assertEquals(BasePage.getPageURL(),PropertyFileReader.getInstance().getProperty("app.homepage")+"?s="+searchKey,"Search Page URL is not set Correctly after search");
    }

    @Then("Verifying the Search Page Title After searching {string}")
    public void verify_search_page_title(String searchKey) {
        Assert.assertEquals(BasePage.getPageTitle(),"You searched for "+searchKey+" - Cloudmore","Search Page Title is not set Correctly after search");
    }

    @Given("User entered {string} as search keyword on the search text field")
    public void user_entered_on_search_text_field(String searchKey){
        Assert.assertTrue(searchPageObj.typeSearchKeywordsInSearchBar(searchKey),"UserObject can't enter text on search text field'");
    }

    @Then("User click the search button")
    public void click_the_search_button(){
        Assert.assertTrue(searchPageObj.clickSearchButton(),"UserObject can't click the search button");
    }

    @Then("Validate search results have less than {int} items")
    public void verify_results_set(int expectedResultsCount){
        boolean itemCountVerification = searchPageObj.getSearchResults().size() > expectedResultsCount;
        Assert.assertTrue(itemCountVerification,"search results have less than "+expectedResultsCount+"items");
    }



}
