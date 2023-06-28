package tests.day22_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;

public class C02_RaporluTest {

    @Test
    public void test01() {
        //https://the--internet.herokuapp.com/windows adrsıne gıdın
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        //click here butonuna basın
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ArrayList<String> handlesList=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(handlesList.get(1));
        System.out.println(Driver.getDriver().getTitle());

        //açilan yenı tabın titlein New Window oldugunu test edin
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        //

    }

    @Test
    public void test02() {
        //https://the--internet.herokuapp.com/windows adrsıne gıdın
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        //click here butonuna basın
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
       /*
        ArrayList<String> handlesList=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(handlesList.get(1));
        System.out.println(Driver.getDriver().getTitle());

        */

        //açilan yenı tabın titlein New Window oldugunu test edin
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.quitDriver();


    }
}
