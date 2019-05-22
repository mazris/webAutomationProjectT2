package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Class3 extends CommonAPI {


    @FindBy(id = "header_sign_in")
    WebElement signin;

    @FindBy(id = "logonId")
    WebElement inputuser;

    @FindBy(id = "logonPassword")
    WebElement inputpassw;
    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[5]/input")
    WebElement signbutt;

    public void setSignin() {
        signin.click();
    }

    public void setClickin(String email) {
        if (inputuser.isEnabled()) {
            inputuser.sendKeys(email, Keys.ENTER);
        }
    }

    public void setInputpassw(String password) {
        if (inputpassw.isEnabled()) {
            inputpassw.sendKeys(password, Keys.ENTER);
        }
    }

    public void setsignbutt() {
        if (signbutt.isDisplayed()) {
            Assert.assertTrue(true);
            signbutt.click();
        }

    }
}