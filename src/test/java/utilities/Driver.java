package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private Driver(){

    }
    static WebDriver driver;
    /*
    Testlerimizi calistirdigimizda her seferinde yeni driver olusurdugu icin
    her test methodu icin yeni bir pencere(driver) aciyor.Eger driver'a bir deger
    atanmamissa yani driver==null ise bir kere driver'i calistir diyerek bir kere if icini
    calistiracak ve drive rartik b defa calistigi icin ve deger atandigi icin null oolmayacak
    direkt return edecek.Diger testlerimiz ayni pencere(driver) uzerinde calisacak.
     */

    public static WebDriver getDriver(){
        if (driver==null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) { //driver'a deger atanmissa kapat
            driver.close();
        driver = null;//kapandiktan sonraki acmalari garanti altina almak icin driver'i null yaptik
    }


    }
    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
            driver=null;
        }

    }

}
