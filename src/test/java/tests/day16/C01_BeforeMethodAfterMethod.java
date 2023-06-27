package tests.day16;


import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void amazonTest(){
        driver.get("https://www.amazon.com");
    }

    @Test(groups = "grup1")
    public void bestBuyTest(){
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techProEducationTest(){
        driver.get("https://www.techproeducation.com");
    }
}
