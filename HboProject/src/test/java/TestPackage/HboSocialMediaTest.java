package TestPackage;

import RegressionPackage.HboSocialMedia;
import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HboSocialMediaTest  extends CommonAPI {
    HboSocialMedia hbosocialmedia;

    @BeforeMethod
    public void init() {
        hbosocialmedia= PageFactory.initElements(driver,  HboSocialMedia.class);
    }
    @Test(priority = 1)
    public void SocialTest1(){

        hbosocialmedia.Social1();
    }

    @Test(priority = 2)
    public void SocialTest2(){
        hbosocialmedia.Social2();
    }
    @Test(priority = 3)
    public void SocialTest3(){
       hbosocialmedia.Social3();
   }
    @Test(priority = 4)
    public void SocialTest4(){
        hbosocialmedia.Social3();
   }

    }



