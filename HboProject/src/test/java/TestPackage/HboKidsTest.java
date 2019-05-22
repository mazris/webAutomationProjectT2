package TestPackage;

import RegressionPackage.HboKidsClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HboKidsTest  extends CommonAPI {

    HboKidsClass hbokidsclass;

    @BeforeMethod
    public void init() {
        hbokidsclass = PageFactory.initElements(driver, HboKidsClass.class);
    }

    @Test(priority = 1)
     public void kidsTest1(){
         hbokidsclass.setKidsButton();

     }
     @Test(priority = 2)
     public void kidsTest2(){
         hbokidsclass.setKidsButton();
         hbokidsclass.setEsmeAndRoy();

     }
     @Test(priority = 3)
   public void KidsTest3(){
         hbokidsclass.setKidsButton();
         hbokidsclass.setEsmeAndRoy();
         hbokidsclass.setReadMoreBUtton();

     }
     @Test(priority = 4)
     public void KidsTest4(){
         hbokidsclass.setKidsButton();
         hbokidsclass.setEsmeAndRoy();
         hbokidsclass.setReadMoreBUtton();
         hbokidsclass.setScheduleButton();
     }
    @Test(priority = 5)
    public void KidsTest5() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
    }

    @Test(priority = 6)
    public void KidsTest6() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
        hbokidsclass.setEastButton();
    }

    @Test(priority = 7)
    public void KidsTest7() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
        hbokidsclass.setEastButton();
        hbokidsclass.setYesterdayButton();

    }
    @Test(priority = 8)
    public void KidsTest8() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
        hbokidsclass.setEastButton();
        hbokidsclass.setYesterdayButton();
        hbokidsclass.setTodayButton();
    }
    @Test(priority = 9)
    public void KidsTest9() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
        hbokidsclass.setEastButton();
        hbokidsclass.setYesterdayButton();
        hbokidsclass.setTodayButton();
        hbokidsclass.setTomorrowButton();
    }
    @Test
    public void KidsTest10() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
        hbokidsclass.setEastButton();
        hbokidsclass.setYesterdayButton();
        hbokidsclass.setTodayButton();
        hbokidsclass.setTomorrowButton();
        hbokidsclass.setNextWeekButton();
    }
    @Test
    public void KidsTest11() {
        hbokidsclass.setKidsButton();
        hbokidsclass.setEsmeAndRoy();
        hbokidsclass.setReadMoreBUtton();
        hbokidsclass.setScheduleButton();
        hbokidsclass.setWestButton();
        hbokidsclass.setEastButton();
        hbokidsclass.setYesterdayButton();
        hbokidsclass.setTodayButton();
        hbokidsclass.setTomorrowButton();
        hbokidsclass.setNextWeekButton();
        hbokidsclass.setHBOButton();
    }
}