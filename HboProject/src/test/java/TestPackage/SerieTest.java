package TestPackage;

import RegressionPackage.SerieClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SerieTest extends CommonAPI {

    SerieClass serieObject;


    @BeforeMethod
    public void init() {
        serieObject = PageFactory.initElements(driver, SerieClass.class);
    }

    @Test(priority = 1)
    public void SerieTest1() {
        serieObject.Serie();
    }

    @Test(priority = 2)
    public void SerieTest2() {
        serieObject.Serie();
        serieObject.Serie1();

    }

    @Test(priority = 3)
    public void SerieTest3() {
        serieObject.Serie();
        serieObject.Serie1();
        serieObject.Serie2();

    }

    @Test(priority = 4)
    public void SerieTest4() {
        serieObject.Serie();
        serieObject.Serie1();
        serieObject.Serie2();
        serieObject.Serie3();


    }

    @Test(priority = 5)
    public void SerieTest5() {
        serieObject.Serie();
        serieObject.Serie1();
        serieObject.Serie2();
        serieObject.Serie3();
        serieObject.Serie4();

    }

    @Test(priority = 6)
    public void SerieTest6() {
        serieObject.Serie();
        serieObject.Serie1();
        serieObject.Serie2();
        serieObject.Serie3();
        serieObject.Serie4();
        serieObject.Serie5();
    }

    @Test(priority = 7)
    public void SerieTest7() {
        serieObject.Serie();
        serieObject.Serie1();
        serieObject.Serie2();
        serieObject.Serie3();
        serieObject.Serie4();
        serieObject.Serie5();
        serieObject.Serie6();
    }
}
