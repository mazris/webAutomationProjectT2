package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HboKidsClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[5]/div/a")
    WebElement KidsButton;
    public void setKidsButton(){
        KidsButton.click();
    }
    @FindBy(css="#root > main > div.cf.w-100.components\\/Band--band.bands\\/MainNavigation--band > header > div.components\\" +
            "/Band--maxWidth > div.bands\\/MainNavigation--bottomBarTopContainer > div > div > div > ul > li:nth-child(2) > div > a")
    WebElement EsmeAndRoy;
    public void setEsmeAndRoy(){
        EsmeAndRoy.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[4]/div/div/p/b/a")
    WebElement ReadMoreBUtton;
    public void setReadMoreBUtton(){
        ReadMoreBUtton.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[3]/ul/li[2]/div/a")
    WebElement ScheduleButton;
    public void setScheduleButton(){
        ScheduleButton.click();
    }
    @FindBy(xpath="//*[@id=\"root\"]/main/section/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/span[1]")
    WebElement WestButton;
    public void setWestButton(){
        WestButton.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/span[2]")
    WebElement EastButton;
    public void setEastButton(){
        EastButton.click();
    }
    @FindBy(css= "#root > main > section > div:nth-child(1) > " +
            "div > div > div.bands\\/schedule\\/DaySelector--daySelectorWrapper > ul > li:nth-child(2) > span")
    WebElement YesterdayButton;
    public void setYesterdayButton(){
        YesterdayButton.click();

    }
    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[1]/div/div/div[1]/ul/li[3]/span")
    WebElement TodayButton;
    public void setTodayButton(){
        TodayButton.click();
    }
    @FindBy(xpath="//*[@id=\"root\"]/main/section/div[1]/div/div/div[1]/ul/li[4]/span")
    WebElement TomorrowButton;
    public void setTomorrowButton(){
        TomorrowButton.click();

    }
    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[1]/div/div/div[1]/ul/li[10]/span[1]")
    WebElement NextWeekButton;
    public void setNextWeekButton(){
        NextWeekButton.click();

    }
    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[1]/span/a/svg/g/g/path")
    WebElement HBOButton;
    public void setHBOButton(){
        NextWeekButton.click();
    }
    }
