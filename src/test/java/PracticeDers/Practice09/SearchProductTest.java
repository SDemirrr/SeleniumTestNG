package PracticeDers.Practice09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class SearchProductTest extends TestBaseRapor {
    /*
    1. Tarayıcıyı başlat
    2. 'https://automationexercise.com' url'sine gidin
    3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
    4. 'Ürünler' butonuna tıklayın
    5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
    6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
    7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
    8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
     */
    AutoExPage autoExPage=new AutoExPage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test01(){
        extentTest=extentReports.createTest("automationexercise","Web Automation");
        //1. Tarayıcıyı başlat
        // 2. 'https://automationexercise.com' url'sine gidin
        extentTest.info("//1. Tarayıcıyı başlat\n" +
                "        // 2. 'https://automationexercise.com' url'sine gidin");
        Driver.getDriver().get(ConfigReader.getProperty("autoExUrl"));

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        Assert.assertTrue(autoExPage.basariliGiris.isDisplayed());
        extentTest.info("3. Ana sayfanın başarıyla görünür olduğunu doğrulayın");

        // 4. 'Ürünler' butonuna tıklayın
        autoExPage.products.click();
        ReusableMethods.waitFor(5);
        extentTest.info("4. 'Ürünler' butonuna tıklayın");

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
         Assert.assertTrue(autoExPage.allProducts.isDisplayed());
        extentTest.info("5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın");

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        autoExPage.searchBox.sendKeys("blue top");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("6. Arama girişine ürün adını girin ve ara düğmesine tıklayın");

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(autoExPage.allProducts.isDisplayed());
        extentTest.info("7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın");

        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Assert.assertTrue(autoExPage.blueTop.isDisplayed());
        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğunu doğrulandi");

        //blue icin arama yap toplu assertion (birden fazla urun ciktiginda)
        autoExPage.searchBox.clear();
        autoExPage.searchBox.sendKeys("blue");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        for (WebElement w:autoExPage.blue) {
            Assert.assertTrue(w.isDisplayed());
        }

    }
}
