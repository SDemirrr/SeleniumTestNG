package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {
    SaucedemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
