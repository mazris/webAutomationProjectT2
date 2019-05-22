package HomePage1;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-login\"]/span[1]")
    WebElement myaccount;

    @FindBy(xpath = "//*[@id=\"user-input\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"password-input\"]")
    WebElement pass;

    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/form/input[1]")
    WebElement click;

    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/div[1]/span")
    WebElement create;

    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/form/div[2]/a")
    WebElement forgot;

    @FindBy(xpath = "//*[@id=\"customGoogleSigninBtn\"]")
    WebElement google;

    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/div[2]/div/a")
    WebElement facebook;

    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/span")
    WebElement close;


    public void accoutclick() {
        myaccount.click();
        sleepFor( 5 );
    }

    public void userinput(String email) {
        username.sendKeys( email );
        sleepFor( 5 );
    }

    public void inputpassword(String passsword) {
        pass.sendKeys( passsword );
        sleepFor( 5 );
    }

    public void clicklog() {
        click.click();
    }

    public void createaccount() {
        create.click();
    }

    public void forgotpass() {
        forgot.click();
    }

    public void googlelog() {
        google.click();
    }

    public void facebooklog() {
        facebook.click();
    }

    public void closewindow() {
        close.click();
    }
}
