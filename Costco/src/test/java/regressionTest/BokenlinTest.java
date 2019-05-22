package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionmain.Brokenlinks;

import java.io.IOException;

public class BokenlinTest extends CommonAPI {

    Brokenlinks brokenLin;

    String url = "https://www.costco.com";
    @BeforeMethod
    public void init(){
        brokenLin = PageFactory.initElements(driver,Brokenlinks.class);
        driver.get(url);
    }

    @Test
    public void testCnnActivlinks() throws IOException {
        brokenLin.linksbroken();
    }

}
