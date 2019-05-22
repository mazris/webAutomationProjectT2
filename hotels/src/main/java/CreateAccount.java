import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends CommonAPI {
    @FindBy(id="hdr-create")
    public WebElement createact;

    public void enterText(String xpath, String text){
        WebElement e= driver.findElement(By.xpath(xpath));
        e.clear();
        e.sendKeys(text);
    }
    public void clickGoogle(){
        createact.click();
        driver.findElement(By.xpath("//*[@class='social-btn social-btn--googleplus']")).click();

    }
    public void clickFacebook(){
        createact.click();
        driver.findElement(By.linkText("Sign up with Facebook")).click();
    }

    public void clickbutton(){
        driver.findElement(By.xpath("//*[@id='signup-button']")).click();
    }
    public void forum(){
        typeByXpath("//*[@id='sign-up-email']","mazri.s101@gmail.com");

        typeByXpath("//*[@id='sign-up-password']","password");

        typeByXpath("//*[@id='sign-up-first-name']","sonia");

        typeByXpath("//*[@id='sign-up-last-name']","mazri");

        clickbutton();
        sleepFor(4);
    }
}
