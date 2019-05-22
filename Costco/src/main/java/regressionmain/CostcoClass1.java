package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CostcoClass1 extends CommonAPI {

    public void openPage() {
        System.out.println(driver.getTitle());

    }

    public void search(String item) {

        driver.findElement(By.id("search-field")).sendKeys(item);
    }

    public void click() {
        driver.findElement(By.id("search-field")).click();
    }

    public void selectgro (){
        driver.findElement(By.id("search-dropdown-select")).click();
        Select select = new Select(driver.findElement(By.id("search-dropdown-select")));
        select.selectByIndex(1);

    }
    public void click2() {
        driver.findElement(By.id("search-field")).sendKeys("pasta");

    }
    public void addtocart() {
        driver.findElement(By.id("cart-d")).click();
    }

    public void change() {
        driver.findElement(By.id("delivery-postal-change")).click();

    }

    public void zipcod() {
        driver.findElement(By.id("footer-search-field")).sendKeys("11111");
    }


}
