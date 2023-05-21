package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartBtn;

    @CacheLookup
    @FindBy(css = ".product-subtotal")
    WebElement total;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfService;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[5]/input[1]")
    WebElement quantityNokia;


    // Verifying Shopping cart title
    public void verifyShoppingCartTitle(String expectedMessage) {
        verifyElements(shoppingCartText, expectedMessage, "Title is not display as expected ");
        log.info("Verify shopping cart title : " + expectedMessage.toString());
    }

    // Change quality and click update cart button
    public void changeQuantityAndUpdateCart(String qty) {
        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
        clickOnElement(updateCartBtn);
        log.info("Change the quantity : " + qty.toString()+updateCartBtn);
    }

    // Verifying total
    public void verifyTotal(String expectedTotal) {
        verifyElements(total, expectedTotal, "Total is not correct");
        log.info("Verify total : " + expectedTotal.toString());
    }

    // Clicking on Terms Of Service checkbox
    public void clickOnTermsOfServiceCheckbox() {
        clickOnElement(termsOfService);
        log.info("Click on terms of services " + termsOfService.toString());
    }

    // Clicking on Checkout button
    public void clickOnCheckOutBtn() {
        clickOnElement(checkoutBtn);
        log.info("Check out button : " + checkoutBtn.toString());
    }

    public void verifyQuantityForNokia(String expectedQuantity) {
        verifyElements(quantityNokia, expectedQuantity, "Quantity is not displayed as expected");
        log.info("Verify quantity for nokia : " + expectedQuantity.toString());
    }

    public void verifyTheQuantity() {
        String expectedMessage = "2";
        String actualMessage = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).getAttribute("value");
        Assert.assertEquals("2", expectedMessage, actualMessage);
        log.info("Verify quantity for nokia : " + expectedMessage.toString());
    }
}
