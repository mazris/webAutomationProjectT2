import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CnnHomePage extends CommonAPI {

    public static void UsPage() {

        driver.findElement(By.linkText("US")).click();
        driver.navigate().back();}
    public static void WorldPage() {
        driver.findElement(By.linkText("World")).click();
        driver.navigate().back();}
    public static void PoliticsPage() {
        driver.findElement(By.linkText("Politics")).click();
        driver.navigate().back();}
    public static void BusinessPage() {
        driver.findElement(By.linkText("Business")).click();
        driver.navigate().back();}
    public static void OpinionPage() {
        driver.findElement(By.linkText("Opinion")).click();
        driver.navigate().back();}
    public static void HealthPage() {
        driver.findElement(By.linkText("Health")).click();
        driver.navigate().back();}
    public static void EntertainmentPage() {
        driver.findElement(By.linkText("Entertainment")).click();
        driver.navigate().back();}
    public static void StylePage() {
        driver.findElement(By.linkText("Style")).click();
        driver.navigate().back();}
    public static void TravelPage() {
        driver.findElement(By.linkText("Travel")).click();
        driver.navigate().back();}
    public static void SportsPage() {
        driver.findElement(By.linkText("Sports")).click();
        driver.navigate().back();}
    public static void VideoPage() {
        driver.findElement(By.linkText("Video")).click();
        driver.navigate().back();}

    public static void LiveTv(){
        driver.findElement(By.xpath("//*[@id='nav-mobileTV']")).click();
        driver.navigate().back();
    }
    public static void USEdision(){
        driver.findElement(By.xpath("//*[@class='edition-picker__current-edition']")).click();
        driver.navigate().back();
    }
    public static void SearchField(){
        driver.findElement(By.xpath("//*[@class='search__button cnn-icon']")).click();
        driver.findElement(By.xpath("//*[@id='search-input-field']")).sendKeys("international affairs");
        driver.navigate().back();
    }
    public static void Menu(){
        driver.findElement(By.xpath("//*[@id='menu']")).click();
    }

}


