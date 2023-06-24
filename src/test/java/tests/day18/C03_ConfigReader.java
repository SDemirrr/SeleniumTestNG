package tests.day18;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
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
    public void positiveLoginTest(){
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        //login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.guvenlik1.click();
        hotelMyCampPage.guvenlik2.click();
        hotelMyCampPage.login.click();

        //test data username: manager ,
        String userName="manager";

        //test data password : Manager1!
        String password="Manager1";
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}
