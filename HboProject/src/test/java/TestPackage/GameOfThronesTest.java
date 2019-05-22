package TestPackage;

import RegressionPackage.GameOfThronesClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GameOfThronesTest extends GameOfThronesClass {
    @BeforeMethod
    public void hboTest() throws InterruptedException {
        openPage();
        hboSearch();
        Thread.sleep(2000);
    }


    @Test(priority = 1)
    public void hboTes2() throws InterruptedException {
        hboSearch2("game of thrones");
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void hboTes3() throws InterruptedException {

        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void hboTest4() throws InterruptedException {
        hboSearch2("game of thrones");
        hboSearch3();
        gameOFthrones1();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void hboTest5() throws InterruptedException {

        hboSearch2("game of thrones");
        hboSearch3();
        gameOFthrones1();
        gameOFthrones2();
        Thread.sleep(2000);

    }

    @Test(priority = 5)
    public void hboTest6() throws InterruptedException {

        hboSearch2("game of thrones");
        hboSearch3();
        gameOFthrones1();
        gameOFthrones2();
        //SeasonSelect();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void hboTest7() throws InterruptedException {
        hboSearch2("game of thrones");
        hboSearch3();
        gameOFthrones1();
        gameOFthrones2();
        //SeasonSelect();
        Seasonseasons();
        GameOfThronesSeason2();
        GOback();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void hboTest8() throws InterruptedException {
        hboSearch2("game of thrones");
        hboSearch3();
        gameOFthrones1();
        gameOFthrones2();
        Seasonseasons();
        GameOfThronesSeason2();
        GOback();
        TyrionLanister();
        GOback1();
        Thread.sleep(2000);

    }
}


























