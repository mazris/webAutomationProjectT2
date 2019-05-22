package TestPackage;

import RegressionPackage.SelectHbo;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.testng.annotations.Test;

public class SelectHboTest extends SelectHbo {
    /*@Test
        // public void selectMtest1(){
            // SelectM();

     //}

    //@Test(priority = 1)
     public void hboGameOfThroneSelect() throws InterruptedException {
         //SelectM();
         //Thread.sleep(2000);

    // }
     /*@Test(priority = 2)
     public static void hboGameOfThroneSelect2() throws InterruptedException {
         SelectTheLatest();
         Thread.sleep(200);
             }*/
    @Test
    public void select1() throws InterruptedException {
        selectTheSOrtBy();
        Thread.sleep(2000);

    }
}
