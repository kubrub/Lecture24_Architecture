package bo;

import po.SideFilters;
import po.TopBar;

public class RozetkaMainPageBO {
    SideFilters sideFilters;
    TopBar topBar;
    public  RozetkaMainPageBO(){
        topBar = new TopBar();
        sideFilters = new SideFilters();
    }

    public void fillInputAndClickButtonSearch(String value){
        topBar.fillSearchInput(value);
        topBar.clickSearchButton();
    }

    public void chooseFirmHPAndExpensive(){
        sideFilters.clickButtonHP();
        topBar.clickOnChooseDropdownExpensive();
    }

    public void addFirstItemAndOpenBucket(){
        topBar.addFirstItemToBucket();
        topBar.clickButtonBucket();
    }

}
