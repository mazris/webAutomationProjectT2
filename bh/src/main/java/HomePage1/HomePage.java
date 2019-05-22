package HomePage1;

import base.CommonAPI;
import org.openqa.selenium.By;


public class HomePage extends CommonAPI {
    public void openpage() {
        System.out.println( driver.getTitle() );
    }

    public void search(String item) {

        driver.findElement( By.id( "top-search-input" ) ).sendKeys( item );
        driver.findElement( By.xpath( "//*[@id=\"header\"]/section[2]/div[1]/form/p/button" ) ).click();
        getTextByXpath( "" );
        clickByXpath( "" );

    }


    public void selectOption() throws InterruptedException {
        driver.findElement( By.xpath( "//*[@id=\"cat989\"]/a/span" ) ).click();
        Thread.sleep( 5000 );

        driver.navigate().back();


    }

}
