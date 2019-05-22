package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainClass4 extends CommonAPI {

    @FindBy(id = "warehouse-savings")
    WebElement test1;

    @FindBy(xpath = " //a[@id='cart-d']")
    WebElement test2;

    @FindBy(css = "#search-field")
    WebElement test5;

    @FindBy(name = "continue-shopping")
    WebElement test3;

    @FindBy(css = "#search-field")
    WebElement test4;


    @FindBy(id = "search-field")
    WebElement test6;


    @FindBy(xpath = "//*[@id=\"search-field\"]")
    WebElement test7;




    public void setTest1() {
        test1.click();

    }

    public void setTest2() {
        test2.click();

    }
    public void setTest8select(){

        driver.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]")).click();
        sleepFor(4);

        Select select = new Select(driver.findElement(By.xpath(" /html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]")));
        select.selectByValue("Canada");
    }

    public void setTest3() {
        test3.click();

    }

    public void setTest4(String item) {
        if (test4.isEnabled()) {
            test4.sendKeys(item, Keys.ENTER);
        }
    }

    public void setTest5() {
        test5.click();

    }

    public void setTest6(String item) {
        if (test6.isEnabled()) {
            test6.sendKeys(item, Keys.ENTER);
        }
    }
    public void setTest7(String item) {
        if (test7.isEnabled()) {
            test7.sendKeys(item, Keys.ENTER);
        }
    }
}
