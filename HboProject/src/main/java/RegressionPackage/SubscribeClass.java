package RegressionPackage;

import base.CommonAPI;
import com.sun.codemodel.internal.writer.ZipCodeWriter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.jvm.hotspot.oops.OopUtilities;

import javax.xml.XMLConstants;
import javax.xml.xpath.XPath;

public class SubscribeClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div/div/div/div[3]/div[3]")
    WebElement SUBSC;

    public void setGETHBO() {
        SUBSC.click();

    }

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/input")
    WebElement EmailFIELD;

    public void setEmailFIELD(String email) {
        if (EmailFIELD.isEnabled()) {
            EmailFIELD.sendKeys(email);
        }
    }

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[2]/input")
    WebElement PasswordFIELD;

    public void setPasswordFIELD(String password) {
        if (PasswordFIELD.isEnabled()) {
            PasswordFIELD.sendKeys(password);
        }
    }

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[7]/div[1]/input")
    WebElement FirstName;

    public void setFirstName(String firstName) {
        if (FirstName.isEnabled()) {
            FirstName.sendKeys(firstName);
        }

    }

    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[9]/div[1]/input")
    WebElement LastName;

    public void setLastName(String lastName) {
        if (LastName.isEnabled()) {
            LastName.sendKeys(lastName);

        }
    }
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[11]/div[1]/input")
    WebElement ZipCode;

    public void setZIpCode(String zip) {
        if (ZipCode.isEnabled()) {
            ZipCode.sendKeys(zip);

        }
    }

    @FindBy(xpath = " //*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[12]/div[1]/div")
    WebElement CheckBox;
    public void setCheckBox() {
        CheckBox.click();
    }

   @FindBy(xpath = " //div[@class='default class3 class2']//div[@class='default class2 class3']")
WebElement CheckBoxConf;
    public void setCheckBoxConf(){
        CheckBoxConf.click();
        System.out.println(CheckBoxConf.isSelected());
    }


    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div/div/span/span")
    WebElement CreateAccountButton;

    public void setCreateAccountButton(){
        CreateAccountButton.click();

    }

}

























