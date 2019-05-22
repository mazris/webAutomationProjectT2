package regressionTest;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CommonMethods extends CommonAPI {

    @Test(priority = 1)
    public void setTests1(){

  getTextByCss("#header-widget > div > div > div > div.table-cell.logo.hidden-xs.hidden-sm.hidden-md.hidden-lg > a > img");

    }
    @Test(priority = 2)
    public void setTest2(){
        getTextByXpath("//*[@id=\"customer-service-link\"]");

    }
    @Test(priority = 3)
    public void stTest3(){
        getTextById("email-signup-dropdown");

    }
    @Test(priority = 4)
    public void setTest4 (){
        mouseHoverByCSS("#Home_Ancillary_1");

    }
    @Test(priority = 5)
    public void setTest(){
        mouseHoverByXpath("//*[@id=\"country-select\"]/span[1]");


    }

    //@Test(priority = )
    public void setTest9 () {
        getTextByName("");


    }


}
