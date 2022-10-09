package tests;

import bo.RozetkaMainPageBO;
import org.testng.Assert;
import po.TopBar;
import util.PropertyReader;

public class Test extends DriverSet{
    RozetkaMainPageBO rozetkaMainPageBO;
    TopBar topBar;
    @org.testng.annotations.Test
    public void test() throws InterruptedException {
        webDriver.get(PropertyReader.getValue("url"));
        rozetkaMainPageBO = new RozetkaMainPageBO();
        topBar = new TopBar();
        rozetkaMainPageBO.fillInputAndClickButtonSearch("laptop");
        rozetkaMainPageBO.chooseFirmHPAndExpensive();
        rozetkaMainPageBO.addFirstItemAndOpenBucket();
        Thread.sleep(2000);
        String totalPriceOfProductsInBasket = topBar.getTotalPriceOfProductsInBasket();

        Assert.assertTrue(Integer.parseInt(totalPriceOfProductsInBasket) < 200000);
    }
}
