package tests.day23_DataProvider;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {

    /*
    https://www.bluerentalcars.com/ adresine gidin
    login butonuna bas
    Data provider ile 3 farkkli user email ve 3 farkli passwor girin
    login butonuna bas
    Degerleri girildiginde sayfaya basarili sekilde gilemedigini test et
     */
    @DataProvider
    public static Object[][] kullaniciBilgileri() {
        return new Object[][]{{"smh@gmail.com","12345"},{"dmr@gmail.com","45678"}
                ,{"nvsn@gmail.com","67889"}};
    }

    @Test(dataProvider = "kullaniciBilgileri")
    public void test01(String userEmail,String password){
        //https://www.bluerentalcars.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //login butonuna bas
        BrcPage brcPage=new BrcPage();
        brcPage.loginButton1.click();

        //Data provider ile 3 farkli user email ve 3 farkli password girin
        //login butonuna bas
        Actions actions=new Actions(Driver.getDriver());
        brcPage.email.sendKeys(userEmail);
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.ENTER).perform();


        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.loginButton1.isDisplayed());
        Driver.quitDriver();

    }
}
