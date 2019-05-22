package HomePage1;

import base.CommonAPI;
import org.openqa.selenium.By;

public class CartPage extends CommonAPI {

//testing the window of cart when it's empty
    public void CartText() {
        driver.navigate().to( "https://www.bhphotovideo.com/find/cart.jsp" );
    }

    public void ShopGuest() {
        driver.navigate().to( "https://www.bhphotovideo.com/find/cart.jsp" );
        driver.findElement( By.xpath( "//*[@id=\"tContent\"]/div[1]/div/div[2]/div/a[1]" ) ).click();

    }

    public void LoginCart() {
        driver.navigate().to( "https://www.bhphotovideo.com/bnh/controller/home?O=cart.jsp&A=getpage&Q=Login.jsp" );
        sleepFor( 5 );


    }

    public void GoogleLogin() {
        driver.navigate().to( "https://www.bhphotovideo.com/bnh/controller/home?O=cart.jsp&A=getpage&Q=Login.jsp" );
        sleepFor( 5 );
        driver.navigate().to( "https://accounts.google.com/signin/oauth/oauthchooseaccount?client_id=1086246549855-s2r4ljelaav8umpv64899d00kvdahg5h.apps.googleusercontent.com&as=-EdX18RyV7x2jwM3IbXeIg&destination=https%3A%2F%2Fwww.bhphotovideo.com&approval_state=!ChRETFlmT2EwQVdiZkZNbDNMOTZ3bRIfTTEyaWt3QUtrb1FSVUEyYUd3VDlRSndRRkh3enJSWQ%E2%88%99AJDr988AAAAAXONsD1faMlDRMv8uk2mEfgiWsukSYJhk&oauthgdpr=1&xsrfsig=ChkAeAh8TxaH6MxDmNgCB9F_EweineWCUNtOEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow" );

        sleepFor( 5 );
    }


}
