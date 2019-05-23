package expedia;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignInExpedia extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header-account-menu\"]")
    WebElement account;
    @FindBy(xpath = "//*[@id=\"account-signin\"]")
    WebElement signInAccount;
    @FindBy(xpath = "//*[@id=\"gss-signin-email\"]")
    WebElement emailId;
    @FindBy(xpath = "//*[@id=\"gss-signin-password\"]")
    WebElement password;


    public void goToSignInPage(){
        driver.navigate().to("https://www.expedia.com/");
        account.click();
        signInAccount.click();
    }
    public void signIn(String username, String Password){
        emailId.sendKeys(username);
        password.sendKeys(Password);
        sleepFor(5);
        signInAccount.click();
    }


}
