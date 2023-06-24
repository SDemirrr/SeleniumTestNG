package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test(){
        //Amazon ve facebook sayfasina gidiniz
        String urlAmazon=ConfigReader.getProperty("amznUrl");
        String urlFace=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlAmazon);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();

    }
}
