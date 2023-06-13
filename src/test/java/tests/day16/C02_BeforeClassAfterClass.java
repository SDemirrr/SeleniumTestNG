package tests.day16;


import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }

    @Test
    public void test2(){
        driver.get("https://bestbuy.com");
    }

    @Test
    public void test3(){
        driver.get("https://techproeducation.com");
    }
}
