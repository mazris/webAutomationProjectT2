package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionmain.Membershipclass;

public class MembershipTest extends CommonAPI {
    Membershipclass Objec;

    @BeforeMethod
    public void init() {
        Objec = PageFactory.initElements(driver, Membershipclass.class);
    }

    //@Test(priority = 1)
    public void MMTest1() {

        Objec.setTest1();
        sleepFor(3);
    }

    // @Test(priority = 2)
    public void MMTest2() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();

    }

    // @Test//(priority = 3)
    public void MMTest3() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest3("djebra");
    }

    //@Test//(priority = 4)
    public void MMTest4() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest4("Akli");
    }
    //@Test
    public void MMTest5() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest5("35th ave newyork");

    }
   // @Test
    public void MMTest6() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest6("11104");

    }
    // @Test
    public void MMTest7() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest7("Queens");

    }
    //@Test
    public void MMTest8() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest8("aklidjebra88@gmail.com");

    }

    //@Test
    public void MMTest10() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest10("aklidjebra88@gmail.com");

    }
    //@Test
    public void MMTest11() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest10("3456780321");

    }
   // @Test
    public void MMTest12() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest12("ajkajkajkajkajkajkajkaj");
    }
    //@Test
    public void MMTest13() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest13("passsspasssspasss");
    }
    @Test
    public void MMTest14() {
        Objec.setTest1();
        sleepFor(3);
        Objec.setTest2();
        Objec.setTest14("passsspasssspasss");
    }
   // @Test
    public void MMTest9() {
        Objec.setTest1();
        Objec.setTest2();
        Objec.setTest9();
    }
}