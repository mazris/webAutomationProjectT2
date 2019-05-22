package Testpage;

import HomePage1.ContactUs;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsTest extends CommonAPI {

    ContactUs contactUs = new ContactUs();


    @BeforeMethod
    public void openmain() {
        contactUs = PageFactory.initElements( driver, ContactUs.class );
        sleepFor( 7 );
    }

    @Test(priority = 1)

    public void contactclicktest() {
        contactUs.contactlink();
    }

    @Test(priority = 2)
    public void contactlistTest() {
        contactUs.contactlist();
        sleepFor( 6 );

    }

    @Test(priority = 3)
    public void categoryList() {
        contactUs.categorylist();
        sleepFor( 5 );
    }

    @Test(priority = 4)
    public void subjectTest() {
        contactUs.subjectwrite( "canon 5d issue" );
        sleepFor( 7 );
    }
}