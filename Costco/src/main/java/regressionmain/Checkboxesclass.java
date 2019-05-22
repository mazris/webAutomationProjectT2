package regressionmain;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Checkboxesclass extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"warehouse-locations-dropdown\"]")
    public static WebElement findWarehouse;
      Actions actions;




}
