package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//*[@*='details-button']")
   public WebElement guvenlik1;

    @FindBy(xpath = "//*[@*='proceed-link']")
    public WebElement guvenlik2;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;



}
