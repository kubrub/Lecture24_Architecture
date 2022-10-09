package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webDriver.DriverManager;

public abstract class DriverSet {
    public static WebDriver webDriver;

    @BeforeClass
    public void setWebDriver(){
        DriverManager.createDriver();
        webDriver = DriverManager.getWebDriver();
    }

    @AfterClass
    public void quiteDriver(){
        webDriver.quit();
    }
}
