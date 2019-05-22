package TestPackage;

import RegressionPackage.SignInClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    SignInClass signinObject;


    @BeforeMethod
    public void init() {
        signinObject = PageFactory.initElements(driver, SignInClass.class);

    }

    @Test(priority = 1)
    public void signIntest() {
        signinObject.SignIn1();

    }

    @Test(priority = 2)
    public void signInTestNow() {
        signinObject.SignIn1();
        signinObject.SignInNOw();

    }

    @Test(priority = 3)
    public void setSignIn1() {
        signinObject.SignIn1();
        signinObject.SignInNOw();
    }
    @Test(priority = 4)
    public void setSignIn2(){
        signinObject.SignIn1();
        signinObject.SignInNOw();
        signinObject.SignIn2();
    }

    @Test(priority = 5)
    public void setSignIn3(){
        signinObject.SignIn1();
        signinObject.SignInNOw();
        signinObject.SignIn2();
        signinObject.SignIn3("menadharkat@gmail.com");
    }

    @Test(priority = 6)
    public void setSignIn4(){
        signinObject.SignIn1();
        signinObject.SignInNOw();
        signinObject.SignIn2();
        signinObject.SignIn3("menadharkat@gmail.com");
        signinObject.SignIn4("mendmenedmdened");

    }
    @Test(priority = 7)
    public void setSignIn5(){
        signinObject.SignIn1();
        signinObject.SignInNOw();
        signinObject.SignIn2();
        signinObject.SignIn3("menadharkat@gmail.com");
        signinObject.SignIn4("mendmenedmdened");
        signinObject.SignIn5();
    }

    }





