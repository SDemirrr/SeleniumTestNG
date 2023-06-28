package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@*='btn btn-primary btn-sm']")
    public WebElement loginButton1;

    @FindBy(xpath = "(//*[@*='formBasicEmail'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//*[@*='formBasicPassword'])[2]")
    public WebElement password;


    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;




}
