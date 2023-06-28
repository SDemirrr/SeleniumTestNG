package tests.day22_HtmlReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_PozitifLoginTestiRapor extends TestBaseRapor {

    @Test
    public void test01()  {
        extentTest=extentReports.createTest("pozitif login","gecerli");
        //1-amazon anasayfaya gidin
        Driver.getDriver().get("https://amazon.com");

        //2-title in Amazon içerdigini test edin
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        Driver.getDriver().navigate().refresh();

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());

        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        extentTest.info("nutella arandi");


        //5-arama yapıldıgını test edin
        WebElement sonuc = Driver.getDriver().findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());

        //6-arama sonucunun Nutella içerdigini test edin
        Assert.assertTrue(sonuc.getText().contains("Nutella"));
        extentTest.pass("kullanici basarili giris yapti");
        Driver.closeDriver();
    }
}
