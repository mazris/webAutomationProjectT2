package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetHboClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/div/a/span")
     WebElement GETHBO;

    public void setGETHBO(){
        GETHBO.click();
    }

   @FindBy(xpath = "/html/body/div[3]/div[1]/div/div/div[2]/div/li/section/div/div/a")
            WebElement FREETRAIL;
    public void setFREETRAIL(){
        FREETRAIL.click();

    }


    }






    /*public void clickMenuLink(String linktext,String expectedUrl){
        driver.findElement(By.linkText(linktext)).click();
        if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
            System.out.println(linktext+" Url is passed");
        else  System.out.println(linktext+" Url is failed");
    }
    public void clickMenuButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }*/



