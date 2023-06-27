package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_HardAssert extends TestBaseBeforeMethodAfterMethod {
    /*
    1-amazon ana sayfasina gidin
    2-title'in amazon icerdigini test edin
    3-arama kutusunun erisilebilir oldugunu test edin
    4-arama kutusuna Nutella yazip aratin
    5-araam yapildigini test edin
    6-arama sonucunun Nutella icerdigini test edin
     */

    @Test(groups = "grup1")
    public void test1() {
        //1-amazon ana sayfasina gidin
        driver.get("https://amazon.com");

        //2-title'in amazon icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        //3-arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());

        //4-arama kutusuna Nutella yazip aratin
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //5-arama yapildigini test edin
        Assert.assertTrue(driver.getTitle().contains("Nutella"));

        //6-arama sonucunun Nutella icerdigini test edin
        WebElement sonuc=driver
                .findElement(By.xpath("//*[@*='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.getText().contains("Nutella"));


    }
}
