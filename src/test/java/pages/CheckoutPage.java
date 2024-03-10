package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By firstName = By.cssSelector("#billing_first_name");
    private final By lastname = By.id("billing_last_name");
    private final By addressLine1 = By.cssSelector("#billing_address_1");
    private final By addressLine2 = By.cssSelector("#billing_address_2");
    private final By city = By.cssSelector("#billing_city");
    private final By postCode = By.cssSelector("#billing_postcode");
    private final By email = By.cssSelector("#billing_email");
    private final By placeOrderButton = By.cssSelector("#place_order");
    private final By successMessage = By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received");


    public void setFirstname(String fname)
    {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void setLastname(String lname)
    {
        driver.findElement(lastname).sendKeys(lname);
    }

    public void setAddressLine1(String add1)
    {
        driver.findElement(addressLine1).sendKeys(add1);
    }

    public void setAddressLine2(String add2)
    {
        driver.findElement(addressLine2).sendKeys(add2);
    }

    public void setCity(String citys)
    {
        driver.findElement(city).sendKeys(citys);
    }

    public void setPostCode(String pcode)
    {
        driver.findElement(postCode).sendKeys(pcode);
    }

    public void setEmail(String emailid)
    {
        driver.findElement(email).sendKeys(emailid);
    }

    public void clickPlaceOrder()
    {
        driver.findElement(placeOrderButton).click();
    }

    public String verifySuccessfulPurchase()
    {
      return  driver.findElement(successMessage).getText();
    }


}
