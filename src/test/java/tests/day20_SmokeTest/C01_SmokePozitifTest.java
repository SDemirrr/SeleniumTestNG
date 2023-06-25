package tests.day20_SmokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SmokePozitifTest {

    @Test
    public void pozitifTest(){
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        //login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        //Page class'imizdaki locte'lerimize ulasabilmek icin
        //Page class'imizda bir obje olusturarak, olusturmus oldugumuz obje ile
        //page class'indaki locate'lerimize ulasabiliriz
        hotelMyCampPage.guvenlik1.click();
        hotelMyCampPage.guvenlik2.click();
        hotelMyCampPage.login.click();

        //test data username: manager ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("userName"));

        //test data password : Manager1!
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("password")).sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());
        Driver.closeDriver();
    }
}
