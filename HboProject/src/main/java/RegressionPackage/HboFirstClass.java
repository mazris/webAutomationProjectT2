package RegressionPackage;
import base.CommonAPI;
import org.openqa.selenium.By;

public class HboFirstClass extends CommonAPI {
    public void openPage() {
        System.out.println(driver.getCurrentUrl());
    }
    public void hboSearch() {
            driver.findElement(By.xpath
                    ("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/div")).click();
    }
    public void hboSearch2(String serie) {
           driver.findElement(By.xpath(" /html[1]/body[1]/div[2]/main[1]/div[2]/header[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys(serie);
     }
     public void hboSearch3() {
           driver.findElement(By.xpath("//span[@class='components/Search--submitIcon']")).click();
    }
    public  void hboSearchBack() {
        driver.navigate().back();
    }
        public void hboRefresh(){
          driver.navigate().refresh();

        }
    public void hboSerie(){
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]" +
                "/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]")).click();

    }

    public void hboGetHbo(){

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]" +
                "/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]")).click();

    }
    /*public  void hboSearchBack2() {
        driver.navigate().back();
    }*/


    }

