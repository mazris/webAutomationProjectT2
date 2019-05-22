package Testpage;

import HomePage.MainPage;
import HomePage1.MainPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends CommonAPI {


    MainPage main;


    @BeforeMethod
    public void openmain() {
        main = PageFactory.initElements( driver, MainPage.class );
        sleepFor( 5 );

    }

    // @Test(priority = 1)
    public void scrolldownTest() {
        main.scrolldown();
        sleepFor( 3 );

    }


    //   @Test(priority = 3)
    public void searchTest() {
        main.searchbar();
        sleepFor( 4 );

    }

    //@Test (priority = 4)
    public void searchclickTest() {
        main.searchbar();
        sleepFor( 3 );
        main.searchclick();
        sleepFor( 3 );
    }

    //@Test (priority = 5)
    public void photoDepTest() {
        main.photoDep();
        sleepFor( 4 );
    }

    // @Test (priority = 6)
    public void CameraDigTest() {

        main.Cameradig();
        sleepFor( 4 );
    }

    // @Test
    public void SearchUsedTest() {
        main.SearchUsed();
    }

    // @Test
    public void Shipto() {
        main.ShipLocal();
    }

    @Test
    public void CartTest() {
        main.Cart();

    }


}
