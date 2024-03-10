package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {
        super(driver);
    }

    private final By searchField = By.id("woocommerce-product-search-field-0");
    private final By searchBtn = By.cssSelector("button[value='Search']");
    private final By title = By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");

    private final By viewCartButton = By.cssSelector("a[title='View cart']");

    public void enterSearchItem(String str)
    {
        driver.findElement(searchField).sendKeys(str);
    }

    public void clickSearchButton()
    {
        driver.findElement(searchBtn).click();
    }

    public String getTitle()
    {
        return driver.findElement(title).getText();

    }

    public void clickAddToCartButton()
    {
        driver.findElement(addToCartBtn).click();
    }


    public void clickViewCartButton()
    {
        driver.findElement(viewCartButton).click();
    }
}
