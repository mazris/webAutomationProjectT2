import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPackages_Flights extends Packages_Flights {
    Packages_Flights pf;
    @BeforeMethod
    public void init(){
        pf= PageFactory.initElements(driver, Packages_Flights.class);
        driver.navigate().to("https://travel.hotels.com/?intlid=HOME+%3A%3A+header_main_section");
    }


    @Test(priority = 21)
    public void testFlightOnlyButton(){

       pf.flightOnlyButton();
    }

    @Test(priority = 22)
    public void testThigsTodoButton(){
        pf.thingsToDoButton();
    }
  @Test(priority = 23)
  public void testFlightHotelButton(){
      pf.flightHotelButton();
  }

  @Test(priority = 24)
    public void testimglinkTodaysTopDeal(){
     pf.todayTopDeal();
  }

  @Test(priority = 25)
    public void testimglinknypackages(){
      pf.nypackages();
  }

  @Test(priority = 26)
    public void testimglinkThingstdinvegas(){
        pf.thingtdInvegas();
      }
    //Explore morelinks
  @Test(priority = 27)
    public void testTop50cities(){
        pf.top50();
  }
  @Test(priority = 28)
    public void testAllcontries(){
      pf.allContries();
  }
    @Test(priority = 29)
    public void testAllHotel(){
        pf.allHotels();
    }
    @Test(priority = 30)
    public void testHotels(){
     pf.hotels();
    }
    @Test(priority = 31)
    public void testTravelGuide(){
      pf.travelGuide();
    }
  @Test(priority = 32)
    public void testTravelBlog(){
      pf.travelBlog();
  }
  @Test(priority = 33)
    public void testAboutUs(){
      pf.aboutUs();
  }
  @Test(priority = 34)
    public void testContactUs(){
      pf.contactUs();
  }

  @Test(priority = 35)
    public void testFAQs(){
      pf.FAQS();
  }
  @Test(priority = 36)
    public void testPrivacyPolicy(){
      pf.privacyPolicy();
    }
  @Test(priority = 37)
    public void testCookiePolicy(){
      pf.cookiePolicy();
  }
  @Test(priority = 38)
    public void testAboutOurAds(){

      pf.aboutOurAd(); }
    @Test(priority = 39)
    public void testSiteIndex(){
        pf.siteIndex();
    }
    @Test(priority = 40)
    public void testAddActivity(){
        pf.addActivity(); }




}
