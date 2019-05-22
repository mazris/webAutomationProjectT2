package Testpage;

import HomePage.MyAccount;
import HomePage1.MyAccount;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends CommonAPI {

    MyAccount account;

    @BeforeMethod
    public void openmain() {
        account = PageFactory.initElements( driver, MyAccount.class );
        sleepFor( 7 );
    }

    @Test(priority = 1)
    public void accountclicktest() {
        account.accoutclick();
        account.userinput( "massinissa.d@digitalfilmacademy.edu" );
        account.inputpassword( "djadda06" );
        account.clicklog();

    }

    @Test(priority = 2)
    public void createaccountTest() {
        account.accoutclick();
        account.createaccount();


    }

    @Test(priority = 3)
    public void forgotTest() {
        account.accoutclick();
        account.forgotpass();
    }

    @Test(priority = 4)
    public void googleTest() {
        account.accoutclick();
        account.googlelog();
    }

    @Test(priority = 5)
    public void facebookTest() {
        account.accoutclick();
        account.facebooklog();
    }

    @Test(priority = 6)
    public void closeTest() {
        account.accoutclick();
        account.closewindow();
    }


}




