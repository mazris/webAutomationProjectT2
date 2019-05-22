import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGiftCard extends GiftCards{
    GiftCards giftCards;
    @BeforeMethod
    public void init(){
        giftCards= PageFactory.initElements(driver, GiftCards.class);
        driver.navigate().to("https://www.hotels.com/page/giftcards/?intlid=HOME%20%3A%3A%20header_main_section");
    }
    @Test(priority = 41)
    public void testRegister(){
        giftCards.register();
    }

    @Test(priority = 42)
    public void testBalanceService(){
       giftCards.balanceService();

    }

    @Test(priority = 43)
    public void testExchange(){

        giftCards.Exchange();
    }
    @Test(priority = 44)
    public void testLearnMore(){

        giftCards.learnMore();
    }
    @Test(priority = 45)
    public void testHotelNearMe(){

       giftCards.hotelNearMe();
    }
    @Test(priority = 46)
    public void testTravelGuide(){
        giftCards.travelGuide();

    }
    @Test(priority = 47)
    public void testLastLink(){
        giftCards.lastlink();
    }

}
