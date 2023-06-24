package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFacebookTest {
    /*
    1 - https://www.facebook.com/ adresine gidin
    2 POM’a uygun olarak email, sifre kutularini ve giris yap
    butonunu locate edin
    3 Faker class’ini kullanarak email ve sifre degerlerini
    yazdirip, giris butonuna basin
    4 Basarili giris yapilamadigini test edin

     */

    @Test
    public void test(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        //2 POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FacebookPage facebookPage=new FacebookPage();

        //3 Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.girisButton.click();

        //4 giris yapilamadigini test edin

            Assert.assertTrue(facebookPage.girisYapilamadi.isDisplayed());




    }


}
