import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static base.CommonAPI.driver;

public class TestGroupMeeting extends GroupsAndMeetings {
    GroupsAndMeetings groupsAndMeetings;


    @BeforeMethod
    public void init(){
        groupsAndMeetings= PageFactory.initElements(driver, GroupsAndMeetings.class);
        driver.navigate().to("https://groups.hotels.com/Group-Rate/?locale=en_US&intlid=HOME+%3A%3A+header_main_section");

    }

    @Test(priority = 48)
    public void testForum(){
        groupsAndMeetings.forum();
    }

    //only need meeting space
    @Test(priority = 49)
    public void testsearch(){
        groupsAndMeetings.search();
    }
   @Test(priority = 50)
    public void testtextDisplayed(){
        groupsAndMeetings.titleDisplayed();
   }
}
