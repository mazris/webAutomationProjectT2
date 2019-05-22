import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CnnHealthTest extends CommonAPI {
    CnnHealth CnnHealth;
    @BeforeMethod
    public void init(){
        CnnHealth= PageFactory.initElements(driver,CnnHealth.class);
        driver.navigate().to("https://www.cnn.com/health");
    }

    @Test(priority = 43)
    public void healthpageinfo(){

        CnnHealth.healthpage();
        sleepFor(2);
    }

    @Test(priority = 44)
    public void foodpageinfo(){
        CnnHealth.foodpage();
        driver.navigate().back();
    }

    @Test(priority = 45)
    public void fitnesspageinfo(){
        CnnHealth.fitnesspage();
        driver.navigate().back();
    }
    @Test(priority = 46)
    public void wellnesspageinfo(){
        CnnHealth.welnesspage();
        driver.navigate().back();
    }
    @Test(priority = 47)
    public void parentingpageinfo(){
        CnnHealth.parentingpage();
        driver.navigate().back();
    }

    @Test(priority = 48)
    public void livelongerpageinfo(){
        CnnHealth.livelongerpage();
    }
}



