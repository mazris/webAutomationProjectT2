import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class CnnOpinion extends CommonAPI {
    public static void OpinionPage() {
        driver.findElement(By.linkText("Opinion")).click();
    }
    public static void PoliticalOpEdsPage(){
        driver.findElement(By.xpath("//*[@href='/specials/opinion/opinion-politics']")).click();
    }
    public static void SocialComentary(){
        driver.findElement(By.xpath("//*[@href='/specials/opinion/opinion-social-issues']")).click();
    }


}
