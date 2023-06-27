package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    //hepsiburada sayfasina gidiniz
    //sayfanin resmini aliniz
    //sayfayi kapatin

    @Test
    public void test1() throws IOException {
        //hepsiburada sayfasina gidiniz
        Driver.getDriver().get("https://hepsiburada.com");

        //sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");

        //sayfayi kapatin
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));

        //nutella aratiniz
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //arama sonuc yazisi WebElementi'nin resmini aliniz
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amazonPage.aramaSonucWE);

    }
}
