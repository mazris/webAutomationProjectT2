import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        driver.navigate().to("https://www.hotels.com/");
    }


    @Test(priority = 1)
    public void testDealsLink(){
        homePage.clickMenuLink("Deals","https://www.hotels.com/hotel-deals/?intlid=HOME+%3A%3A+header_main_section");

    }
    @Test(priority = 2)
    public void testPackagesFlightsLink(){
        homePage.clickMenuLink("Packages & Flights","https://travel.hotels.com/?intlid=HOME+%3A%3A+header_main_section");
    }

    @Test(priority = 3)
    public void testGroupsMeatings(){
        homePage.clickMenuLink("Groups & Meetings","https://groups.hotels.com/Group-Rate/?locale=en_US&intlid=HOME+%3A%3A+header_main_section&kw=header");
    }

    @Test(priority = 4)
    public void testGiftCard(){
        homePage.clickMenuLink("Gift Cards","https://www.hotels.com/");

    }

    @Test(priority = 5)
    public void testListYourProperty(){
        homePage.clickMenuLink("List your property","https://join.expediapartnercentral.com/en/hcom/?utm_placement=header&utm_campaign=HOME&intlid=HOME+%3A%3A+header_main_section&utm_content=header");

    }

    @Test(priority = 6)
    public void testhotelscomRewards(){
        homePage.clickMenuLink("Hotels.com® Rewards","https://www.hotels.com/hotel-rewards-pillar/hotelscomrewards.html?intlid=HOME+%3A%3A+header_main_section");

    }

    @Test(priority = 7)
    public void testUSDButton(){

        homePage.clickButton("//*[@id='header-toggle-currency']");

    }
    @Test(priority = 8)
    public void testYourBookingButton(){
        homePage.clickButton("//*[@id='hdr-customer-bookings']");

    }

    @Test(priority = 9)
    public void testCreateAccountButton(){
        homePage.clickButton("//*[@id='hdr-create']");
    }
    @Test(priority = 10)
    public void testSignInButton(){
        homePage.clickButton("//*[@id='header-sign-in']");
    }



    @Test(priority = 11)
    public void testWhereTo(){
        homePage.whereToGo();

    }

    //Choose one of the following to unlock Secret Prices and pay less on select properties.
   @Test(priority = 12)
    public void testEmail(){
       //clickOnCss("//*[@id='ftr-newsletter']");
     homePage.clickButton("//a[@id='ftr-newsletter']");

   }
   @Test(priority = 13)
    public void testHotelsApp(){
       homePage.clickButton("//*[@id='ftr-hcom-app']");
   }


  @Test(priority = 15)
    public void testLasVegasImg(){

     homePage.lasVegasImg();
  }
/*8
  @Test(priority = 16)
    public void testSanDiegoImg(){
     homePage.sanDiegoImg();
  }
**/
  @Test(priority = 17)
    public void testNYImg(){
      homePage.nyImg();
  }
  @Test(priority = 19)
    public void testSanFrancisco(){
      homePage.sanFranciscoImg();
  }
  @Test(priority = 20)
    public void testMoreDestinationButton(){
      homePage.moreDestinationButton();
  }




}
