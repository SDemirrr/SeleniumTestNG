package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_DependsOnMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        driver.get("https://facebook.com");
    }
    @Test(dependsOnMethods = "test2")
    public void test3(){
        driver.get("https://bestbuy.com");
    }
    @Test(priority = -1)
    public void test4(){
        driver.get("https://youtube.com");
    }
}
