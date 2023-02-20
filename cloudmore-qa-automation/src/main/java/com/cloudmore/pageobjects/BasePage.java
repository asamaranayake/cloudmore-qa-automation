package com.cloudmore.pageobjects;

import com.cloudmore.driverFactory.WebDriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;


public abstract class BasePage {
    static Logger logger = LoggerFactory.getLogger(BasePage.class);
    public static int TIME_OUT = 40;
    public static String submenuPageLink = "//*[@class='mega-menu-link' and text()='pageName']";
    public static String submenuDropDownButton = "//*[@class='mega-menu-link' and text()='pageName']//*[@role='button']";
    public static String companyBrandLogo = "//*[@class='navbar-brand']/img[@alt='Cloudmore']";
    public boolean isCompanyLogoVisible(){
        return isElementVisible(getLocator(companyBrandLogo,BY_TYPE.BY_XPATH),1);
    }

    public boolean isMenuItemsAreVisible(String menuItem) {
        switch (menuItem) {
            case "Solutions":
            case "Company":
            case "Integrations":
            case "Resources":
                return isElementVisible(getLocator(submenuDropDownButton.replace(PAGE_NAME,menuItem), BY_TYPE.BY_XPATH),1);
            case "Pricing":
                return isElementVisible(getLocator(submenuPageLink.replace(PAGE_NAME,menuItem), BY_TYPE.BY_XPATH),1);
            default:
                throw new IllegalStateException("Unexpected value: " + menuItem);

        }
    }


    public static String PAGE_NAME = "pageName";
    /**
     * Enum of By Type
     */
    public enum BY_TYPE {
        BY_XPATH, BY_LINKTEXT, BY_ID, BY_CLASSNAME, BY_NAME, BY_CSSSELECTOR, BY_PARTIALLINKTEXT, BY_TAGNAME
    }

    /**
     * @param locator
     * @param type
     * @return By for the given locator and Type
     */
    public By getLocator(String locator, BY_TYPE type) {

        switch (type) {

            case BY_XPATH:
                return By.xpath(locator);
            case BY_LINKTEXT:
                return By.linkText(locator);
            case BY_ID:
                return By.id(locator);
            case BY_CSSSELECTOR:
                return By.cssSelector(locator);
            case BY_CLASSNAME:
                return By.className(locator);
            case BY_NAME:
                return By.name(locator);
            case BY_PARTIALLINKTEXT:
                return By.partialLinkText(locator);
            case BY_TAGNAME:
                return By.tagName(locator);

        }
        throw new IllegalArgumentException("Invalid By Type , Please enter correct locator type ");
    }

    /**
     * TO Navigate to the Given Browser URL
     * this is keeps the History of the WebPages
     *
     * @param url
     */
    public static void navigateToUrl(String url) {
        WebDriverHolder.getDriver().navigate().to(url);
    }

    /**
     * Load a new web page in the current browser window. This is done using an HTTP GET operation,
     * and the method will block until the load is complete.
     *
     * @param url
     */
    public static void getToUrl(String url) {
        WebDriverHolder.getDriver().get(url);
    }

    public static String getPageURL(){
        return WebDriverHolder.getDriver().getCurrentUrl();
    }

    public static String getPageTitle(){
        return WebDriverHolder.getDriver().getTitle();
    }
    public static void setTimeOut(long timeoutInSeconds) {
        WebDriverHolder.getDriver().manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);
        WebDriverHolder.getDriver().manage().timeouts().pageLoadTimeout(timeoutInSeconds, TimeUnit.SECONDS);
        WebDriverHolder.getDriver().manage().timeouts().setScriptTimeout(timeoutInSeconds, TimeUnit.SECONDS);
    }

    public static WebElement findElement(By locator){
       return WebDriverHolder.getDriver().findElement(locator);
    }

    public static List<WebElement> findElements(By locator){
        return WebDriverHolder.getDriver().findElements(locator);
    }

    /**
     * Click the WebElement for given locator
     *
     * @param locator
     */
    public static boolean click(By locator) {

        try {
            logger.info(locator.toString());
            waitElementClickable(locator).click();
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    public static String getText(By locator){
        try {
            return waitElementPresent(locator,1).getText();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public static String getAttribute(By locator , String attribute){
        try {
            return waitElementPresent(locator,1).getAttribute(attribute);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public static String getCSSValue(By locator, String cssPropertyName){
        try {
            return waitElementVisible(locator).getCssValue(cssPropertyName);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }


    public static void javascriptClick(By by) {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) WebDriverHolder.getDriver();
            executor.executeScript("arguments[0].click()", WebDriverHolder.getDriver().findElement(by));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public static void type(By locator,String value){
        try{
            waitElementClickable(locator).click();
            waitElementClickable(locator).sendKeys(value);
        }catch(Exception e){
            logger.error(e.getMessage());
        }

    }

    public static boolean select(By locator,String visibleText){
        try{
            Select select = new Select(findElement(locator));
            select.selectByVisibleText(visibleText);
            return true;
        }catch(Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public static boolean select(By locator,int index){
        try{
            Select select = new Select(waitElementVisible(locator));
            select.selectByIndex(index);
            return true;
        }catch(Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public static boolean selectByValue(By locator,String value){
        try{
            Select select = new Select(waitElementVisible(locator));
            select.selectByValue(value);
            return true;
        }catch(Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public static boolean switchToiFrame(WebElement iframeElement ,int...time){
        try{
            int seconds = (time.length == 0) ? TIME_OUT : time[0];
            WebDriverWait wait = new WebDriverWait(WebDriverHolder.getDriver(), Duration.of(seconds, ChronoUnit.SECONDS));
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement));
            WebDriverHolder.getDriver().switchTo().frame(iframeElement);
            return true;
        }catch(Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public static boolean switchToDefault(){
        try{
            WebDriverHolder.getDriver().switchTo().defaultContent();
            return true;
        }catch(Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public static WebElement waitElementVisible(By locator, int... time)  {
        int seconds = (time.length == 0) ? TIME_OUT : time[0];
        WebDriverWait wait = new WebDriverWait(WebDriverHolder.getDriver(), Duration.of(seconds, ChronoUnit.SECONDS));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitElementPresent(By locator, int... time) {
        int seconds = (time.length == 0) ? TIME_OUT : time[0];
        WebDriverWait wait = new WebDriverWait(WebDriverHolder.getDriver(), Duration.of(seconds, ChronoUnit.SECONDS));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static WebElement waitElementClickable(By locator)  {
        WebDriverWait wait = new WebDriverWait(WebDriverHolder.getDriver(), Duration.of(TIME_OUT, ChronoUnit.SECONDS));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static boolean isElementVisible(By locator, int seconds) {
        try {
            return waitElementVisible(locator, seconds).isDisplayed();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    public static boolean isElementPresent(By locator, int seconds) {
        try {
            waitElementPresent(locator, seconds);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }

    }


    public static boolean dragAndDrop(WebElement sourceElement, WebElement targetElement){

        try {
            Actions action = new Actions(WebDriverHolder.getDriver());

            //Perform the DragAndDrop Action
            action.dragAndDrop(sourceElement,targetElement).perform();
            return true;

        }catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }


    }

    public abstract boolean isPageAvailable();
    public abstract Object navigateToPage(String Page);

}
