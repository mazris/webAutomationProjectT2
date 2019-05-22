package TestPackage;

import RegressionPackage.SportClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SportTest extends CommonAPI {
    SportClass sportbutton;

    @BeforeMethod()
    public void init() {
        sportbutton = PageFactory.initElements(driver, SportClass.class);
    }

    @Test(priority = 1)
    public void SportTest1() {
        sportbutton.Sport1();
    }

    @Test(priority = 2)
    public void SportTest2() {
        sportbutton.Sport1();
        sportbutton.Sport2();
    }

    @Test(priority = 3)
    public void SportTest3() {
        sportbutton.Sport1();
        sportbutton.Sport2();
        sportbutton.Sport3();
    }

    @Test(priority = 4)
    public void SportTest4() {
        sportbutton.Sport1();
        sportbutton.Sport2();
        sportbutton.Sport3();

    }
    }