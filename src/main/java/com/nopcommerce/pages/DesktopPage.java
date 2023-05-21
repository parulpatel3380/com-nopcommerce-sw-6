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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement sortByFilter;
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")//driver.findElement(By.xpath(""));
    WebElement addToCart;

    public void selectZToAFromSortByDropdown(String filter) {
        selectByVisibleTextFromDropDown(sortByDropdown, filter);
        log.info("Click on sort by name Z to A : " + sortByDropdown.toString());
    }
    public void clickOnSortByNameZToA(){
        selectByVisibleTextFromDropDown(sortByFilter,"Name: Z to A");
        log.info("Click on sort by name Z to A : " + sortByFilter.toString());
    }

    public void clickOnSortByNameAToZ(){
        selectByVisibleTextFromDropDown(sortByFilter,"Name: A to Z");
        log.info("Click on sort by name A to Z : " + sortByFilter.toString());
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCart);
        log.info("Click on add to cart button " + addToCart.toString());
    }


    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> elementList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        System.out.println("Total elements are : " + elementList.size());
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingElementList=driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName=new ArrayList<>();
        for(WebElement product1:afterSortingElementList){
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList,afterSortingProductName,"Products are not sorted in descending order");
        log.info("Product is sorted in descending order");
    }

}
