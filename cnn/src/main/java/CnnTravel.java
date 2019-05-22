import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.Callable;

public class CnnTravel extends CommonAPI {

    @FindBy(xpath = "//a[@class='Header__section'][contains(text(),'Destinations')]")
    WebElement DestinationsPage;

    @FindBy(xpath = "//a[@class='Header__section'][contains(text(),'Food & Drink')]")
    WebElement FoodAndDrinkPage;

    @FindBy(xpath = "//a[@class='Header__section'][contains(text(),'Play')]")
    WebElement PlayPage;

    @FindBy(xpath = "//a[@class='Header__section'][contains(text(),'Stay')]")
    WebElement StayPage;

   // @FindBy(xpath = "//*[@class='Header__section Header__video']")
   // WebElement VideoPage;

    public void destinationInfo(){
       DestinationsPage.click();
    }

    public void foodanddrinkinfo(){
        FoodAndDrinkPage.click();
    }

    public void playinfo(){
        PlayPage.click();
    }

    public void stayinfo(){
        StayPage.click();
    }

   // public void videoinfo(){
      //  VideoPage.click();
  //  }


}


