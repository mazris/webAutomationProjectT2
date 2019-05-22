package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionmain.SignUpClass;

public class SignUpTest extends CommonAPI {
    SignUpClass sigupobj;


    @BeforeMethod
    public void init() {

        sigupobj = PageFactory.initElements(driver, SignUpClass.class);
    }

    @Test(priority = 1)
    public void signuptest()
    {
        sigupobj.signup();
        sigupobj.setCreataccoun();
        sigupobj.inpemail("emailemaileamil");
        sigupobj.setinputpass("passpasspass");
        sigupobj.setPassconf("passpasspass");
        sigupobj.setMembreship("123456789");

    }
   @Test(priority = 2)
    public void singupuser(){
        sigupobj.signup();
        sigupobj.setCreataccoun();
        sigupobj.inpemail("emaipassemailpasssss");
        sigupobj.setinputpass("asdfghjkiuytr");
        sigupobj.setPassconf("asdfghjkiuytr");
        sigupobj.setMembreship("12345678");


   }
    @Test(priority = 3)
    public void singupuser2(){
        sigupobj.signup();
        sigupobj.setCreataccoun();
        sigupobj.inpemail("masimenadroshakli");
        sigupobj.setinputpass("akbouakbouakbou");
        sigupobj.setPassconf("akbouakbouakbou");
        sigupobj.setMembreship("12");


    }





}