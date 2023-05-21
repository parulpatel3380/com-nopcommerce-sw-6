package com.nopcommerce.steps;

import com.nopcommerce.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ElectronicsSteps  {
    //1.1 Mouse Hover on “Electronics” Tab
    //2.1 Mouse Hover on “Electronics” Tab
    @And("^I hove on 'Electronics' Tab$")
    public void iHoveOnElectronicsTab() {
        new HomePage().mouseHoverOnElectronics();
    }
    //1.2 Mouse Hover on “Cell phones” and click
    //2.2 Mouse Hover on “Cell phones” and click
    @And("^I hover and click on 'Cell phones'$")
    public void iHoverAndClickOnCellPhones() {
        new HomePage().mouseHoverAndClickOnCellPhones();
    }
    //1.3 Verify the text “Cell phones”
    //2.3 Verify the text “Cell phones”
    @Then("^I can see the text \"([^\"]*)\"$")
    public void iCanSeeTheText(String text)  {
        new CellPhonesPages().verifyTextCellPhone("Cell phones");
    }
    //2.4 Click on List View Tab
    @And("^I click on List View Tab$")
    public void iClickOnListViewTab() {
        new CellPhonesPages().clickOnListTab();
    }
    //2.5 Click on product name “Nokia Lumia 1020” link
    @And("^I click on product name “Nokia Lumia (\\d+)” link$")
    public void iClickOnProductNameNokiaLumiaLink(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CellPhonesPages().clickOnNokiaLumia1020();
    }
    //2.6 Verify the text “Nokia Lumia 1020”
    @Then("^I can see the text “Nokia Lumia (\\d+)”$")
    public void iCanSeeTheTextNokiaLumia(int arg0) {
        new NokiaLumiaPage().verifyTextNokiaLumia1020("Nokia Lumia 1020");
    }
    //2.7 Verify the price “$349.00”
    @Then("^I can see the price “\\$(\\d+)\\.(\\d+)”$")
    public void iCanSeeThePrice$(int arg0, int arg1) {
        new NokiaLumiaPage().verifyThePrice("$349.00");
    }
    //2.8 Change quantity to 2
    @And("^I change quantity to (\\d+)$")
    public void iChangeQuantityTo(int arg0) {
        new NokiaLumiaPage().changeQuantity("2");
    }
    //2.9 Click on “ADD TO CART” tab
    @And("^I click on “ADD TO CART” tab$")
    public void iClickOnADDTOCARTTab() {
        new NokiaLumiaPage().clickOnCartBtn();
    }
    // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    @Then("^I can see the Message 'The product has been added to your shopping cart' on Top green Bar$")
    public void iCanSeeTheMessageTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar() {
        new NokiaLumiaPage().verifyShoppingCartMessage("The product has been added to your shopping cart");
    }
    //After that close the bar clicking on the cross button.
    @And("^after that close the bar clicking on the cross button\\.$")
    public void afterThatCloseTheBarClickingOnTheCrossButton() {
        new NokiaLumiaPage().clickOnGreenBtn();
    }
    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    @Then("^MouseHover on 'Shopping cart' and Click on \"([^\"]*)\" button\\.$")
    public void mousehoverOnShoppingCartAndClickOnButton(String arg0)  {
        new NokiaLumiaPage().mouseHoverOnShoppingCart();
        new NokiaLumiaPage().clickOnGoToCart();
    }
    // 2.12 Verify the message "Shopping cart"
    @Then("^I can see the message 'Shopping cart'$")
    public void iCanSeeTheMessageShoppingCart() {
        new ShoppingCartPage().verifyShoppingCartTitle("Shopping cart");
    }
    // 2.13 Verify the quantity is 2
    @Then("^I can see the quantity is (\\d+)$")
    public void iCanSeeTheQuantityIs(int arg0) {
        new ShoppingCartPage().verifyTheQuantity();
    }
    // 2.14 Verify the Total $698.00
    @Then("^I can see the Total \\$(\\d+)\\.(\\d+)$")
    public void iCanSeeTheTotal$(int arg0, int arg1) {
        new ShoppingCartPage().verifyTotal("$698.00");
    }
    // 2.15 click on checkbox “I agree with the terms of service”
    @And("^I click on checkbox “I agree with the terms of service”$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnTermsOfServiceCheckbox();
    }
    // 2.16 Click on “CHECKOUT”
    @And("^I click on the 'CHECKOUT'$")
    public void iClickOnTheCHECKOUT() {
        new ShoppingCartPage().clickOnCheckOutBtn();
    }
    // 2.17 Verify the Text “Welcome, Please Sign In!”
    @Then("^I can see Text “Welcome, Please Sign In!”$")
    public void iCanSeeTextWelcomePleaseSignIn() {
        new SignInPage().verifyWelcomeText("Welcome, Please Sign In!");
    }
    // 2.18 Click on “REGISTER” tab
    @And("^I click on 'REGISTER' tab$")
    public void iClickOnREGISTERTab() {
        new SignInPage().clickOnRegisterBtn();
    }
    // 2.19 Verify the text “Register”
    @Then("^I can see the text 'Register'$")
    public void iCanSeeTheTextRegister() {
        new RegisterPage().verifyTextRegister("Register");
    }

    @And("^I fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        //Input First Name
        new RegisterPage().inputFirstNameField("Henry");
        // Input Last Name
        new RegisterPage().lastNameField("smith");
        // Input Email
        new RegisterPage().emailField("henrysmith123@gmail.com");
        // Input Password
        new RegisterPage().passwordField("password123");
        // Input Confirm Password
        new RegisterPage().confirmPasswordField("password123");


    }
    // 2.21 Click on “REGISTER” Button
    @And("^I click on 'REGISTER' Button$")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegister();
    }
    // 2.22 Verify the message “Your registration completed”
    @Then("^I can see the message “Your registration completed”$")
    public void iCanSeeTheMessageYourRegistrationCompleted() {
        new RegisterPage().verifyRegisterTextMessage("Your registration completed");
    }
    // 2.23 Click on “CONTINUE” tab
    @And("^I click on 'CONTINUE' tab$")
    public void iClickOnCONTINUETab() {
        new RegisterPage().clickOnContinueBtn();
    }
    // 2.24 Verify the text “Shopping card”
    @And("^I can see the text “Shopping card”$")
    public void iCanSeeTheTextShoppingCard() {
        new ShoppingCartPage().verifyShoppingCartTitle("Shopping cart");
    }
}
