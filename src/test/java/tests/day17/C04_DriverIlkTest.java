package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {

    @Test
    public void tets01(){
        /*
        Test Base class'ina extend ederek kullandigimiz driver yerine artik Driver classindan
        kullanacagimiz getDriver() static method'unu kullaniriz
         */
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();

    }
}
