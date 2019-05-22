import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CnnOpinionTest extends CnnOpinion {
    CnnOpinion CnnOpinion;

    @BeforeMethod
    public void init() {
        CnnOpinion = PageFactory.initElements(driver, CnnOpinion.class);
        driver.navigate().to("https://www.cnn.com/opinions");
    }
    @Test(priority = 41)
    public void politicalop(){
        CnnOpinion.PoliticalOpEdsPage();
        sleepFor(6);
    }
    @Test(priority = 42)
    public void socialcommentary(){
       CnnOpinion.SocialComentary();
       sleepFor(6);
    }

}
