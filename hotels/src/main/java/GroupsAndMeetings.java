import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GroupsAndMeetings extends CommonAPI {
    @FindBy(id="groupType")
    public WebElement groupType;

    public void selectgroupType(String value){
        Select cls= new Select(groupType);
        cls.selectByVisibleText(value);
    }
    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
   public boolean istextdisplayed(String xpath){
        WebElement text = driver.findElement(By.xpath(xpath));
        System.out.println(text.getText());
        if(text.getText().equals("Experienced Team of Global Experts"))
            return true;
        return false;
   }
   public void forum(){
       typeByXpath("//*[@id='txtCity1']","Bahamas");

       typeByXpath("//*[@id='CheckInDate1_disp']","05/20/2019");

       typeByXpath("//*[@id='CheckOutDate1_disp']","05/25/2019");

       selectgroupType("Association");
       typeByXpath("//*[@id='rooms']","4");

       clickByXpath("//*[@class='star-rating']");

       typeByXpath("//*[@id='FullName']","Sonia Mazri");

       typeByXpath("//*[@id='input-email']","mazri.s101@gmail.com");

       clickByXpath("//*[@name='step1']");

       sleepFor(6);
   }
   public void search(){
       clickByXpath("//a[@href='/Search/Meeting-Space.htm?City=&InDate=&OutDate=']");

       sleepFor(3);
   }
   public void titleDisplayed(){
       if(istextdisplayed("//*[text()='Experienced Team of Global Experts']"))
           System.out.println("Experienced Team of Global Experts is displayed");
       else System.out.println("Experienced Team of Global Experts is not displayed");
   }

}
