import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(id="qf-0q-compact-occupancy")
    public static WebElement rooms;
    @FindBy(id ="query-recommended-destination-q-localised-check-in")
    public static WebElement checkin;
    @FindBy(id="query-recommended-destination-q-localised-check-out")
    public static WebElement checkout;
    @FindBy(id="query-recommended-destination-q-compact-occupancy")
    public static WebElement imgroom;

    public void clickMenuLink(String linktext,String expectedUrl){
       driver.findElement(By.linkText(linktext)).click();
       if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
           System.out.println(linktext+" Url is passed");
         else  System.out.println(linktext+" Url is failed");
    }
    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void whereToGo(){
        typeByXpath("//*[@id='qf-0q-destination']","Bahamas");
        // homePage.enterText("//*[@id='qf-0q-destination']","Bahamas");
        List<String> textcheckin= new ArrayList<String>();
        textcheckin=getTextFromWebElements("#widget-query-label-2");
        for(String text: textcheckin){
            if(text.equals("Check in"))System.out.println("Check in displayed");
        }

        typeByXpath("//*[@id='qf-0q-localised-check-in']","05/20/19");
        //  homePage.enterText("//*[@id='qf-0q-localised-check-in']","05/20/19");
        List<String> textcheckout= new ArrayList<String>();
        textcheckout=getTextFromWebElements("#widget-query-label-4");
        for(String text: textcheckout){
            if(text.equals("Check out"))System.out.println("Check out displayed");
        }
        typeByXpath("//*[@id='qf-0q-localised-check-out']","05/27/19");
        // homePage.enterText("//*[@id='qf-0q-localised-check-out']","05/27/19");
        selectOptionByVisibleText(rooms,"1 room, 1 adult");
        //homePage.selectroom("1 room, 1 adult");

        //clickOnCss("//button[@class='cta cta-strong']");
        getScreenshot(driver);
    }
    public void lasVegasImg(){
        clickOnCss("body.LTR:nth-child(2) div.site-wrap div.homepage div.row.mb-dog.recommended-destinations:nth-child(5) div.col-12 div.recommended-destinations-content div.destinations-container div.destinations-row.row.mb-spider.mb-bird--m:nth-child(1) div.destination-main.main.col-12.col-m6.col-l8:nth-child(1) a:nth-child(1) div.destination.of-h.po-r.br-bee > div.destination-overlay.cursor.po-a.post-none.posl-none.w-full.h-full");
        checkin.clear();
        checkin.sendKeys("05/22/2019");
        checkout.clear();
        checkout.sendKeys("05/27/2019");
        selectOptionByVisibleText(imgroom,"1 room, 1 adult");
        clickButton("//button[@class='cta widget-overlay-ok']");
        sleepFor(3);
    }
  public void sanDiegoImg(){
      clickOnCss("body.LTR:nth-child(2) div.site-wrap div.homepage div.row.mb-dog.recommended-destinations:nth-child(5) div.col-12 div.recommended-destinations-content div.destinations-container div.destinations-row.row.mb-spider.mb-bird--m:nth-child(1) div.destination-main.sub.col-12.col-m6.col-l4.float-right:nth-child(4) a:nth-child(1) div.destination.of-h.po-r.br-bee > div.destination-overlay.cursor.po-a.post-none.posl-none.w-full.h-full");
      checkin.clear();
      checkin.sendKeys("05/24/2019");
      checkout.clear();
      checkout.sendKeys("05/27/2019");
      selectOptionByVisibleText(imgroom,"1 room, 1 adult");
      clickButton("//button[@class='cta widget-overlay-ok']");
      sleepFor(3);
  }
  public void nyImg(){
      clickOnCss("body.LTR:nth-child(2) div.site-wrap div.homepage div.row.mb-dog.recommended-destinations:nth-child(5) div.col-12 div.recommended-destinations-content div.destinations-container div.destinations-row.row.mb-spider.mb-bird--m:nth-child(1) div.destination-main.main.col-12.col-m6.col-l8.float-right:nth-child(5) a:nth-child(1) div.destination.of-h.po-r.br-bee > div.destination-overlay.cursor.po-a.post-none.posl-none.w-full.h-full");
      checkin.clear();
      checkin.sendKeys("05/24/2019");
      checkout.clear();
      checkout.sendKeys("05/27/2019");
      selectOptionByVisibleText(imgroom,"1 room, 1 adult");
      clickButton("//button[@class='cta widget-overlay-ok']");
      sleepFor(3);
  }
  public void sanFranciscoImg(){
        clickOnCss("body.LTR:nth-child(2) div.site-wrap div.homepage div.row.mb-dog.recommended-destinations:nth-child(5) div.col-12 div.recommended-destinations-content div.destinations-container div.destinations-row.row.mb-spider.mb-bird--m:nth-child(1) div.destination-main.sub.col-12.col-m6.col-l4.float-right:nth-child(6) a:nth-child(1) div.destination.of-h.po-r.br-bee > div.destination-overlay.cursor.po-a.post-none.posl-none.w-full.h-full");
      checkin.clear();
      checkin.sendKeys("05/24/2019");
      checkout.clear();
      checkout.sendKeys("05/27/2019");
      selectOptionByVisibleText(imgroom,"1 room, 1 adult");
      clickButton("//button[@class='cta widget-overlay-ok']");
      sleepFor(3);
    }
    public void moreDestinationButton(){
        clickOnCss("body.LTR:nth-child(2) div.site-wrap div.homepage div.row.mb-dog.recommended-destinations:nth-child(5) div.col-12 div.recommended-destinations-content div.destinations-container div.row.mt-bird--m:nth-child(3) div.col-12.ta-c > button.show-more-btn.cl.ta-c.w-full.p-mouse.bgc-hds-white.br-spider.bw-ant.bs-solid.bc-hds-button-1.c-hds-button-1.fs-bird");
        if(isPopUpWindowDisplayed(driver,"body.LTR:nth-child(2) div.site-wrap div.homepage div.row.mb-dog.recommended-destinations:nth-child(5) div.col-12 div.recommended-destinations-content div.destinations-container div.row.hidden-destination.po-r.shown:nth-child(2) div.destination-main.main.col-12.col-m6.col-l8:nth-child(1) a:nth-child(1) div.destination.of-h.po-r.br-bee > div.destination-overlay.cursor.po-a.post-none.posl-none.w-full.h-full"))
            System.out.println("Houston is displayed");
        else System.out.println("Housten is not displayed");
    }







}
