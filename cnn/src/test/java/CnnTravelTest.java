import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnTravelTest extends CommonAPI {

    CnnTravel CnnTravel;

    @BeforeMethod

    public void init() {


        CnnTravel = PageFactory.initElements(driver,CnnTravel.class);
        driver.navigate().to("https://www.cnn.com/travel");
    }
    @Test(priority = 54)
    public void destinationspageinfo(){
        CnnTravel.destinationInfo();
        sleepFor(2);
    }

    @Test(priority = 55)
    public void foodanddrinkinfo(){
        CnnTravel.foodanddrinkinfo();
        sleepFor(2);
    }

    @Test(priority = 56)
    public void playpageinfo(){
        CnnTravel.playinfo();
        sleepFor(2);
    }

    @Test(priority = 56)
    public void staypageinfo(){
        CnnTravel.stayinfo();
        sleepFor(2);
    }

//    @Test(priority = 57)
//    public void videopageinfo(){
//        CnnTravel.videoinfo();
//        sleepFor(2);
//    }

}
