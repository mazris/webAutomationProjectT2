import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CnnPoliticsTest extends CnnPolitics {


        CnnPolitics CnnPolitics;

        @BeforeMethod
        public void init() {
            CnnPolitics = PageFactory.initElements(driver, CnnPolitics.class);
            driver.navigate().to("https://www.cnn.com/politics");
        }


    @Test(priority = 31)
    public void congress(){
        CnnPolitics.Congress();
        sleepFor(6);


        }
    @Test(priority = 32)
    public void supremcourt(){
        CnnPolitics.SupremCourt();
        sleepFor(6);


    }
    @Test(priority = 33)
    public void factfirst() {
        CnnPolitics.FactFirst();
        sleepFor(6);
    }
    @Test(priority = 34)
    public void election() {
        CnnPolitics.Election();
        sleepFor(6);
    }
}
