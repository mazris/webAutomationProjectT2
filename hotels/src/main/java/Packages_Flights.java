import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Packages_Flights extends CommonAPI {
    @FindBy(id = "package-advanced-preferred-class-hp-package")
    public static WebElement classtype;

    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void enterText(String xpath, String text){
        WebElement e= driver.findElement(By.xpath(xpath));
        e.clear();
        e.sendKeys(text);
    }
    public void checkBox(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void selectclasstype(String value){
        Select cls= new Select(classtype);
        cls.selectByValue(value);
    }
    public void imglink(String hrefpath){
       driver.findElement(By.xpath(hrefpath)).click();
    }
    public void clickLink(String linktext,String expectedUrl){
        driver.findElement(By.linkText(linktext)).click();
        if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
            System.out.println(linktext+" Url is passed");
        else  System.out.println(linktext+" Url is failed");
    }
   public void flightHotelButton(){
       if(isPopUpWindowDisplayed(driver,"body.wrap.cf:nth-child(2) section.hero-banner-wrap.wizard-hero.mercury.hero-no-title.background.d-col-ads.core-wizard-loaded.siteid-1170.theme-inverse-hero div.hero-banner.background.expanded div.hero-banner-gradient div.cols-row.hero-banner-inner section:nth-child(3) div.hero-banner-box.siteId-1170.cf div.cols-row.theme-inverse-pills.wizard-tabs.cols-nested.inline-fields:nth-child(2) > h1.widget-title"))
           System.out.println("Search Vacation Packages, Flights, and Things to Do is displayed");
       clickButton("//*[@id='tab-package-tab-hp']");
       typeOnElementNEnter("#package-origin-hp-package","New York, NY (JFK-John F. Kennedy Intl.)");
       // pf.enterText("//*[@id='package-origin-hp-package']","New York, NY (JFK-John F. Kennedy Intl.)");
       typeOnElementNEnter("#package-destination-hp-package","Algiers, Algeria");
       // pf.enterText("//*[@id='package-destination-hp-package']","Algiers, Algeria");
       typeByXpath("//*[@id='package-departing-hp-package']","12/03/2019");
      typeByXpath("//*[@id='package-returning-hp-package']","02/03/2020");
       clickButton("//*[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']");
       if(driver.findElement(By.xpath("//*[@class='traveler-selector-room-data target-clone-field']")).isDisplayed())
           System.out.println("displayed");
       checkBox("//*[@id='partialHotelBooking-hp-package']");
       selectclasstype("f");
       clickButton("//*[@id='search-button-hp-package']");
       sleepFor(4);
   }
   public void flightOnlyButton(){
       clickButton("//*[@id='tab-flight-tab-hp']");
       sleepFor(2);
   }
   public void thingsToDoButton(){
       clickButton("//*[@id='tab-activity-tab-hp']");
       sleepFor(2);
   }
   public void todayTopDeal(){
        clickOnCss("body.wrap.cf:nth-child(2) div.site-content-wrap:nth-child(15) div.rotating-promos:nth-child(2) div.discover-module.discovery-tiles section.uitk-carousel.is-enabled div.uitk-carousel-wrap:nth-child(1) div.uitk-grid.all-x-gutter-12.desktop-col-1-3.tablet-col-1-3.smalltablet-col-1-3.flex-tile.flex-theme-light.flex-same-height.uitk-carousel-items.uitk-grid.all-grid-nowrap.mobile-col-1-1.smalltablet-col-1-2.tablet-col-1-3.desktop-col-1-3.all-x-gutter-12 div.uitk-col.PaCE-banner.uitk-carousel-item:nth-child(1) > div.flex-card.has-link");
       // imglink("//a[@href='https://travel.hotels.com/g/dd/dailydeals?langid=1033?MDPCID=HCOM-US.TPS.BRAND.DailyPackageDeals.PACKAGE']");
       sleepFor(4);
   }
   public void nypackages(){
       imglink("//a[@href='https://travel.hotels.com/g/pt/nychighgateoct2018?langid=1033?MDPCID=HCOM-US.TPS.BRAND.NYCHighGate.PACKAGE']");
       sleepFor(2);
   }
   public void thingtdInvegas(){
       imglink("//a[@href='http://travel.hotels.com/things-to-do/?location=Las%20Vegas,%20Nevada']");

   }
   public void top50(){
       clickLink("Top 50 Cities","https://www.hotels.com/alltop50cities/");
       sleepFor(1);
   }
   public void allContries(){
       clickLink("All countries","https://www.hotels.com/allcountries/");
       sleepFor(1);
   }
   public void allHotels(){
       clickLink("All hotels","https://www.hotels.com/");
       sleepFor(1);
   }
   public void hotels(){
       clickLink("Hotels","https://www.hotels.com/");
       sleepFor(1);
   }
   public void travelGuide(){
       clickLink("Travel Guides","https://www.hotels.com/articles/");
       sleepFor(1);
   }
   public void travelBlog(){
       clickLink("Travel Blog","https://www.hotels.com/");
       sleepFor(1);
   }
   public void aboutUs(){
       clickLink("About Us","https://www.hotels.com/customer_care/about_us.html");
       sleepFor(1);
   }
   public void contactUs(){
       clickLink("Contact Us","https://service.hotels.com/en-GB/");
       sleepFor(1);
   }
   public void FAQS(){
       clickLink("FAQs","https://service.hotels.com/en-GB/");
   }
   public void privacyPolicy(){
       clickLink("Privacy Policy","https://www.hotels.com/customer_care/privacy.html");

   }
   public void cookiePolicy(){
       clickLink("Cookie Policy","https://www.hotels.com/customer_care/cookie_policy.html");
       handleNewTab(driver);
       System.out.println(driver.getCurrentUrl());
       sleepFor(4);
   }
   public void aboutOurAd(){
       clickLink("About our Ads","https://www.hotels.com/customer_care/about_our_ads.html");

   }
   public void siteIndex(){
       clickLink("Site Index","https://www.hotels.com/site-index/");

   }
   public void addActivity(){
       clickLink("Add an Activity","https://join.localexpertpartnercentral.com/");

   }



}
