package TestPackage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CommonMethodsTest  extends CommonAPI {

@Test(priority = 1)
    public void SetTest1(){
    getTextByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[2]/div/div/ul/li[2]/div/a");
}
@Test(priority = 2)
public void SetTest2(){
    clickOnCss("a[href='/sports']");
}

}
