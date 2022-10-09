package po;

import elements.Button;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
public class TopBar extends AbstractPO{
    Logger LOGGER = LogManager.getLogger(TopBar.class);
    @FindBy(name = "search")
    public WebElement searchInput;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/button")
    public Button searchButton;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/rz-catalog-settings/div/rz-sort/select")
    public WebElement chooseDropdown;
    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[7]/rz-cart/button")
    public Button buttonBucket;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/app-buy-button/button")
    public Button addToBucketButton;
    //@FindBy(xpath = "//dd[@class='checkout-total__value checkout-total__value_size_large']")
    @FindBy(xpath = "/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-shopping-cart/div/div[1]/div/div/div/span")
    private WebElement totalPriseIfProductsInBasket;

    public String getTotalPriceOfProductsInBasket() {
        try{
            TimeUnit.SECONDS.sleep(5);
            LOGGER.info("Getting total price from basket");
            return totalPriseIfProductsInBasket.getText();
        }catch (InterruptedException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }
    }


    public void clickOnChooseDropdownExpensive(){
        try {
            LOGGER.info("Select class for dropdown and select an item with value - 2: expensive");
            TimeUnit.SECONDS.sleep(1);
            Select select = new Select(chooseDropdown);
            select.selectByValue("2: expensive");
        }catch (InterruptedException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }

    }
    public void clickButtonBucket(){
        LOGGER.info("Click on bucket button");
        try {
            TimeUnit.SECONDS.sleep(1);
            buttonBucket.click();
        }catch (InterruptedException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }
    }
    public void fillSearchInput(String message){
        LOGGER.info("Fill search input with massage - " + message);
        searchInput.sendKeys(message);
    }

    public void clickSearchButton(){
        LOGGER.info("Click on search button");
        searchButton.click();
    }

    public void addFirstItemToBucket(){
        try {
            TimeUnit.SECONDS.sleep(2);
            addToBucketButton.click();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
