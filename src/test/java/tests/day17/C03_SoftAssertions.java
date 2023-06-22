package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssertions extends TestBaseBeforeMethodAfterMethod {
      /*
    1-amazon ana sayfasina gidin
    2-title'in amazon icerdigini test edin
    3-arama kutusunun erisilebilir oldugunu test edin
    4-arama kutusuna Nutella yazip aratin
    5-araam yapildigini test edin
    6-arama sonucunun Nutella icerdigini test edin
     */

    @Test
    public void test1() {
        /*
        ***Soft Assertions baslangic ve bitis satirlari arasindaki tum assertionlari
        yapip bitis olarak belirtmemiz gereken assertAll(); method'uyla test method'umuzdaki
        tum assertin'lari kontrol edr
         Fail olan olursa assertion yaptigimmiz method'un saonuna yazdigimiz mesaji bize verir.
         */
        //1-amazon ana sayfasina gidin
        driver.get("https://amazon.com");

        //2-title'in amazon icerdigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"girilen kelimeyi icermiyor");

        //3-arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());

        //4-arama kutusuna Nutella yazip aratin
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //5-arama yapildigini test edin
     softAssert.assertTrue(driver.getTitle().contains("Nutella"));

        //6-arama sonucunun Nutella icerdigini test edin
        WebElement sonuc=driver
                .findElement(By.xpath("//*[@*='a-section a-spacing-small a-spacing-top-small']"));
       softAssert.assertTrue(sonuc.getText().contains("Nutella"));
        System.out.println("Hata olsa bile burasi calisir");
       softAssert.assertAll();
        System.out.println("Hata varsa burasi calismaz");
    }
}
