import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCreateAccount extends CreateAccount{
   CreateAccount createAccount;
    @BeforeMethod
    public void init() {
        createAccount = PageFactory.initElements(driver, CreateAccount.class);
        driver.navigate().to("https://www.hotels.com/profile/signup.html?intlid=SIGNUP+%3A%3A+header_main_section&target=H4sIAAAAAAAAANMvSExP1U_PTCtJTixKKda3z8wryclMsU3W0zNINLIsr3Ix8c7JdA2r8Hd2TncKdfSq8jXLzfcyyg9KS7LQDU_LCXVOTPXVAwAswCEZRwAAAA..");
    }

    @Test(priority = 51)
    public void TestGoogle(){
      createAccount.clickGoogle();
    }
    @Test(priority = 52)
    public void TestFacebook(){
      createAccount.clickFacebook();
    }

    @Test(priority = 53)
    public void testForum(){
    createAccount.forum();

    }
}
