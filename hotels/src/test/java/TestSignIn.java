import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignIn extends SignIn{
    SignIn signIn;
    @BeforeMethod
    public void init(){
        signIn= PageFactory.initElements(driver, SignIn.class);
        driver.navigate().to("https://www.hotels.com/profile/signin.html?intlid=OTHER+%3A%3A+header_main_section&target=H4sIAAAAAAAAANMvSExP1U_PTCtJTixKKda3z8wryclMsU3W0zNINLIsr3Ix8c7JdA2r8Hd2TncKdfSq8jXLzfcyyg9KS7LQDU_LCXVOTPXVAwAswCEZRwAAAA..");
    }
    @Test(priority = 48)
    public void testForum(){

    signIn.enterText("//*[@id='sign-in-email']","mazri.s@gmail.com");
    signIn.enterText("//*[@id='sign-in-password']","password");
   signIn.clicksignInbutton();
   sleepFor(3);
    }
    @Test(priority = 54)
    public void testSignInGoogle(){

     signIn.signInGoogle();
    }
    @Test(priority = 55)
    public void testSignInFacebook(){

    signIn.signInFacebook();
    }

}
