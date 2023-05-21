package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeOurStoreText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li//a")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Electronics')]")
    WebElement electronicsText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Apparel')]")
    WebElement apparelText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Digital downloads')]")
    WebElement digitalDownloadsText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Books')]")
    WebElement booksText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Jewelry')]")
    WebElement jewelryText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Gift Cards')]")
    WebElement giftCardsText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;


    public void selectMenu(String menu){
        List<WebElement> topMenuNames = driver.findElements(By.cssSelector("li>a"));
        for (WebElement names : topMenuNames) {
            //System.out.println(names.getText());
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }
    public String getWelcomeOurStoreText(){
        log.info("Clicking on login link : " + welcomeOurStoreText.toString());
        return getTextFromElement(welcomeOurStoreText);
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
        log.info("Clicking on login link : " + logOutButton.toString());
    }
    public void verifyComputersPageNavigation(String expectedMessage) {
        verifyElements(computerText, expectedMessage, "Wrong Text");
        log.info("Verify computer page : " + expectedMessage.toString());
    }

    public void verifyElectronicsPageNavigation(String expectedMessage) {
        verifyElements(electronicsText, expectedMessage, "Wrong Text");
        log.info("Verify electronics page : " + expectedMessage.toString());
    }

    public void verifyApparelPageNavigation(String expectedMessage) {
        verifyElements(apparelText, expectedMessage, "Wrong Text");
        log.info("Verify apparel page : " + expectedMessage.toString());
    }

    public void verifyDigitalDownloadsPageNavigation(String expectedMessage) {
        verifyElements(digitalDownloadsText, expectedMessage, "Wrong Text");
        log.info("Verify digital download page : " + expectedMessage.toString());
    }

    public void verifyBooksPageNavigation(String expectedMessage) {
        verifyElements(booksText, expectedMessage, "Wrong Text");
        log.info("Verify books page : " + expectedMessage.toString());
    }

    public void verifyJewelryPageNavigation(String expectedMessage) {
        verifyElements(jewelryText, expectedMessage, "Wrong Text");
        log.info("Verify jewelry page : " + expectedMessage.toString());
    }

    public void verifyGiftCardsPageNavigation(String expectedMessage) {
        verifyElements(giftCardsText, expectedMessage, "Wrong Text");
        log.info("Verify gift cards page : " + expectedMessage.toString());
    }

    public void verifyTheTextWelcomeToOurStore(String expectedMessage) {
        verifyElements(welcomeText, expectedMessage, "Message is not displayed");
        log.info("Verify the welcome page : " + expectedMessage.toString());
    }


    //**************** Electronics Test****************************

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhones;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public void mouseHoverOnElectronics() {
        mouseHoverToElement(electronics);
        log.info("Mouse hover on electronics " + electronics.toString());
    }

    public void mouseHoverAndClickOnCellPhones() {
        mouseHoverToElementAndClick(cellPhones);
        log.info("Mouse hover on electronics " + cellPhones.toString());
    }

    public void clickOnLogoutLink() {
        clickOnElement(logout);
        log.info("Click on log out link " + logout.toString());
    }

    public void getURL() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("The URL is incorrect", url, "https://demo.nopcommerce.com/");
        log.info("Current URL ");
    }
}
