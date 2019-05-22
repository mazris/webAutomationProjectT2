package HomePage1;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotographyDep extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[2]/a/div[1]")
    WebElement lenses;

    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[3]/a/div[1]")
    WebElement drones;
    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[4]/a/div[1]")
    WebElement tripod;

    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[5]/a/div[1]")
    WebElement bags;

    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[6]/a/div/p[2]")
    WebElement seemore;


    public void LensDep() {
        lenses.click();
    }

    public void dronesdep() {
        drones.click();
    }

    public void TripodDep() {
        tripod.click();
    }

    public void BagsCases() {
        bags.click();
    }

    public void PhotoMore() {
        seemore.click();
    }
}
