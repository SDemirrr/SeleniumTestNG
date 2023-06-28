package tests.day22_HtmlReports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
     /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() {

       //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //-login butonuna bas
        BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();
        blueRentaCarPage.loginButton1.click();

        //-test data user email: customer@bluerentalcars.com ,
        //-test data password : 12345 dataları girip login e basın
        blueRentaCarPage.email.sendKeys(ConfigReader.getProperty("userEmail"));
        blueRentaCarPage.password.sendKeys(ConfigReader.getProperty("pass"));

        //-login butonuna tiklayin
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //-Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        extentTest.info("Doğru kullanıcı email ve password girildi");
        extentTest.info("Ikinci login butonuna basıldı");

        /*
        Actions kullanarak verileri girme
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("brcValidPassword")).
                sendKeys(Keys.ENTER).perform();
          */

        // degerler girildiğinde sayfaya başarılı bir  şekilde girildiğini test edelim
        System.out.println(blueRentaCarPage.kullaniciProfilIsmi.getText());
        String actulaUserName = blueRentaCarPage.kullaniciProfilIsmi.getText();
        String expectedUserName = "John Walker";
        Assert.assertEquals(expectedUserName, actulaUserName);
        extentTest.pass("Sayfaya basarili sekilde girildi");
        /*

        String expectedUserName=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actulanUserName,expectedUserName);
        extentTest.pass("Sayfaya basarili sekilde girildi");

         */

      /*
      Hatanin resmini RAPORDA görmek istersek  target altinda Rapor icinde yazdirilan resmin uzernie sag tiklayin --->
      Open in --> uzerine gelin -->  Explorer tiklayin bilgisayardaki dosyaninzin icine yönleneceksiniz
      oradan raporu cift tiklayin acilan yeni sayfada alta kucuk resim var uzerini tiklayin
      ve karsimiza resim cikmis olacak .

       */


    }
}
