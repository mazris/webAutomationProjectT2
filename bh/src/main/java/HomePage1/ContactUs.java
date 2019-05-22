package HomePage1;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUs extends CommonAPI {

    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[2]/div[2]/div/a/span")
    WebElement contactus;

    @FindBy(xpath = "//*[@id=\"deprtmnt\"]")
    WebElement selectcontact;

    @FindBy(xpath = "//*[@id=\"subject\"]")
    WebElement subject;

    public void contactlink() {
        contactus.click();
    }

    public void contactlist() {
        driver.navigate().to( "https://www.bhphotovideo.com/find/contactForm.jsp" );
        Select contact = new Select( driver.findElement( By.xpath( "//*[@id=\"deprtmnt\"]" ) ) );
        contact.selectByIndex( 1 );


    }

    public void categorylist() {
        driver.navigate().to( "https://www.bhphotovideo.com/find/contactForm.jsp" );
        Select contact = new Select( driver.findElement( By.xpath( "//*[@id=\"deprtmnt\"]" ) ) );
        contact.selectByIndex( 1 );
        Select category = new Select( driver.findElement( By.xpath( "//*[@id=\"contactForm\"]/div[3]/select" ) ) );
        category.selectByIndex( 1 );
    }

    public void subjectwrite(String contactsubject) {
        driver.navigate().to( "https://www.bhphotovideo.com/find/contactForm.jsp" );
        Select contact = new Select( driver.findElement( By.xpath( "//*[@id=\"deprtmnt\"]" ) ) );
        contact.selectByIndex( 1 );
        Select category = new Select( driver.findElement( By.xpath( "//*[@id=\"contactForm\"]/div[3]/select" ) ) );
        category.selectByIndex( 1 );
        subject.sendKeys( contactsubject );

    }
}
