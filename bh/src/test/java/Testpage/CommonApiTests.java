package Testpage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CommonApiTests extends CommonAPI {


    @Test(priority = 1)
    public void Test1() {
        clickOnCss( "#cat989 > a > span" );
    }

    @Test(priority = 2)
    public void Test2() {
        clickOnElement( "#cat999999 > a" );
    }

    @Test(priority = 3)
    public void Test3() {
        typeOnInputField( "#top-search-input", "camera" );
    }

    @Test(priority = 4)
    public void Test4() {
        typeOnInputField( "#top-search-input", "camera" );

        takeEnterKeys( "#top-search-input" );
    }

    @Test(priority = 5)
    public void Test5() {

        typeOnInputField( "#top-search-input", "camera" );
        clearInputField( "#top-search-input" );
    }

    @Test(priority = 6)
    public void Test6() {
        driver.navigate().to( "https://www.bhphotovideo.com/find/dealZone.jsp" );
        navigateForward();

    }

    @Test(priority = 7)
    public void Test7() {
        driver.navigate().to( "https://www.bhphotovideo.com/c/browse/Computers-Solutions/ci/9581/N/4294542559" );
        navigateBack();

    }
}


