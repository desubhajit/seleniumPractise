package base;

import factory.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class BaseTest {

    protected WebDriver driver;


    @BeforeMethod
    public void StartDriver()
    {
        driver = new DriverManager().initializeChromeDriver();

    }


    @AfterMethod
    public void QuitDriver()
    {
        driver.quit();
    }

}
