package tests.day23_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {


    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) throws InterruptedException {
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));

        //java, selenium, samsung ve iphone icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        Thread.sleep(2000);
        amazonPage.aramaKutusu.sendKeys(kelimeler,Keys.ENTER);

        //sonuclarin aradigimiz kelimeleri icerdigini test edelim
         String actualKelime=amazonPage.aramaSonucWE.getText();
         Assert.assertTrue(actualKelime.contains(kelimeler));

        //sayfayi kapatalim
        Driver.closeDriver();



    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();
    }
}
