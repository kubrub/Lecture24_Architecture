package po;

import elements.Button;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SideFilters extends AbstractPO{
    Logger LOGGER = LogManager.getLogger(SideFilters.class);
    @FindBy(xpath = "//a[@class='checkbox-filter__link' and @ data-id='HP']")
    public Button buttonHP;

    public void clickButtonHP() {
        try {
            TimeUnit.SECONDS.sleep(3);
            LOGGER.info("Click HP button on side filter");
            buttonHP.click();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
