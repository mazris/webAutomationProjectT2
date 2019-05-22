import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnWorldInfoTest extends CnnWorldInfo {


    CnnWorldInfo CnnWorldInfo;

    @BeforeMethod
    public void init() {
        CnnWorldInfo = PageFactory.initElements(driver, CnnWorldInfo.class);
        driver.navigate().to("https://www.cnn.com/world");
    }


        @Test(priority = 21)
        public void worldPage(){
            CnnWorldInfo.WorldPage();
            sleepFor(6);

        }
    @Test(priority = 22)
    public void europePage(){
        CnnWorldInfo.EuropePage();
        sleepFor(6);

    }
    @Test(priority = 23)
    public void africaPage() {
        CnnWorldInfo.AfricaPage();
        sleepFor(6);
    }
    @Test(priority = 24)
    public void asiaPage(){
        CnnWorldInfo.AsiaPage();
        sleepFor(6);

    }
    @Test(priority = 25)
    public void americasPage() {
        CnnWorldInfo.AmericasPage();
        sleepFor(6);
    }
    @Test(priority = 26)
    public void australiaPage(){
        CnnWorldInfo.AustraliaPage();
        sleepFor(6);
    }
    @Test(priority = 27)
    public void chinaPage(){
        CnnWorldInfo.ChinaPage();
        sleepFor(6);
    }
    @Test(priority = 28)
    public void ukPage(){
        CnnWorldInfo.UKPage();
        sleepFor(6);
    }
    @Test(priority = 29)
    public void indiaPage(){
        CnnWorldInfo.IndiaPage();
        sleepFor(6);
    }
    @Test(priority = 30)
    public void middleeast(){
        CnnWorldInfo.MiddleEastPage();
        sleepFor(6);
    }
}
