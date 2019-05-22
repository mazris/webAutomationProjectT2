package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionmain.Class3;

public class TestClass3 extends CommonAPI {

    Class3 class3;

    @BeforeMethod
    public void inii() {
        class3 = PageFactory.initElements(driver, Class3.class);
    }

    @BeforeMethod
    public void signbut() {

        class3.setSignin();
    }

    @Test(priority = 1)
    public void usernameinput() {
        class3.setClickin("akliakliakli");
    }

    @Test(priority = 2)
    public void passwoinput() {
        class3.setClickin("akliakliakli");
        class3.setInputpassw("passpasspassword");


    }
    @Test(priority = 3)
    public void signbutton() {
        class3.setClickin("akliakliakli");
        class3.setInputpassw("passpasspassword");
        class3.setsignbutt();
    }


}