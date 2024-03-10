package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver)
    {
        super(driver);
    }


    private final By productTitle = By.cssSelector("td[class='product-name'] a");
    private final By checkoutBtn = By.cssSelector(".checkout-button");


    public String getTitleCartPage()
    {
        return driver.findElement(productTitle).getText();

    }

    public void clickCheckOutButton()
    {
        driver.findElement(checkoutBtn).click();
    }



}
