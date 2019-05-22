package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class SignInClass extends CommonAPI {

    @FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/header[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/span[1]")
    WebElement SignIN;

    @FindBy(xpath="//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/ul/li[3]/div/div/div[4]/div/div[1]/div[1]/div/a/span")
    WebElement SignInNow;

    @FindBy(xpath="//*[@id=\"Viewport\"]/div[2]/div[4]/div/div[7]/div/div[2]/div/span/span")
    WebElement SignIn2;

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[5]/div/div[1]/div[3]/div/input")
    WebElement SigneInEmailField;

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[5]/div/div[1]/div[5]/div[1]/input")
    WebElement SignInPasswordField;

    @FindBy(xpath ="/html[1]/body[1]/div[2]/div[5]/div[1]/div[2]/div[1]")
    WebElement SignInExitButton;

    @FindBy(xpath = " //*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/a[1]/div/div/div[2]/div/span/span")
    WebElement SignINGameOfThroneB;

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[4]/div/a/div/div")
    WebElement SerieButton;


    public void SignIn1(){
        SignIN.click();
    }
    public void SignInNOw(){
        SignInNow.click();
    }
    public void SignIn2(){
        SignIn2.click();

    }
    public void SignIn3(String email){
        SigneInEmailField.sendKeys(email);
    }
    public void SignIn4(String password){
        SignInPasswordField.sendKeys(password);
    }
    public void SignIn5() {
        SignInExitButton.click();
    }


    }










