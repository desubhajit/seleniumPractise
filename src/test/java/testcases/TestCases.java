package testcases;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.StorePage;

public class TestCases extends BaseTest {


    @Test
    public void PlaceOrderWithGuestLogin()
    {
        driver.get("https://askomdch.com/");

        //Homepage
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickOnStoreMenu();

        //StorePage
        StorePage storePageObj = new StorePage(driver);
        storePageObj.enterSearchItem("Blue");
        storePageObj.clickSearchButton();
        Assert.assertEquals(storePageObj.getTitle(),"Search results: “Blue”");
        storePageObj.clickAddToCartButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        storePageObj.clickViewCartButton();


        //CartPage
        CartPage cartPageObj = new CartPage(driver);
        Assert.assertEquals(cartPageObj.getTitleCartPage(),"Blue Shoes");
        cartPageObj.clickCheckOutButton();


        //CheckoutPage
        CheckoutPage chkoutpageObj = new CheckoutPage(driver);
        chkoutpageObj.setFirstname("Subhajit");
        chkoutpageObj.setLastname("Dey");
        chkoutpageObj.setAddressLine1("katraj");
        chkoutpageObj.setAddressLine2("Ambegaon");
        chkoutpageObj.setCity("Pune");
        chkoutpageObj.setPostCode("94188");
        chkoutpageObj.setEmail("abcd@ghgh.com");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chkoutpageObj.clickPlaceOrder();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(chkoutpageObj.verifySuccessfulPurchase(),"Thank you. Your order has been received.");


    }


    @Test
    public void PlaceOrderWithLogin()
    {
        driver.get("https://askomdch.com/");

        //Homepage
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickOnStoreMenu();

        //StorePage
        StorePage storePageObj = new StorePage(driver);
        storePageObj.enterSearchItem("Blue");
        storePageObj.clickSearchButton();
        Assert.assertEquals(storePageObj.getTitle(),"Search results: “Blue”");
        storePageObj.clickAddToCartButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        storePageObj.clickViewCartButton();


        //CartPage
        CartPage cartPageObj = new CartPage(driver);
        Assert.assertEquals(cartPageObj.getTitleCartPage(),"Blue Shoes");
        cartPageObj.clickCheckOutButton();


        //CheckoutPage
        CheckoutPage chkoutpageObj = new CheckoutPage(driver);
        chkoutpageObj.setFirstname("Subhajit");
        chkoutpageObj.setLastname("Dey");
        chkoutpageObj.setAddressLine1("katraj");
        chkoutpageObj.setAddressLine2("Ambegaon");
        chkoutpageObj.setCity("Pune");
        chkoutpageObj.setPostCode("94188");
        chkoutpageObj.setEmail("abcd@ghgh.com");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chkoutpageObj.clickPlaceOrder();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(chkoutpageObj.verifySuccessfulPurchase(),"Thank you. Your order has been received.");


    }

}
