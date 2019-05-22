package Testpage;

import HomePage.PhotographyDep;
import HomePage1.PhotographyDep;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhotographyDepTest extends CommonAPI {


    PhotographyDep photo;

    @BeforeMethod
    public void openmain() {
        photo = PageFactory.initElements( driver, PhotographyDep.class );
        sleepFor( 7 );


    }

    @Test(priority = 1)

    public void LensesTest() {
        photo.LensDep();
    }

    @Test(priority = 2)
    public void droneTest() {
        photo.dronesdep();
    }

    @Test(priority = 3)
    public void tripodTest() {
        photo.TripodDep();
    }

    @Test(priority = 4)
    public void BagsCasesTest() {
        photo.BagsCases();
    }

    @Test(priority = 5)
    public void PhotoMoreTest() {
        photo.PhotoMore();
    }


}

