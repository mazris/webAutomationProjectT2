import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnEntert extends CommonAPI {


    @FindBy(xpath = "//a[contains(text(),'Stars')]")
    WebElement StarsPage;

    @FindBy(xpath = "//a[contains(text(),'Screen')]")
    WebElement ScreenPage;

    @FindBy(xpath = "//a[contains(text(),'Binge')]")
    WebElement BingePage;

    @FindBy(xpath = "//a[contains(text(),'Culture')]")
    WebElement CulturePage;

    @FindBy(xpath = "//a[contains(text(),'Media')]")
    WebElement MediaPage;



    public void starspage(){
        StarsPage.click();
    }

    public void screenpage(){
        ScreenPage.click();
    }

    public void bingepage(){
        BingePage.click();
    }

    public void culturepage(){
        CulturePage.click();
    }

    public void mediapage(){
        MediaPage.click();
    }
}


