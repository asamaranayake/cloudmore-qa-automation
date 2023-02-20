package com.cloudmore.pageobjects;

public class CompanyPage extends BasePage {

    private String submenuPageLink = "//*[@class='mega-menu-link' and text()='pageName']";
    private String companyPagePageBannerText = "//*[@class='banner-text']//h1[contains(text(),'Company')]";
    @Override
    public boolean isPageAvailable() {
        return isElementVisible(getLocator(companyPagePageBannerText,BY_TYPE.BY_XPATH),4);
    }


    @Override
    public BasePage navigateToPage(String page) {
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
}
