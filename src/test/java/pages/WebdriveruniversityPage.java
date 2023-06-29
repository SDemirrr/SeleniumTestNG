package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebdriveruniversityPage {
    public WebdriveruniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@*='Add new todo']")
    public WebElement todo;

 @FindBy(xpath = "//li")
    public List<WebElement> ustCizList;

 @FindBy(xpath = "//*[@*='fa fa-trash']")
    public List<WebElement> sil;
}
