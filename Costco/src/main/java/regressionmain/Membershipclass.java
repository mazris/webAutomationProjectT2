package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Membershipclass extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"Home_Ancillary_7\"]")
    WebElement Test1;

    @FindBy(xpath = "//*[@id=\"search-results\"]/div[1]/div/table/tbody/tr[1]/td[3]/a/input")
    WebElement Test2;

    @FindBy (id="first_name")
     WebElement Test3;

    @FindBy (xpath ="//*[@id=\"first_name\"]")
        WebElement Test4;


    @FindBy(css="#address1")
        WebElement Test5;


    @FindBy (id="postalcode")
    WebElement Test6;


    @FindBy ( id="city")
      WebElement Test7;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement Test8;


    @FindBy(xpath = "//*[@id=\"emailConfirm\"]")
    WebElement Test10;

    @FindBy(id="contactPhoneNumber")
        WebElement Test11;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/div[2]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]\n")
    WebElement Test12;


    @FindBy (id="logonPassword")

    WebElement Test13;

    @FindBy(xpath = "//*[@id=\"logonPasswordVerify\"]")
    WebElement Test14;





    public void setTest1() {
        if (Test1.isDisplayed()) {
            Assert.assertTrue(true);
            Test1.click();
        }
    }

    public void setTest2() {
        Test2.click();

    }
    public void setTest3(String lastname) {
        if (Test3.isDisplayed()) {
            Test3.sendKeys(lastname, Keys.ENTER);
        }

    }
    public void setTest4(String firstname) {
        if (Test4.isDisplayed()) {
            Test4.sendKeys(firstname, Keys.ENTER);
        }
    }
    public void setTest5(String address) {
        if (Test5.isDisplayed()) {
            Test5.sendKeys(address, Keys.ENTER);
        }
    }

    public void setTest6(String zipnum) {
        if (Test6.isDisplayed()) {
            Test6.sendKeys(zipnum, Keys.ENTER);
        }
    }
    public void setTest7(String city) {
        if (Test7.isDisplayed()) {
            Test7.sendKeys(city, Keys.ENTER);
        }
    }
    public void setTest8(String emailadd) {
        if (Test8.isDisplayed()) {
            Test8.sendKeys(emailadd, Keys.ENTER);
        }
    }



    public void setTest10(String emailaddconf) {
        if (Test10.isDisplayed()) {
            Test10.sendKeys(emailaddconf, Keys.ENTER);
        }
    }
    public void setTest11(String phonenum) {
            Test11.sendKeys(phonenum);

    }

    public void setTest12(String iputemail) {
        Test12.sendKeys(iputemail);

    }
    public void setTest13(String passs) {
        Test13.sendKeys(passs);

    }
    public void setTest14(String passcof) {
        Test14.sendKeys(passcof);

    }

    public void setTest9(){
        driver.findElement(By.xpath( "/html[1]/body[1]/div[6]/form[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/select[1]")).click();

        Select select = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[6]/form[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/select[1]")));
        select.selectByVisibleText("New York");
    }
}