import base.CommonAPI;
import org.openqa.selenium.By;

public class CnnPolitics extends CommonAPI {

    public static void PoliticsPage() {
        driver.findElement(By.linkText("Politics")).click();
    }

    public static void Congress(){
        driver.findElement(By.xpath("//*[@href='/specials/politics/congress-capitol-hill']")).click();
    }
    public static void SupremCourt(){
        driver.findElement(By.xpath("//*[@href='/specials/politics/supreme-court-nine']")).click();
    }
    public static void FactFirst() {
        driver.findElement(By.xpath("//*[@href='/specials/politics/fact-check-politics']")).click();
    }
    public static void Election() {
        driver.findElement(By.xpath("//*[@href='/specials/politics/2020-election-coverage']")).click();
    }


}
