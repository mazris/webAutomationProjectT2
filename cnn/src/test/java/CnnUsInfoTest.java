import com.mysql.cj.xdevapi.DocResultImpl;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnUsInfoTest extends CnnUsInfo {

    CnnUsInfo CnnUsInfo;
    @BeforeMethod
    public void init(){
        CnnUsInfo= PageFactory.initElements(driver, CnnUsInfo.class);
        driver.navigate().to("https://www.cnn.com/us");
    }

    @Test(priority = 16)
    public void Usinfo(){
        CnnUsInfo.UsInfo();
        sleepFor(6);
    }
    @Test(priority = 17)
    public void CrimeAndjustice(){
       CnnUsInfo.CrimeAndJustice();
        sleepFor(6);
    }
    @Test(priority = 18)
    public void EnergyAndenvironment(){
        CnnUsInfo.EnergyAndEnvironment();
        sleepFor(6);
    }
    @Test(priority = 19)
    public void ExtremeAndweather(){
        CnnUsInfo.ExtremeAndWeather();
        sleepFor(6);
    }
    @Test(priority = 20)
    public void SpaceAndscience() {
        CnnUsInfo.SpaceAndScience();
        sleepFor(6);

    }


}
