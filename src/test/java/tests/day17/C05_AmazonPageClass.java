package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonPageClass {
    @Test
    public void test01(){
        AmazonPage amazonPage=new AmazonPage();
        //amazon sayfasina gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //Nutella icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //sonuclarin nutella icerdigini test edelim
        String expectedKelime="nutella";
        String actualKelime=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();
    }
}
