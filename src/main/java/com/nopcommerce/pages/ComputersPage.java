package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputersPage.class.getName());

    public ComputersPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='block block-category-navigation']/descendant::a[2]")
    WebElement desktops;

    public void clickOnDesktop() {
        clickOnElement(desktops);
        log.info("Clicking on login link : " + desktops.toString());
    }
}
