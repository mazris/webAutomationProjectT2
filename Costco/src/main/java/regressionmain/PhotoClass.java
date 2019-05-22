package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PhotoClass extends CommonAPI {


    public void openpage () {
        driver.findElement(By.id("Home_Ancillary_5")).click();

    }
    public void setphonepage(){
        driver.findElement(By.linkText("Prints")).click();


    }
    public void photobooks (){
        driver.findElement(By.xpath("//*[@id=\"ctl00_NavPhotoBooks\"]")).click();
    }

    public void metalmeth(){
        driver.findElement(By.id("ctl00_NavCanvasPrints")).click();
    }
    public  void Giftpho (){
        driver.findElement(By.id("ctl00_NavShopAll")).click();


    }
    public void clickshopgif(){

        driver.findElement(By.linkText("Shop all photo gifts")).click();
    }
    public void walldec(){
        driver.findElement(By.cssSelector("#ctl00_NavImageGalleries")).click();
    }
    public void canvas(){
        driver.findElement(By.id("ctl00_NavCanvasPrints")).click();
    }







}
