package com.cloudmore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage {

    private String searchInputLocator = "//input[@class='input-search']";
    private String searchButtonLocator = "//button[@class='search-button']";
    private String searchPageCloseButtonLocator = "//button[@class='btn-close-search']";
    private String searchResultsPagerLocator = "//span[@class='search-term']";
    private String searchResultsListLocator = "//article[@class='search-result']/a";

    @Override
    public boolean isPageAvailable() {
        return isElementVisible(getLocator(searchInputLocator,BY_TYPE.BY_XPATH),1);
    }

    @Override
    public BasePage navigateToPage(String page) {

        By searchPageCloseButton = getLocator(searchPageCloseButtonLocator, BY_TYPE.BY_XPATH);
        switch (page) {
            case "HomePage":
                click(searchPageCloseButton);
                return new HomePage();
            case "Solutions":
                click(searchPageCloseButton);
                return new SolutionPage();
            case "Integrations":
                click(searchPageCloseButton);
                return new IntegrationsPage();
            case "Resources":
                click(searchPageCloseButton);
                return new ResourcesPage();
            case "Pricing":
                click(searchPageCloseButton);
                return new PricingPage();
            case "Company":
                click(searchPageCloseButton);
                return new CompanyPage();
            default:
                throw new IllegalStateException("Unexpected value: " + page);
        }
    }

    public BasePage navigateToPageFromSearchResultsPage(String page) {

        String submenuPageLinkLocator = submenuPageLink.replace(PAGE_NAME,page);
        switch (page) {
            case "Solutions":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new SolutionPage();
            case "Integrations":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new IntegrationsPage();
            case "Resources":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new ResourcesPage();
            case "Pricing":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new PricingPage();
            case "Company":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new CompanyPage();
            default:
                throw new IllegalStateException("Unexpected value: " + page);
        }
    }

    public boolean typeSearchKeywordsInSearchBar(String searchKeyword) {
        boolean result = false;
        By searchInputTextField = getLocator(searchInputLocator, BY_TYPE.BY_XPATH);
        type(searchInputTextField, searchKeyword);
        result = true;
        return result ;
    }

    public boolean clickSearchButton() {
        By searchButton = getLocator(searchButtonLocator, BY_TYPE.BY_XPATH);
        return click(searchButton);
    }

    public boolean isSearchResultsPageLoaded() {
        By searchResultsPageElement = getLocator(searchResultsPagerLocator, BY_TYPE.BY_XPATH);
        return isElementVisible(searchResultsPageElement, 1);
    }

    public ArrayList<String> getSearchResults() {
        ArrayList<String> results = new ArrayList<>();
        By resultsWebElements = getLocator(searchResultsListLocator,BY_TYPE.BY_XPATH);
        List<WebElement> resultsElements = findElements(resultsWebElements);

        for(WebElement searchResultElement : resultsElements){
            results.add(searchResultElement.getText());
        }
        return results;
    }
}

