package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup

    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void verifyTextRegister(String expectedText) {
        verifyElements(registerText, expectedText, "Text is not Displayed");
        log.info("Verify text : " + expectedText.toString());
    }

    public void inputFirstNameField(String name) {
        sendTextToElement(firstName, name);
        log.info("Input first name : " + name.toString());
    }

    public void lastNameField(String lName) {
        sendTextToElement(lastName, lName);
        log.info("Input last name : " + lName.toString());
    }

    public void emailField(String email1) {
        sendTextToElement(email, email1);
        log.info("Enter email : " + email1.toString());
    }

    public void passwordField(String password1) {
        sendTextToElement(password, password1);
        log.info("Enter password : " + password1.toString());
    }

    public void confirmPasswordField(String confirmPass) {
        sendTextToElement(confirmPassword, confirmPass);
        log.info("Confirm password : " + confirmPass.toString());
    }

    public void clickOnRegister() {
        clickOnElement(register);
        log.info("Click on register : " + register.toString());
    }

    public void verifyRegisterTextMessage(String expextedMessage) {
        verifyElements(registerMessage, expextedMessage, "Message is not displayed");
        log.info("Verify text : " + expextedMessage.toString());
    }

    public void clickOnContinueBtn() {
        clickOnElement(continueBtn);
        log.info("Continue button : " + continueBtn.toString());
    }
}
