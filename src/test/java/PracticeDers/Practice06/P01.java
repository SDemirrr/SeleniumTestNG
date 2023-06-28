package PracticeDers.Practice06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {
    /*
    1->Go to URL https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    2->Fill in capitals by country
     */

    @Test
    public void test01() {
        //1->Go to URL https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("https://www.dhtmlgoodies/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //2->Fill in capitals by country
        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();
        dhtmlgoodiesPage.guvenlik1.click();
        dhtmlgoodiesPage.guvenlik2.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlgoodiesPage.oslo,dhtmlgoodiesPage.norway)
        .dragAndDrop(dhtmlgoodiesPage.stockholm,dhtmlgoodiesPage.sweden)
        .dragAndDrop(dhtmlgoodiesPage.washington,dhtmlgoodiesPage.unitedStates)
        .dragAndDrop(dhtmlgoodiesPage.copenhagen,dhtmlgoodiesPage.denmark)
        .dragAndDrop(dhtmlgoodiesPage.seoul,dhtmlgoodiesPage.southKorea)
        .dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.italiy).perform();

        Driver.closeDriver();
        /*
        =>Framework'ler buyudukce yeni class'lar yeni test method'lari yeni webelment'ler
        olusturdukca icinden cikilmaz, tekrar bakimi yapilamaz, guncellemsi cok zor
        hatta imkansiz bir hal alir
        =>Uzmanlar reusable(yeniden kullanilabilir), rahat manipule edilebilir bir framework icin
        bir design pattern(pom vs) olarak Pom(page object model)'de karar vemisler
        =>Olmazsa olmazlar
        ***1=Driver class
        ***2=Page class
        ***3Test class
        ***Utilities class

        =>Aradigimiz bir webelement'i ya da bir method'u kolaylikla bulabilmek ve guncelleyebilmek icin
        Java'dan ogrenmis oldugumuz oop concept selenium ile page object modelde birlestirilmis oluyor.
         */




    }
}
