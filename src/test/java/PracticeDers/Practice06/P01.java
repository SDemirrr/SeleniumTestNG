package PracticeDers.Practice06;

import org.testng.annotations.Test;
import pages.GoodiesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P01 {
    /*
    1->Got to URL https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    2->Fill in capitals by country
     */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("goodiesUrl"));
        GoodiesPage goodiesPage=new GoodiesPage();
        goodiesPage.guvenlik1.click();
        goodiesPage.guvenlik2.click();

    }
}
