package TestPackage;

import RegressionPackage.MoviesClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoviesTest extends CommonAPI {
    MoviesClass movieObject;


    @BeforeMethod
    public void init() {
        movieObject = PageFactory.initElements(driver, MoviesClass.class);
    }

    /*@Test(priority = 1)
    public void movies1() {
        movieObject.MOvie1();
    }

    @Test(priority = 2)
    public void movies2() {
        movieObject.MOvie1();
        movieObject.Movies2();
    }*/

    @Test(priority = 3)
    public void movies3() {
        movieObject.MOvie1();
        movieObject.Movies2();
        movieObject.Movies3();
    }
    }






