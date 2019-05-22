package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class SignUpClass extends CommonAPI {

@FindBy(id="header_sign_in")
    WebElement regester ;
@FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[8]/a")
WebElement creataccoun;

@FindBy(id="register_email1")
   WebElement inputemail;

@FindBy(id="logonPassword")
    WebElement inpupass;

@FindBy(id="logonPasswordVerify")
   WebElement passconf;

@FindBy (id="register_userField2")
    WebElement membreship;


public void signup(){

    regester.click();
}


public void setCreataccoun(){
    creataccoun.click();
}

public void inpemail(String email){
    if (inputemail.isEnabled()){
        inputemail.sendKeys(email, Keys.ENTER);

    }

    }
    public void setinputpass(String password){
    inpupass.sendKeys(password);


    }
    public void setPassconf(String passwordconf){
    passconf.sendKeys(passwordconf);

    }

    public void setMembreship(String num){
    membreship.sendKeys(num);
    }


}
