import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CnnHomePageTest extends CnnHomePage {
    CnnHomePage CnnHomePage;
        @BeforeMethod
        public void init(){
            CnnHomePage= PageFactory.initElements(driver, CnnHomePage.class);
        }

        @Test(priority = 1)
        public void USPage(){
            CnnHomePage.UsPage();
            sleepFor(6);
        }

        @Test(priority = 2)
        public void worldPage(){
            CnnHomePage.WorldPage();
            sleepFor(6);

        }
    @Test(priority = 3)
    public void politicsPage(){
        CnnHomePage.PoliticsPage();
        sleepFor(6);

    }
    @Test(priority = 4)
    public void businessPage(){
        CnnHomePage.BusinessPage();
        sleepFor(6);

    }

    @Test(priority = 5)
    public void opinionPage() {
        CnnHomePage.OpinionPage();
        sleepFor(6);


    }
    @Test(priority = 6)
    public void healthPage() {
        CnnHomePage.HealthPage();
        sleepFor(6);

    }
    @Test(priority = 7)
    public void entertainmentPage() {
        CnnHomePage.EntertainmentPage();
        sleepFor(6);


    }
    @Test(priority = 8)
    public void stylePage() {
        CnnHomePage.StylePage();
        sleepFor(6);


    }
    @Test(priority = 9)
    public void travelPage() {
        CnnHomePage.TravelPage();
        sleepFor(6);


    }
    @Test(priority = 10)
    public void sportsPage() {
        CnnHomePage.SportsPage();
        sleepFor(6);


    }
    @Test(priority = 11)
    public void videosPage() {
        CnnHomePage.VideoPage();
        sleepFor(6);


        }
        @Test(priority = 12)
        public void liveTv () {
            CnnHomePage.LiveTv();
            sleepFor(6);


        }
        @Test(priority = 13)
        public void UsEdision () {
            CnnHomePage.USEdision();
            sleepFor(6);
        }
        @Test(priority = 14)
        public void serchfield () {
            CnnHomePage.SearchField();
            sleepFor(6);
        }
        @Test(priority = 15)
    public void menu(){
            CnnHomePage.Menu();
            sleepFor(6);
        }
    }

