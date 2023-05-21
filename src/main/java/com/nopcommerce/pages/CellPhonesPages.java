package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPages extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPages.class.getName());

    public CellPhonesPages() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    WebElement cellphones;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']")
    WebElement productNokiaLumia1020;

    public void verifyTextCellPhone(String expText) {
        verifyElements(cellphones, expText, "Error text not displayed");
        log.info("Verify text : " + expText.toString());
    }

    public void clickOnListTab() {
        clickOnElement(listView);
        log.info("Click on list : " + listView.toString());
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(productNokiaLumia1020);
        log.info("Click on nokia lumia : " + productNokiaLumia1020.toString());
    }

}
