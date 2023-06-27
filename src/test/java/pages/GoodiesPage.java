package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoodiesPage {
   public GoodiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@*='details-button']")
    public WebElement guvenlik1;

    @FindBy(xpath = "//*[@*='proceed-link']")
    public WebElement guvenlik2;




}
