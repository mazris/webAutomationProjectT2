package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MoviesClass extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[2]/div/div/ul/li[2]/div/a")
    WebElement MoviesButton;

    public void MOvie1() {
        MoviesButton.click();

    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[2]/div/div/div/ul/li[3]/div/a")
    WebElement CataloguesButoon;

    public void Movies2() {
        CataloguesButoon.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[2]/div/div/div/ul/li[3]/div[2]/ul/li[1]/a")
    WebElement AllMovioes;
    public void Movies3() {
        AllMovioes.click();
    }


    }








