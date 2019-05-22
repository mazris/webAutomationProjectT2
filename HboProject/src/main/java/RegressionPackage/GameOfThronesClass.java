package RegressionPackage;
import base.CommonAPI;
import org.openqa.selenium.By;

public class GameOfThronesClass extends CommonAPI {
    public void openPage() {

        System.out.println(driver.getCurrentUrl());
    }

    public void hboSearch() {
        driver.findElement(By.xpath
                ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/div")).click();
    }

    public void hboSearch2(String serie) {
        driver.findElement(By.xpath
                (" /html[1]/body[1]/div[2]/main[1]/div[2]/header[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys(serie);
    }

    public void hboSearch3() {
        driver.findElement
                (By.xpath("//span[@class='components/Search--submitIcon']")).click();
    }
    public void gameOFthrones1(){
        driver.findElement(By.xpath
                ("//*[@id=\"root\"]/main/section/div/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/a/span[1]")).click();
    }
    public void gameOFthrones2(){
        driver.findElement(By.xpath

                ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[3]/div/a")).click();

    }

    /*public void SeasonSelect(){
        driver.findElement(By.xpath
                ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a")).click();
        Select select = new Select(driver.findElement
                (By.xpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a")));
        select.selectByIndex(1);
    }*/
    public void Seasonseasons(){
        driver.findElement(By.xpath
                ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a/span/div")).click();
    }

    public void GameOfThronesSeason2(){
        driver.findElement(By.xpath
                ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[3]/div/div/div/ul/li[2]/div[2]/ul/li[2]/a")).click();
    }
    public void GOback(){
        driver.navigate().back();
    }
    public void TyrionLanister(){
        driver.findElement(By.xpath
                ("//*[@id=\"root\"]/main/section/div[1]/div/div/div/div[3]/div/a/div/img")).click();
    }
    public void GOback1(){
        driver.navigate().back();
    }


}