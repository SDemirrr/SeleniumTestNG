package tests.day20_SmokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegatifTest {
    @Test
    public void yanlisKullanici() {//1. Senaryo : Yanlis kullanici dogru sifre
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
                .sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlisSifre() {//2 Senaryo : Dogru kullanici yanlis sifre
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.guvenlik1.click();
        hotelMyCampPage.guvenlik2.click();

        //login butonuna bas
        hotelMyCampPage.login.click();

        //test data username: manager1 ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("userName"));

        //test data password : manager1!
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlisKullaniciSifre() {//3. Senaryo : yanlis kullanici yanlis sifre

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
