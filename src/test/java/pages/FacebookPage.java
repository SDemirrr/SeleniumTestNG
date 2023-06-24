package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

   public FacebookPage (){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='pass']")
    public WebElement sifre;

    @FindBy(xpath = "//*[@*='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement girisButton;

    @FindBy(xpath = "//*[@class='_9ay5']")
    public WebElement girisYapilamadi;


}
