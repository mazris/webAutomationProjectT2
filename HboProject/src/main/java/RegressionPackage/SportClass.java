package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[2]/div/div/ul/li[4]/div/a")
    WebElement SportBUtton;

    public void Sport1() {
        SportBUtton.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[2]/div/div/ul/li[4]/div/a")
    WebElement AllSport;

    public void Sport2() {
        SportBUtton.click();
        AllSport.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[2]/div/div[2]/div/div[2]/div[2]/p[1]")
    WebElement FilmButton;

    public void Sport3() {
        SportBUtton.click();
    }
}
