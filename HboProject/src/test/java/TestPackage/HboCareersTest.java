package TestPackage;

import RegressionPackage.HboCareersClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HboCareersTest extends CommonAPI {
    HboCareersClass hboCareersClass;

    @BeforeMethod
    public void init() {
        hboCareersClass = PageFactory.initElements(driver, HboCareersClass.class);

    }

    @Test(priority = 1)
    public void CareersTest1(){
        hboCareersClass.Careers1();
    }


    @Test(priority = 2)
    public void CareersTest2() {
        hboCareersClass.Careers1();
        driver.navigate().to("https://hbocareers.com/");
        hboCareersClass.Careers2("QA TESTEER");
        hboCareersClass.Careers3();
}
}