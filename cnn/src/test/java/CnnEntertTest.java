import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnEntertTest extends CommonAPI {
    CnnEntert CnnEntert;

    @BeforeMethod
    public void init() {
        CnnEntert = PageFactory.initElements(driver, CnnEntert.class);
        driver.navigate().to("https://www.cnn.com/entertainment");
    }



    @Test(priority = 49)
    public void starspageinfo() {

        CnnEntert.starspage();
        sleepFor(2);
    }

    @Test(priority = 50)
    public void screenpageinfo() {

        CnnEntert.screenpage();
        sleepFor(2);
    }

    @Test(priority = 51)
    public void bingpageinfo() {

        CnnEntert.bingepage();
        sleepFor(2);
    }

    @Test(priority = 52)
    public void culturepageinfo() {

        CnnEntert.culturepage();
        sleepFor(2);
    }

    @Test(priority = 53)
    public void mediapageinfo() {

        CnnEntert.mediapage();
        sleepFor(2);
    }

}
