package tests.day22_HtmlReports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
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

    BrcPage brcpPage;

    @Test
    public void test01() {

        extentTest = extentReports.createTest("Pozitif Test", "Geçerli kullanıcı adı ve password ile giriş yapıldı");
        brcpPage = new BrcPage();
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");
        // login butonuna bas
        brcpPage.loginButton1.click();
        extentTest.info("login butonuna basıldı");
        // test data user email: customer@bluerentalcars.com
        brcpPage.email.sendKeys(ConfigReader.getProperty("userEmail"));

        // test data password: 12345
        brcpPage.password.sendKeys(ConfigReader.getProperty("pass"));

        // login butonuna tıklayın
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Doğru kullanıcı email ve password girildi");
        extentTest.info("Ikinci login butonuna basıldı");

        /*
        Actions kullanarak verileri girme
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("brcValidPassword")).
                sendKeys(Keys.ENTER).perform();
          */
        String actulaUserName = brcpPage.kullaniciProfilIsmi.getText();
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
