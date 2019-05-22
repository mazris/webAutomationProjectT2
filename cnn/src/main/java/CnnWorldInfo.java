import base.CommonAPI;
import org.openqa.selenium.By;

public class CnnWorldInfo extends CommonAPI {

    public static void WorldPage() {
        driver.findElement(By.linkText("World")).click();
    }

    public static void EuropePage(){
        driver.findElement(By.linkText("Europe")).click();
        driver.findElement(By.linkText("Brexit")).click();

    }

    public static void AfricaPage(){
        driver.findElement(By.linkText("Africa")).click();
        driver.findElement(By.xpath("//*[@href='/videos/world/2019/04/15/sudan-protesters-military-coup-toppled-al-bashir-elbagir-dnt-tsr-vpx.cnn']")).click();
    }

    public static void AsiaPage(){
        driver.findElement(By.linkText("Asia")).click();
        driver.findElement(By.xpath("//*[@href='/2019/05/13/asia/philippines-midterm-elections-intl/index.html']")).click();
    }
    public static void AmericasPage() {
        driver.findElement(By.linkText("Americas")).click();
        driver.findElement(By.xpath("//*[@href='/2018/12/02/sport/gallery/rugby-sevens-story-of-the-season-2018-19-spt-intl/index.html']")).click();
    }
    public static void AustraliaPage(){
        driver.findElement(By.linkText("Australia")).click();
        driver.findElement(By.xpath("//*[@href='/2019/05/15/world/wechat-australian-election-intl/index.html']")).click();
    }
    public static void ChinaPage() {
        driver.findElement(By.linkText("China")).click();
    }
    public static void UKPage() {
        driver.findElement(By.linkText("UK")).click();
    }
    public static void IndiaPage(){
        driver.findElement(By.linkText("India")).click();
}
    public static void MiddleEastPage() {
        driver.findElement(By.linkText("Middle East")).click();
    }

}