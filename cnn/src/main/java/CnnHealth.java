import base.CommonAPI;
import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnHealth extends CommonAPI {


    @FindBy(xpath = " //a[contains(text(),'Health')]")
    WebElement HealtPage;

    @FindBy(xpath = "//a[@class='nav-section__submenu-item'][contains(text(),'Food')]")
    WebElement FoodPage;

    @FindBy(xpath = "//a[@class='nav-section__submenu-item'][contains(text(),'Fitness')]")
    WebElement FitnessPage;

    @FindBy(xpath = "//a[@class='nav-section__submenu-item'][contains(text(),'Wellness')]")
    WebElement WellnessPage;

    @FindBy(xpath = "//a[@class='nav-section__submenu-item'][contains(text(),'Parenting')]")
    WebElement ParentingPage;

    @FindBy(xpath = "//a[@class='nav-section__submenu-item'][contains(text(),'Live Longer')]")
    WebElement LiveLongerPage;

    public void healthpage() {
        HealtPage.click();
        sleepFor(2);
    }

    public void foodpage(){
        FoodPage.click();
    }
    public void fitnesspage(){
        FitnessPage.click();

    }

    public void welnesspage(){
        WellnessPage.click();
    }

    public void parentingpage(){
        ParentingPage.click();
    }
    public void livelongerpage(){
        LiveLongerPage.click();
    }

}
