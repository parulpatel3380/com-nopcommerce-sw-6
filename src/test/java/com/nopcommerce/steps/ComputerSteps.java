package com.nopcommerce.steps;

import com.nopcommerce.pages.*;
import com.nopcommerce.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ComputerSteps extends Utility {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {

    }
    //1.1 Click on Computer Menu.
    //2.1 Click on Computer Menu.
    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String menu)  {
        new HomePage().selectMenu(menu);
    }
    //1.2 Click on Desktop Category
    //2.2 Click on Desktop
    @And("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputersPage().clickOnDesktop();
    }
    //1.3 Select Sort By position "Name: Z to A"
    @And("^I select sort by position Name : Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().clickOnSortByNameZToA();
    }
    //1.4 Verify the Product will arrange in Descending order.
    @Then("^I can see the product arranged in descending order$")
    public void iCanSeeTheProductArrangedInDescendingOrder() throws Exception {
        new DesktopPage().verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }
    //2.3 Select Sort By position "Name: A to Z"
    @And("^I select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String filter) {
        new DesktopPage().selectZToAFromSortByDropdown(filter);
    }
    //2.4 Click on "Add To Cart"
    @And("^I click on Add To Cart$")
    public void iClickOnAddToCart() throws Exception {
        new DesktopPage().clickOnAddToCart();
    }
    //2.5 Verify the Text "Build your own computer"
    @And("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String buildComputerText)  {
        new BuildYourOwnComputerPage().verifyBuildYourOwnComputerText("Build your own computer");
    }
    // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    @And("^I select processor \"([^\"]*)\" using Select class$")
    public void iSelectProcessorUsingSelectClass(String processor)  {
        new BuildYourOwnComputerPage().selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
    }
    // 2.7.Select "8GB [+$60.00]" using Select class.
    @And("^I select ram \"([^\"]*)\" using Select class\\.$")
    public void iSelectRamUsingSelectClass(String ram)  {
        new BuildYourOwnComputerPage().selectRAM("8GB [+$60.00]");
    }
    // 2.8 Select HDD radio "400 GB [+$100.00]"
    @And("^I select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hdd)  {
        new BuildYourOwnComputerPage().selectHDD("400 GB [+$100.00]");
    }
    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    @And("^I select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String os)  {
        new BuildYourOwnComputerPage().selectOS("Vista Premium [+$60.00]");
    }
    // 2.10 Click Check boxes "Total Commander [+$5.00]"
    @And("^I check Two Check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckTwoCheckBoxesAnd(String chk1, String chk2)  {
        new BuildYourOwnComputerPage().selectSoftware("Total Commander [+$5.00]");
    }
    // 2.11 Verify the price "$1,475.00" (Price is dynamic)
    @Then("^I can see the computer price \"([^\"]*)\"$")
    public void iCanSeeTheComputerPrice(String productPrice) throws Exception {
        new BuildYourOwnComputerPage().verifyPrice("$1,475.00");
    }
    // 2.12 Click on "ADD TO CARD" Button.
    @And("^I click on 'ADD TO CARD' Button\\.$")
    public void iClickOnADDTOCARDButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }
    // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    @Then("^I can see the Message \"([^\"]*)\" on Top green Bar$")
    public void iCanSeeTheMessageOnTopGreenBar(String arg0) {
        new BuildYourOwnComputerPage().verifyAddToCartMessage("The product has been added to your shopping cart");
    }
    // After that close the bar clicking on the cross button.
    @And("^After that close the bar clicking on the cross button\\.$")
    public void afterThatCloseTheBarClickingOnTheCrossButton() {
        new BuildYourOwnComputerPage().clickOnCrossButton();
    }
    // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    @Then("^MouseHover on 'Shopping cart' and Click on 'GO TO CART' button\\.$")
    public void mousehoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
        new BuildYourOwnComputerPage().clickOnGoToCart();
    }
    // 2.15 Verify the message "Shopping cart"
    @Then("^I can see the message \"([^\"]*)\"$")
    public void iCanSeeTheMessage(String expectedMessage)  {
        new ShoppingCartPage().verifyShoppingCartTitle("Shopping cart");
    }
    // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
    @And("^I change the Qty to (\\d+) and Click on 'Update shopping cart'$")
    public void iChangeTheQtyToAndClickOnUpdateShoppingCart(int arg0) {
        new ShoppingCartPage().changeQuantityAndUpdateCart("2");
    }
    // 2.17 Verify the Total"$2,950.00"
    @Then("^I can see the Total \"([^\"]*)\"$")
    public void iCanSeeTheTotal(String arg0)  {
        new ShoppingCartPage().verifyTotal("$2,950.00");
    }
    //2.18 click on checkbox “I agree with the terms of service
    @And("^I click on checkbox 'I agree with the terms of service'$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnTermsOfServiceCheckbox();
    }
    // 2.19 Click on “CHECKOUT”
    @And("^I click on 'CHECKOUT'$")
    public void iClickOnCHECKOUT() {
        new ShoppingCartPage().clickOnCheckOutBtn();
    }
    // 2.20 Verify the Text “Welcome, Please Sign In!”
    @Then("^I see the Text “Welcome, Please Sign In!”$")
    public void iSeeTheTextWelcomePleaseSignIn() {
        new SignInPage().verifyWelcomeText("Welcome, Please Sign In!");
    }
    // 2.21 Click on “CHECKOUT AS GUEST” Tab
    @And("^I click on 'CHECKOUT AS GUEST' Tab$")
    public void iClickOnCHECKOUTASGUESTTab() {
        new SignInPage().clickOnCheckoutAsGuestBtn();
    }
    // 2.22 Fill all the Mandatory Field
    @And("^I fill first \"([^\"]*)\"$")
    public void iFillFirst(String fname)  {
        // Input First Name
        new CheckoutPage().inputFirstName("Ramesh");

    }
    @And("^I input Last Name \"([^\"]*)\"$")
    public void iInputLastName(String laname)  {
        // Input Last Name
        new CheckoutPage().inputLastName("Patel");
    }

    @And("^I input email \"([^\"]*)\"$")
    public void iInputEmail(String email) {
        // Input Email
        new CheckoutPage().inputEmail("Ramesh100Patel@gmail.com");
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country)  {
        // Select Country
        new CheckoutPage().selectCountry("United Kingdom");
    }

    @And("^I input City \"([^\"]*)\"$")
    public void iInputCity(String city1)  {
        // Input City
        new CheckoutPage().inputCity("London");
    }

    @And("^I input Address \"([^\"]*)\"$")
    public void iInputAddress(String address1) {
        // Input Address
        new CheckoutPage().inputAddress("123 High Street");
    }

    @And("^I input ZipCode \"([^\"]*)\"$")
    public void iInputZipCode(String zipCode1)  {
        // Input ZipCode
        new CheckoutPage().inputZipCode("zipCode1");
    }

    @And("^I input Telephone \"([^\"]*)\"$")
    public void iInputTelephone(String telNum)  {
        // Input Telephone
        new CheckoutPage().inputTelephoneNumber("12345678");
    }
    // 2.23 Click on “CONTINUE”
    @And("^I click on the 'CONTINUE'$")
    public void iClickOnTheCONTINUE() {
        new CheckoutPage().clickOnContinueBtn();
    }
    // 2.24 Click on Radio Button “Next Day Air($0.00)”
    @And("^I click on Radio Button 'Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)'$")
    public void iClickOnRadioButtonNextDayAir$(int arg0, int arg1) {
        new CheckoutPage().clickOnNextDayAirRadioBtn();
    }
    // 2.25 Click on “ Shipping CONTINUE”
    @And("^I click on 'CONTINUE'$")
    public void iClickOnCONTINUE() {
        new CheckoutPage().clickOnContinueOnShipping();
    }
    // 2.26 Select Radio Button “Credit Card”
    @And("^I select Radio Button 'Credit Card'$")
    public void iSelectRadioButtonCreditCard() {
        new CheckoutPage().clickOnCreditCard();
    }
    // 2.27 Select “Master card” From Select credit card dropdown
    @And("^I select 'Master card' From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {
        new CheckoutPage().clickOnPaymentContinue();
    }
    @And("^I fill all the details$")
    public void iFillAllTheDetails() throws InterruptedException {
        // Select Master card
        new CheckoutPage().selectCreditCard("Master card");
        // Input Cardholder Name
        new CheckoutPage().inputCardHolderName("Lisa Webb");
        // Input Card Number
        new CheckoutPage().inputCardNumber("5356654814185420");
        // Select Expire Month
        new CheckoutPage().selectExpireMonth("09");
        // Select Expire year
        new CheckoutPage().selectExpireYear("2026");
        // Input card code
        new CheckoutPage().inputCardCode("123");
    }
    // 2.29 Click on “CONTINUE”
    @And("^I should click on 'CONTINUE'$")
    public void iShouldClickOnCONTINUE() {
        new CheckoutPage().clickOnContinuCardPayment();
    }
    // 2.30 Verify “Payment Method” is “Credit Card”
    @And("^I can see 'Payment Method' is “Credit Card”$")
    public void iCanSeePaymentMethodIsCreditCard() {
        new CheckoutPage().verifyPaymentMethod("Credit Card");
    }
    // 2.32 Verify “Shipping Method” is “Next Day Air”
    @And("^I can see 'Shipping Method' is “Next Day Air”$")
    public void iCanSeeShippingMethodIsNextDayAir() {
        new CheckoutPage().verifyShippingMethod("Next Day Air");
    }
    // 2.33 Verify Total is “$2,950.00”
    @And("^I can see Total is “\\$(\\d+),(\\d+)\\.(\\d+)”$")
    public void iCanSeeTotalIs$(int a, int b, int c) {
        new CheckoutPage().verifyTotal("$2,950.00");
    }
    // 2.34 Click on “CONFIRM”
    @And("^I can click on 'CONFIRM'$")
    public void iCanClickOnCONFIRM() {
        new CheckoutPage().clickOnConfirm();
    }
    // 2.35 Verify the Text “Thank You”
    @Then("^I see the Text “Thank You”$")
    public void iSeeTheTextThankYou() {
        new CheckoutPage().verifyThankYou("Thank you");
    }
    // 2.36 Verify the message “Your order has been successfully processed!”
    @Then("^I see the message “Your order has been successfully processed!”$")
    public void iSeeTheMessageYourOrderHasBeenSuccessfullyProcessed() {
        new CheckoutPage().verifyOrderConfirmation("Your order has been successfully processed!");
    }
    // 2.37 Click on “CONTINUE”
    @And("^I click on the 'CONTINUE' button$")
    public void iClickOnTheCONTINUEButton() {
        new CheckoutPage().clickOnContinue();
    }
    // 2.38 Verify the text “Welcome to our store”
    @Then("^I can see the text “Welcome to our store”$")
    public void iCanSeeTheTextWelcomeToOurStore() {
        new HomePage().verifyTheTextWelcomeToOurStore("Welcome to our store");
    }
}
