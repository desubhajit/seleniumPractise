package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    private final By storeName = By.cssSelector("li[id='menu-item-1227'] a[class='menu-link']");

    public void clickOnStoreMenu()
    {
        driver.findElement(storeName).click();
    }

}
