package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.PropertyReader;

import java.time.Duration;


public class DriverManager {
    private static WebDriver webDriver;
    public static void createDriver(){
        System.setProperty(PropertyReader.getValue("name"), PropertyReader.getValue("driverPath"));
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(Long.parseLong(PropertyReader.getValue("timeout"))));
        webDriver.manage().window().maximize();
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }
}
