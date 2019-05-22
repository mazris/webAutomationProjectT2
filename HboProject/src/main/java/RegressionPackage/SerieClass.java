package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SerieClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a")
    WebElement SerieButton;

    public void Serie() {
        SerieButton.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div[2]/div/div/div/ul/li[2]/div/a")
    WebElement SerieAll;

    public void Serie1() {
        SerieAll.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[1]/div/div[2]/div/div[6]/div[2]/p[1]")
    WebElement SerieBAndOfBrother;

    public void Serie2() {
        SerieBAndOfBrother.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[1]/div/div[2]/div/div[11]/div/div[2]/div/div/div[2]/div/a/span/span/span[1]")
    WebElement SerieFindOutMore;

    public void Serie3() {
        SerieFindOutMore.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/header[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")
    WebElement SerieEpisodes;

    public void Serie4() {
        SerieEpisodes.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[3]/div/div/div/div[1]/span/div/div/a/span/span/span[1]")
    WebElement SerieSeeMore;

    public void Serie5() {
        SerieSeeMore.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[3]/div/nav/a[2]/div[2]/h2")
    WebElement SerieNext;

    public void Serie6() {
        if (SerieNext.isDisplayed()) {
            Assert.assertTrue(true);
            SerieNext.click();
        }

    }
}










