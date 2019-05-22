package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionmain.MainClass4;

public class TestClass4 extends CommonAPI {
    MainClass4 mainClass4;

    @BeforeMethod
    public void init(){
        mainClass4 = PageFactory.initElements(driver,MainClass4.class);
    }
    //@Test(priority = 1)
    public void test1(){
        mainClass4.setTest1();
    }
    //@Test(priority = 1)
    public void test2(){
        mainClass4.setTest2();
    }
    //@Test(priority = 2)
    public void test3(){
        mainClass4.setTest2();
        mainClass4.setTest3();

    }
    //@Test//(priority = 3)
    public void test4(){
        mainClass4.setTest2();
        mainClass4.setTest3();
        mainClass4.setTest4("shoes");
    }
   // @Test//(priority = 4)
    public void test5(){
        mainClass4.setTest2();
        mainClass4.setTest3();
        mainClass4.setTest4("shirts");
        mainClass4.setTest5();

    }
    //@Test//(priority = 5)
    public void test6(){
        mainClass4.setTest6("carseats");

    }
    //@Test//(priority = 6)
    public void test7(){
        mainClass4.setTest6("mobilephones");

    }
   // @Test(priority = 7)
    public void stTest8(){
        getTextById("country-select");

    }
    //@Test(priority = 8)
    public void setTest9 (){
        mouseHoverByCSS("#country-select");

    }
    //@Test//(priority = 9)
    public void setTest10(){
        mouseHoverByXpath("//*[@id=\"100490912_tile_desc\"]/a");


    }

    //@Test(priority = 10)
    public void setTest11 () {
        getTextByName("header-menu-dropdown");


    }
    @Test(priority = 11)
    public void Test12() {
        mainClass4.setTest8select();

    }

}
