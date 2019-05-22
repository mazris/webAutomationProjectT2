package regressionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionmain.PhotoClass;

public class PhotoTest extends PhotoClass {



    @BeforeMethod
    public void testPhotosMeth(){
        System.out.println(driver.getTitle());
        openpage();
    }
    @Test(priority = 1)
    public void printstest (){
        setphonepage();

    }
    @Test(priority = 2)
    public void photobookTest(){
        photobooks();
    }
    @Test(priority = 3)
    public void metaltest(){
        metalmeth();
    }
    @Test(priority = 4)
    public void selectmethTest(){
        Giftpho();

    }
    @Test(priority = 5)
    public void clickshopgiftest(){
        clickshopgif();

    }
    @Test(priority = 6)
    public void walldectest(){
        walldec();
    }
    @Test(priority = 7)
  public void canvastest(){
        canvas();

    }


}
