package tests.day16;


import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    /*
    Testlerimizi calistirirken istedigimiz siraya gore calismasini istersek
    priority methodunu kullaniriz @Test(priority=1) seklinde siralama belirleriz

    -Priority kullanmazsak default olarak 0'dir.
     */
    @Test(priority = 1)
    public void youTubeTest(){
        driver.get("https://www.youtube.com");
    }

    @Test//burayi 0(default) kabul eder bu yuzden ilk olarak bu method calisir.
    public void bestBuyTest(){
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void amazonTest(){
        driver.get("https://www.amazon.com");
    }

    @Test(priority = -1)
    public void hepsiBuradaTest(){
        driver.get("https://hepsiburada.com");
    }
}
