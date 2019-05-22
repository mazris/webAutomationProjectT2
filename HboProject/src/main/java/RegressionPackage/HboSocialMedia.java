package RegressionPackage;

import base.CommonAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HboSocialMedia extends CommonAPI {

    @FindBy(xpath="//*[@id=\"root\"]/main/div[3]/footer/div[1]/div/div/ul/li[1]/a")
    WebElement Facebook;
    public void Social1(){
        Facebook.click();
    }
    @FindBy(xpath="//*[@id=\"root\"]/main/div[3]/footer/div[1]/div/div/ul/li[2]/a")
    WebElement Twiter;
    public void Social2(){
        Twiter.click();

    }
    @FindBy(css = "#root > main > div:nth-child(4) > footer > div.modules\\" +
            "/FollowHbo--darkGray > div > div > ul > li:nth-child(3) > a")
    WebElement Instagram;
    public void Social3(){
        Instagram.click();

    }
    @FindBy(css="#root > main > div:nth-child(4) > footer > div.modules\\/FollowHbo--darkGray > div > div > ul > li:nth-child(4) > a")
    WebElement Youtube;
    public void Social4(){
        Youtube.click();
    }

    }
