import base.CommonAPI;
import org.openqa.selenium.By;

public class GiftCards extends CommonAPI {

    public void clickLink(String linktext,String expectedUrl){
        driver.findElement(By.linkText(linktext)).click();
        if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
            System.out.println(linktext+" Url is passed");
        else  System.out.println(linktext+" Url is failed");
    }
    public void register(){
        clickOnCss("div.resp-section:nth-child(3) main.inner-section div.resp-row div.resp-col.resp-xs1.resp-s2.resp-m6.resp-ml6.resp-l12.resp-xl12.container-custompage.custompage div.resp-row.resp-section:nth-child(2) div.resp-col.resp-xs1.resp-s2.resp-m6.resp-ml6.resp-l12.resp-xl12.container-custompage:nth-child(2) div.resp-row.resp-section div.resp-col.resp-xs1.resp-s1.resp-m2.resp-ml2.resp-l3.resp-xl3.custom-teaser:nth-child(1) div.resp-module div.text-wrapper.button-style:nth-child(2) div.link-wrapper > a.cta");
        //giftCards.clickLink("Register","https://hotels.egifter.com/registry");
    }
    public void balanceService(){
        clickOnCss("div.resp-section:nth-child(3) main.inner-section div.resp-row div.resp-col.resp-xs1.resp-s2.resp-m6.resp-ml6.resp-l12.resp-xl12.container-custompage.custompage div.resp-row.resp-section:nth-child(2) div.resp-col.resp-xs1.resp-s2.resp-m6.resp-ml6.resp-l12.resp-xl12.container-custompage:nth-child(2) div.resp-row.resp-section div.resp-col.resp-xs1.resp-s1.resp-m2.resp-ml2.resp-l3.resp-xl3.custom-teaser:nth-child(2) div.resp-module div.text-wrapper.button-style:nth-child(2) div.link-wrapper > a.cta");
        // giftCards.clickLink("Balance Services","https://www.hotels.com/page/temporary-balance-check/");
    }
    public void Exchange(){
        clickLink("Exchange","https://hotels.cardcash.com/");
    }
    public void learnMore(){
        clickLink("Learn More","https://www.ngc-group.com/hotelscom");
    }
    public void hotelNearMe(){
        clickLink("Hotels near me","https://www.hotels.com/hotels-near-me");

    }
    public void travelGuide(){
        clickLink("Travel Guides","https://www.hotels.com/go");
    }
    public void lastlink(){
        clickLink("* Learn more about Hotels.com® Rewards","https://www.hotels.com/hotel-rewards-pillar/hotelscomrewards.html");

    }
}
