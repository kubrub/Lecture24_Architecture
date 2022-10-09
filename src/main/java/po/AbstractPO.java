package po;

import elements.Decorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import webDriver.DriverManager;

public abstract class AbstractPO {
    public AbstractPO(){
        PageFactory.initElements(new Decorator(new DefaultElementLocatorFactory(DriverManager.getWebDriver())), this);
    }
}
