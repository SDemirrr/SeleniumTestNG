package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class AutoExPage {
    public AutoExPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='en']")
   public WebElement basariliGiris;
    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement products;

    @FindBy(xpath = "//*[@*='search_product']")
    public WebElement searchBox;


    @FindBy(xpath = "(//h2)[3]")
    public WebElement allProducts;

    @FindBy(xpath = "(//*[text()='Blue Top'])[1]")
    public WebElement blueTop;
    @FindBy(xpath = "(//*[text()='Blue Top'])[1]")
    public List<WebElement>  blue;



}
