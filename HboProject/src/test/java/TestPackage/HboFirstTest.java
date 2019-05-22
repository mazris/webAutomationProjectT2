package TestPackage;
import RegressionPackage.HboFirstClass;

import org.testng.annotations.Test;
public class HboFirstTest extends HboFirstClass {
    @Test(priority = 1)
    public void hboTest() throws InterruptedException {
        openPage();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void hboTes1() throws InterruptedException {

        openPage();
        hboSearch();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void hboTes2() throws InterruptedException {
        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public void hboTes3() throws InterruptedException {

        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void hboTes4() throws InterruptedException {
        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        hboSearchBack();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void hboTes5() throws InterruptedException {
        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        hboSearchBack();
    }

    @Test(priority = 7)
    public void hboTes6() throws InterruptedException {
        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        hboSearchBack();
        hboRefresh();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void hbotest7() throws InterruptedException {
        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        hboSearchBack();
        hboRefresh();
        hboSerie();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void hbotest8() throws InterruptedException {
        openPage();
        hboSearch();
        hboSearch2("game of thrones");
        hboSearch3();
        hboSearchBack();
        hboRefresh();
        hboSerie();
        Thread.sleep(2000);
    }
}
             /*@Test(priority = 10)
             public void hbotest8() throws InterruptedException (){
                 openPage();
                 hboSearch();
                 hboSearch2("game of thrones");
                 hboSearch3();
                 hboSearchBack();
                 hboRefresh();
                 hboSerie();
                 hboSearchBack2();
                 hboGetHbo();
                 Thread.sleep(2000);

             }*/
























