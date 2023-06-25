package tests.day19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifTest {

    /*
    1 ) Bir Class olustur : PositiveTest
    2) Bir test method olustur positiveLoginTest()
    https://www.hotelmycamp.com/ adresine git
    login butonuna bas
    test data username: manager ,
    test data password : Manager1!
    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

     */

    @Test
    public void negatifTestMethod(){
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.guvenlik1.click();
        hotelMyCampPage.guvenlik2.click();

        //login butonuna bas
        hotelMyCampPage.login.click();

        //test data username: manager1 ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));

        //test data password : manager1!
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());
        Driver.closeDriver();

    }
}
