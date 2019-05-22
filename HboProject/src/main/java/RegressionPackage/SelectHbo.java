package RegressionPackage;

import base.CommonAPI;
import com.mysql.cj.xdevapi.DocResultImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectHbo extends CommonAPI {

public void SelectM() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a/span")).click();
    Thread.sleep(2000);
    Select select= new Select( driver.findElement
            (By.xpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a/span")));

    select.deselectByIndex(2);
    driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div[2]/ul/li[2]/a")).click();

    Thread.sleep(2000);

}
public  void SelectTheLatest() throws InterruptedException{
    driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[4]/a")).click();
    Thread.sleep(2000);
    Select select1= new Select(driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[4]/a")));
    select1.selectByIndex(1);

}
public void selectTheSOrtBy() throws InterruptedException{
    driver.findElement(By.xpath
            ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[2]/div/div/div/ul/li[3]/div/a/span/div")).click();
    Thread.sleep(2000);
    Select select1= new Select(driver.findElement(By.xpath
            ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[2]/div/div/div/ul/li[3]/div/a/span/div")));
    select1.selectByVisibleText("ALL MOVIES");
}
}
