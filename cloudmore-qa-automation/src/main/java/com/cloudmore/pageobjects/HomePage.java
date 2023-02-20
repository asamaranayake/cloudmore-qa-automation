package com.cloudmore.pageobjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage{


    private String homePageBannerText = "//*[@class='banner-text']//h1[contains(text(),'The Leading Cloud Commerce Solution')]";
    private String searchButton= "//button[@class='btn-search']";
    private String cookieAcceptButton= "//*[@id='hs-eu-confirmation-button']";
    private String cookieDeclineButton= "//*[@id='hs-eu-decline-button']";

    @Override
    public boolean isPageAvailable() {
        return isElementVisible(getLocator(homePageBannerText,BY_TYPE.BY_XPATH),4);
    }

    @Override
    public BasePage navigateToPage(String page) {
        String submenuPageLinkLocator = submenuPageLink.replace(PAGE_NAME,page);
        switch (page) {
            case "Solutions":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new SolutionPage();
            case "Integrations":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new IntegrationsPage();
            case "Resources":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new ResourcesPage();
            case "Pricing":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new PricingPage();
            case "Company":
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                click(getLocator(submenuPageLinkLocator, BY_TYPE.BY_XPATH));
                return new CompanyPage();
            case "Search":
                click(getLocator(searchButton, BY_TYPE.BY_XPATH));
                return new SearchPage();
            default:
                throw new IllegalStateException("Unexpected value: " + page);
        }
    }

    public boolean isSearchIconDisplaying(){
        By searchButtonLocator = getLocator(searchButton,BY_TYPE.BY_XPATH);
        return isElementVisible(searchButtonLocator,1);
    }

    public void acceptsTheCookie(){
        try {
            By acceptCookieLocator = getLocator(cookieAcceptButton, BY_TYPE.BY_XPATH);
            waitElementPresent(acceptCookieLocator, 2);
            waitElementVisible(acceptCookieLocator, 2);
            click(acceptCookieLocator);
        }catch (Exception e){
            logger.info("Already Accepted the Cookie");
        }
    }

}
