package regressionTest;

import org.testng.annotations.Test;
import regressionmain.CostcoClass1;

public class CostcoPage1 extends CostcoClass1 {


   // @Test(priority = 1)
    public void testMethods() throws InterruptedException {
        openPage();
        Thread.sleep(2000);
        search("iphoneXR");
        Thread.sleep(2000);
        click();
        Thread.sleep(2000);
        //storby();
    }
 @Test//(priority = 2)
    public void testselect () throws InterruptedException {
         selectgro();
     Thread.sleep(2000);
        click2();
     Thread.sleep(2000);


 }


   // @Test(priority = 3)
    public void cart() throws InterruptedException {
        addtocart();
        Thread.sleep(2000);
        change();
        Thread.sleep(2000);
        zipcod();
        Thread.sleep(2000);


    }

}
