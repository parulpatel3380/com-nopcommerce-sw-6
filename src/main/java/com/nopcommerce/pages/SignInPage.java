package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = ("//div[@class='page-title']//h1"))
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = ("//button[text()='Checkout as Guest']"))
    WebElement checkoutAsGuestBtn;

    @CacheLookup
    @FindBy(xpath = ("//button[text()='Register']"))
    WebElement registerBtn;

    public void verifyWelcomeText(String expectedMessage) {
        verifyElements(welcomeText, expectedMessage, "Welcome message is not displayed");
        log.info("Verify Welcome text : " + expectedMessage.toString());
    }

    public void clickOnCheckoutAsGuestBtn() {
        clickOnElement(checkoutAsGuestBtn);
        log.info("Check out as guest button" + checkoutAsGuestBtn.toString());
    }

    public void clickOnRegisterBtn() {
        clickOnElement(registerBtn);
        log.info("Click on register button : " + registerBtn.toString());
    }
}
