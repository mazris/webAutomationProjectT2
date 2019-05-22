package Testpage;


import HomePage1.CartPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CartTextTest extends CartPage {
    @Test(priority = 1)
    public void CartText() {


        System.out.println( driver.getTitle() );

        //  System.out.println(driver.findElements( By.xpath( "//*[@id=\"tContent\"]/div[1]/div/div[1]/div/div[1]/h1/span/span" ) ).size());
        if (driver.getTitle().equals( "B&H Photo Video Digital Cameras, Photography, Camcorders" )
        ) {
            System.out.println( "title is good to display" );
        }


    }

    @Test(priority = 2)
    public void ShopGuest() {
        if (driver.getCurrentUrl().equals( "https://www.bhphotovideo.com/" )) {
            System.out.println( "redirected to the right url" );
        }
    }

    @Test(priority = 3)
    public void LoginCart() {
        driver.navigate().to( "https://www.bhphotovideo.com/bnh/controller/home?O=cart.jsp&A=getpage&Q=Login.jsp" );
        driver.findElement( By.xpath( "//*[@id=\"loginLayerContent\"]/form/div/div/p[1]/input" ) ).sendKeys( "massidjadda@gmail.com" );
        sleepFor( 2 );
        driver.findElement( By.xpath( "//p[@class='loginField']//input[@placeholder='Password']" ) ).sendKeys( "djadda06" );
        sleepFor( 2 );
        driver.findElement( By.xpath( "//*[@id=\"loginLayerContent\"]/form/div/input[3]" ) ).click();

    }

    @Test(priority = 4)
    public void GoogleLogin() {
        driver.navigate().to( "https://www.bhphotovideo.com/bnh/controller/home?O=cart.jsp&A=getpage&Q=Login.jsp" );
        driver.findElement( By.xpath( "//*[@id=\"customGoogleSigninBtn\"]" ) ).click();
        sleepFor( 4 );
        String redirected_url = driver.getCurrentUrl();
        driver.get( redirected_url );
        System.out.println( redirected_url );
        driver.navigate().to( "https://accounts.google.com/signin/oauth/oauthchooseaccount?client_id=1086246549855-s2r4ljelaav8umpv64899d00kvdahg5h.apps.googleusercontent.com&as=-EdX18RyV7x2jwM3IbXeIg&destination=https%3A%2F%2Fwww.bhphotovideo.com&approval_state=!ChRETFlmT2EwQVdiZkZNbDNMOTZ3bRIfTTEyaWt3QUtrb1FSVUEyYUd3VDlRSndRRkh3enJSWQ%E2%88%99AJDr988AAAAAXONsD1faMlDRMv8uk2mEfgiWsukSYJhk&oauthgdpr=1&xsrfsig=ChkAeAh8TxaH6MxDmNgCB9F_EweineWCUNtOEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow" );
        driver.findElement( By.xpath( "//*[@id=\"identifierId\"]" ) ).sendKeys( "massidjadda@gmail.com" );
        driver.findElement( By.xpath( "//*[@id=\"password\"]/div[1]/div/div[1]/input" ) ).sendKeys( "djadda06" );
        System.out.println( getCurrentPageUrl() );

    }
}
