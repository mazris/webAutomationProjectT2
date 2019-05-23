package Testexpediahompage;

import base.CommonAPI;
import expedia.Expediahompage;
import expedia.SignInExpedia;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testexpediahompage extends CommonAPI {
    Expediahompage home;
    SignInExpedia expedia;
    String url = "https://www.expedia.com/";

        @BeforeClass
        public void init() {
        home = PageFactory.initElements(driver,Expediahompage.class);
        expedia = PageFactory.initElements(driver,SignInExpedia.class);
        driver.get(url);
        }

        @AfterMethod
        public void getback() { driver.get(url);
        }
/*
        @Test
        public void clickonflight() { home.setFlight();
        driver.navigate().to(url);
        sleepFor(5);
        }

        @Test
        public void clickonhotels() { home.setHotels();
        }

        @Test
        public void clickcars(){ home.setCars();
        driver.navigate().to(url);
        }
        @Test
        public void clickcruise(){ home.setCruise();
        }

        @Test
        public void clickthings(){ home.setThings();
        }

        @Test
        public void clickvacation(){ home.setVacation();
        }

        @Test
        public void clicksearch(){ home.setSearch();
        driver.navigate().to(url);
        }

        @Test
        public void clickflightButton(){ home.setFlightButton();
        }

        @Test
        public void clickhotelButton(){ home.setHotelButton();
        sleepFor(5);
        }

        @Test
        public void clickbundleNSaveButton(){ home.setBundleNSaveButton();
       }

       @Test
        public void clickcarButton(){ home.setCarsButton();
       }

       @Test
        public void clickcruiseButton(){ home.setCruiseButton();
           sleepFor(2);
       }
       @Test
        public void clickthingsButton(){ home.setThingsButton();
       }

       @Test
        public void clickmoreMenuButton(){ home.setMoreMenuButton();
       }

       @Test
        public void clickaddPropertyButton(){ home.setAddPropertyButton();
       }

       @Test
        public void clickaccountButton(){ home.setAccountButton();
       }
       @Test

        public void clickmyListButton(){ home.setMyListButton();
       }

       @Test
        public void clickmyTripsButton(){ home.setMyTripsButton();
       }

        @Test
        public void clickSupportButton(){home.setSupportButton();
        }

        @Test
        public void clickLanguageButton(){home.setLanguageButton();
        }
*/
        @Test
        public void dropdowntest(){ home.testdropdown();
        }

/*
        @Test
        public void clickAtlanticCity(){home.setAtlanticCity();
        }

        @Test
        public void clickEginciaBusinessTravel(){home.setEgunciaBusinessTravel();
        }


        @Test
        public void clickExpediaPartnerSolution(){home.setExpediaPartnerSolution();
        }

        @Test
        public void clickHotelCom(){home.setHotelscom();
        }

        @Test
        public void clickHotwire(){home.setHotwire();
        }

        @Test
        public void clickCitySearch(){home.setCitySearch();
        }

        @Test
        public void clickOnlineShopping(){home.setOnlineShopping();
        }

 */
}
