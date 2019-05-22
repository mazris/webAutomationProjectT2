import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {

    public void enterText(String xpath, String text){

        WebElement e= driver.findElement(By.xpath(xpath));
        e.clear();
        e.sendKeys(text);
    }
    public void clicksignInbutton(){
        driver.findElement(By.linkText("Sign in")).click();
    }
    public void signInGoogle(){
        driver.findElement(By.xpath("//*[@class='social-btn social-btn--googleplus']")).click();
    }
    public void signInFacebook(){
        driver.findElement(By.linkText("Sign in with Facebook")).click();
    }
}
