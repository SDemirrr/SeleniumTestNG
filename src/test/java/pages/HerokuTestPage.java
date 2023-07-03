package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuTestPage {
    public HerokuTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[@*='onclick']")
    public WebElement onClick;

   @FindBy(xpath = "//*[@*='onblur']")
    public WebElement onBlur;
    @FindBy(xpath = "//*[@*='oncontextmenu']")
    public WebElement oncontextMenu;



    @FindBy(xpath = "//*[@*='ondoubleclick']")
    public WebElement onDoubleClick;

    @FindBy(xpath = "//*[@*='onfocus']")
    public WebElement onFocus;
    @FindBy(xpath = "//*[@*='onkeydown']")
    public WebElement onKeyDown;

    @FindBy(xpath = "//*[@*='onkeyup']")
    public WebElement onKeyUp;
    @FindBy(xpath = "//*[@*='onkeypress']")
    public WebElement onKeyPress;
    @FindBy(xpath = "//*[@*='onmouseover']")
    public WebElement onMouseOver;
    @FindBy(xpath = "//*[@*='onmouseleave']")
    public WebElement onMouseLeave;
    @FindBy(xpath = "//*[@*='onmousedown']")
    public WebElement onMouseDown;

    @FindBy(xpath = "//*[text()='Event Triggered']")
    public List<WebElement> tiklandiList;

    @FindBy(xpath = "//div/div/div")
    public List<WebElement> elementList;


}
