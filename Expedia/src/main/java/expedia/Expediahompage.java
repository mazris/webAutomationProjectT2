package expedia;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Expediahompage extends CommonAPI {
    @FindBy(xpath = "//*[@id='primary-header-flight']")
    WebElement flight;
    @FindBy(xpath = "//*[@id=\"tab-hotel-tab-hp\"]/span[2]")
    WebElement hotels;
    @FindBy(xpath = "//*[@id=\"tab-car-tab-hp\"]/span[2]")
    WebElement cars;
    @FindBy(xpath = "//*[@id=\"tab-cruise-tab-hp\"]/span[2]")
    WebElement cruise;
    @FindBy(xpath = "//*[@id=\"tab-activity-tab-hp\"]/span[2]")
    WebElement things;
    @FindBy(xpath = "//*[@id=\"tab-vacation-rental-tab-hp\"]/span[2]")
    WebElement vacation;
    @FindBy(xpath = "//*[@id=\"gcw-hotel-form-hp-vacationRental\"]/div[5]/label/button")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"primary-header-flight\"]")
    WebElement flightButton;
    @FindBy(xpath = "//*[@id=\"primary-header-hotel\"]")
    WebElement hotelButton;
    @FindBy(xpath = "//*[@id=\"primary-header-package\"]")
    WebElement bundleNSaveButton;
    @FindBy(xpath = "//*[@id=\"primary-header-car\"]")
    WebElement carsButton;
    @FindBy(xpath = "//*[@id=\"primary-header-cruise\"]")
    WebElement cruiseButton;
    @FindBy(xpath = "//*[@id=\"primary-header-activity\"]")
    WebElement thingsButton;
    @FindBy(xpath = "//*[@id=\"all-in-header-shop-menu\"]")
    WebElement moreMenuButton;
    @FindBy(xpath = "//*[@id=\"header-partner-add-hotel-container\"]/a")
    WebElement addPropertyButton;
    @FindBy(xpath = "//*[@id=\"header-account-menu\"]")
    WebElement accountButton;
    @FindBy (xpath = "//*[@id=\"header-history\"]/span[1]")
    WebElement myListButton;
    @FindBy(xpath = "//*[@id=\"header-itineraries\"]")
    WebElement myTripsButton;
    @FindBy(xpath = "//*[@id=\"header-support-menu\"]")
    WebElement supportButton;
    @FindBy(xpath = "//*[@id=\"header-language-2058\"]")
    WebElement languageButton;
    @FindBy(xpath = "//*[@id=\"cupid-weekendgetaways-602179\"]/div/a")
    WebElement atlanticCity;
    @FindBy(xpath = "//*[@id=\"expedia-partners-links\"]/li[1]/a")
    WebElement egunciaBusinessTravel;
    @FindBy(xpath = "//*[@id=\"expedia-partners-links\"]/li[2]/a")
    WebElement expediaPartnerSolution;
    @FindBy(xpath = "//*[@id=\"expedia-partners-links\"]/li[3]/a")
    WebElement hotelscom;
    @FindBy(xpath = "//*[@id=\"expedia-partners-links\"]/li[4]/a")
    WebElement hotwire;
    @FindBy(xpath = "//*[@id=\"expedia-partners-links\"]/li[5]/a")
    WebElement citySearch;
    @FindBy(xpath = "//*[@id=\"expedia-partners-links\"]/li[6]/a")
    WebElement onlineShopping;
    @FindBy(xpath = "//*[@id=\"gss-signin-submit\"]")
    WebElement dropdown;

    public void testdropdown(){ Select select = new Select(dropdown);
        dropdown.click();
        select.selectByIndex(1);
    }



    public void setFlight(){ flight.click(); }
    public void setHotels(){hotels.click();}
    public void setCars(){cars.click();}
    public void setCruise(){cruise.click();}
    public void setThings(){things.click();}
    public void setVacation(){vacation.click();}
    public void setSearch(){search.click();}
    public void setFlightButton(){flightButton.click();}
    public void setHotelButton(){hotelButton.click();}
    public void setBundleNSaveButton(){bundleNSaveButton.click();}
    public void setCarsButton(){carsButton.click();}
    public void setCruiseButton(){cruiseButton.click();}
    public void setThingsButton(){thingsButton.click();}
    public void setMoreMenuButton(){moreMenuButton.click();}
    public void setAddPropertyButton(){addPropertyButton.click();}
    public void setAccountButton(){accountButton.click();}
    public void setMyListButton(){myListButton.click();}
    public void setMyTripsButton(){myTripsButton.click();}
    public void setSupportButton(){supportButton.click();}
    public void setLanguageButton(){languageButton.click();}
    public void setAtlanticCity(){atlanticCity.click();}
    public void setEgunciaBusinessTravel(){egunciaBusinessTravel.click();}
    public void setExpediaPartnerSolution(){expediaPartnerSolution.click();}
    public void setHotelscom(){hotelscom.click();}
    public void setHotwire(){hotwire.click();}
    public void setCitySearch(){citySearch.click();}
    public void setOnlineShopping(){onlineShopping.click();}

}
