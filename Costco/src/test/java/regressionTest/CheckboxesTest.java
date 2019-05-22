package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import regressionmain.Checkboxesclass;

public class CheckboxesTest extends CommonAPI {

    //Checkboxesclass actions;



    public void init (){

       // actions= PageFactory.initElements(driver,Checkboxesclass.class);

    }



   // @Test
    public void testMouseHovertest1() {
        WebElement element = driver.findElement(By.linkText("Services"));
        Actions actionObj= new Actions(driver);
        actionObj.moveToElement(element).build().perform();
        sleepFor(5);
        driver.findElement(By.xpath("/html/body")).click();
        sleepFor(5);
    }


    //@Test
    public void pagefactory(){
        typeByXpath("//*[@id=\"search-field\"]","NIKE shoes");

    }

    //@Test
    public void mouseScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //to scroll to view
        WebElement link = driver.findElement(By.linkText("US"));
        js.executeScript("arguments[0].scrollIntoView(true);", link);
        sleepFor(10);
    }



     //@Test
    public void testMouseHovertest2() {
        WebElement element = driver.findElement(By.id("navigation-dropdown"));
        Actions actionObj= new Actions(driver);
        actionObj.moveToElement(element).build().perform();
        sleepFor(5);
        driver.findElement(By.xpath("//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_2\"]")).click();
        sleepFor(5);
    }




    @Test
    public void checkbox1() {
        WebElement element = driver.findElement(By.id("warehouse-locations-dropdown"));
        Actions actionObj= new Actions(driver);
        actionObj.moveToElement(element).build().perform();
        sleepFor(5);
        driver.findElement(By.xpath("//*[@id=\"locator_search_filters\"]/div[1]/div[2]/label/i")).click();
        sleepFor(5);
    }

   /* public void checkmarkWH(String State){
        actions = new Actions(driver);
        actions.moveToElement(findWarehouse);
        actions.perform();
        sleepFor(4);
        searchWH.sendKeys(State);
//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//System.out.println(checkboxes.getSize());
//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        markup.click();
        sleepFor(6);
        System.out.println(markup.isEnabled());

//Assert.assertFalse(false);
//clickWH.click();
    }*/


}
