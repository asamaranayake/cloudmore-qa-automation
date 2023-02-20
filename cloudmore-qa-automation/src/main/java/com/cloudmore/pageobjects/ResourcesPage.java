package com.cloudmore.pageobjects;

public class ResourcesPage extends BasePage {
    private final String resourcesPageBannerText = "//*[@class='banner-text']//h1[contains(text(),'Resources')]";
    @Override
    public boolean isPageAvailable() {
        return isElementVisible(getLocator(resourcesPageBannerText,BY_TYPE.BY_XPATH),1);
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
