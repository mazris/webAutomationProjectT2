package TestPackage;

import RegressionPackage.SubscribeClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubsrcibeClassTeste extends CommonAPI {


    SubscribeClass SUBS;

    @BeforeMethod
    public void init() {
        SUBS = PageFactory.initElements(driver, SubscribeClass.class);//ininstantiate the object
    }


    /*@Test(priority = 1)
    public void ClickTRIAL() {
        SUBS.setGETHBO();

    }


    @Test(priority = 2)
    public void EmailField() {
        SUBS.setGETHBO();
        SUBS.setEmailFIELD("menadmenad");
    }

    @Test(priority = 3)
    public void PasswordFIELD() {
        SUBS.setGETHBO();
        SUBS.setEmailFIELD("menadmenad");
        SUBS.setPasswordFIELD("menadfghjk");
    }

    @Test(priority = 4)
    public void FirsNameFIELD() {
        SUBS.setGETHBO();
        SUBS.setEmailFIELD("menadmenad");
        SUBS.setPasswordFIELD("menadfghjk");
        SUBS.setFirstName("menad");
    }

    @Test(priority = 5)
    public void LastNameFIELD() {

        SUBS.setGETHBO();
        SUBS.setEmailFIELD("menadmenad");
        SUBS.setPasswordFIELD("menadfghjk");
        SUBS.setFirstName("menad");
        SUBS.setLastName("harkat");

    }

    @Test(priority = 6)
    public void ZipCode() {

        SUBS.setGETHBO();
        SUBS.setEmailFIELD("menadmenad");
        SUBS.setPasswordFIELD("menadfghjk");
        SUBS.setFirstName("menad");
        SUBS.setLastName("harkat");
        SUBS.setZIpCode("21111ny");
        SUBS.setCheckBox();
        SUBS.setCheckBoxConf();
    }*/
    @Test(priority = 7)
    public void CreateAccountButton (){
        SUBS.setGETHBO();
        SUBS.setEmailFIELD("menadmenad");
        SUBS.setPasswordFIELD("menadfghjk");
        SUBS.setFirstName("menad");
        SUBS.setLastName("harkat");
        SUBS.setZIpCode("21111ny");
        SUBS.setCheckBox();
        SUBS.setCheckBoxConf();
        SUBS.setCreateAccountButton();
    }


}









