package RegressionPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HboCareersClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[3]/footer/div[2]/div/ul[1]/li[5]/a")
    WebElement Careers;

    public void Careers1() {
        Careers.click();
    }


    @FindBy(xpath = "//*[@id=\"section-main\"]/form/input")
    WebElement Search;

    public void Careers2(String job) {
        Search.sendKeys(job);
    }
    @FindBy(xpath="//*[@id=\"section-main\"]/form/button")
    WebElement SearchButton;
    public void Careers3(){
        SearchButton.click();
    }



}

