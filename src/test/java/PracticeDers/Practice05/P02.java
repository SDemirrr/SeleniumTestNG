package PracticeDers.Practice05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {
    /*
    1-https://webdriveruniversity.com/Popup-Alerts/index.html adresine gidin
    2-Javascript alert'in CLICK ME! secenegine tiklayin
    3-Acilir metni alin
    4-Mesajin "I am an alert box!" oldugunu dogrulayin
    5-Acilir pencereyi kontrol edin
     */


    @Test
    public void test(){
        //1-https://webdriveruniversity.com/Popup-Alerts/index.html adresine gidin
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

        //2-Javascript alert'in CLICK ME! secenegine tiklayin
        driver.findElement(By.xpath("//p")).click();

        //3-Acilir metni alin
        String actualText=driver.switchTo().alert().getText();

        //4-Mesajin "I am an alert box!" oldugunu dogrulayin
        String expectedText="I am an alert box!";
        Assert.assertEquals(actualText,expectedText);

        //5-Acilir pencereyi kontrol edin
        driver.switchTo().alert().accept();


    }
}
