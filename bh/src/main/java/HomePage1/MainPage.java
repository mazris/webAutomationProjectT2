package HomePage1;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends CommonAPI {

    @FindBy(xpath = "/html/body/div[2]")
    WebElement scrollpage;

    @FindBy(xpath = "//*[@id=\"bhlogo\"]/g/g[2]/path[4]")
    WebElement logo;

    @FindBy(id = "top-search-input")
    WebElement search;

    @FindBy(xpath = "//button[@name='Top Nav-Search']")
    //*[@id="header"]/section[2]/div[1]/form/p/button
            WebElement clicksearch;

    @FindBy(xpath = "//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]")
    WebElement photography;

    @FindBy(xpath = "//li[@id='cat989']//li[1]//a[1]//div[1]")
    WebElement digitalcameras;

    @FindBy(xpath = "//*[@id=\"top-search-input\"]")
    WebElement searchused;

    @FindBy(xpath = "//div[@class='relative']")
    WebElement cart;


    public void scrolldown() {
        scrollpage.click();
    }

    public void logoclick() {
        logo.click();
    }

    public void searchbar() {
        search.sendKeys( "Canon 5D" );
        search.sendKeys( Keys.ENTER );


    }

    public void searchclick() {
        clicksearch.click();
    }

    public void photoDep() {
        photography.click();
    }

    public void Cameradig() {
        driver.findElement( By.xpath( "//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]" ) );
        sleepFor( 4 );

        digitalcameras.click();

    }

    public void SearchUsed() {
        driver.navigate().to( "https://www.bhphotovideo.com/c/browse/Used-Equipment/ci/2870/N/4294247188" );
        sleepFor( 4 );
        searchused.sendKeys( "camera" );
        sleepFor( 4 );
        searchused.sendKeys( Keys.ENTER );
        sleepFor( 4 );
    }

    public void ShipLocal() {
        driver.findElement( By.xpath( "//div[@class='shipOrderWhen cursor-pointer js-ship-order-when']" ) ).click();
        sleepFor( 5 );
    }

    public void Cart() {
        cart.click();

    }


}
