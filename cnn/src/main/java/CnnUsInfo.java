import base.CommonAPI;
import org.openqa.selenium.By;

public class CnnUsInfo extends CommonAPI {

    public static void UsInfo() {

        driver.findElement(By.linkText("US")).click();}


       public static void CrimeAndJustice(){

        driver.findElement(By.linkText("Crime + Justice")).click();
       driver.findElement(By.xpath("//*[@class='media__image media__image--responsive']")).click();
       driver.navigate().back();}

        public static void EnergyAndEnvironment() {
            driver.findElement(By.linkText("Energy + Environment")).click();
        driver.navigate().back();}

        public static void ExtremeAndWeather(){

        driver.findElement(By.linkText("Extreme Weather")).click();
        driver.navigate().back();}

        public static void SpaceAndScience(){
        driver.findElement(By.linkText("Space + Science")).click();
        driver.navigate().back();}




    }


