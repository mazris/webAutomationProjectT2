package TestPackage;

import RegressionPackage.GetHboClass;
import base.CommonAPI;
import oracle.jrockit.jfr.StringConstantPool;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetHboTest extends CommonAPI {

    GetHboClass gethboClass;
    String url = "https://www.hbo.com/";


 @BeforeMethod
  public void init(){
      gethboClass= PageFactory.initElements(driver,GetHboClass.class);//ininstantiate the object
  }

  @Test(priority = 1)
    public void reCap(){
      driver.get(url);
  }

  @Test(priority = 2)
    public void test1(){
      driver.get(url);
      gethboClass.setGETHBO();
  }
  @Test(priority = 3)
    public void test2(){
      driver.get(url);
      gethboClass.setGETHBO();
      gethboClass.setFREETRAIL();

 }
 @Test(priority = 4)
    public void test3(){
     driver.get(url);
     gethboClass.setGETHBO();
     gethboClass.setFREETRAIL();

 }

 }


