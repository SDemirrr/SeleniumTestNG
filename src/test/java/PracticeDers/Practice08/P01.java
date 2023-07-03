package PracticeDers.Practice08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuTestPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class P01 {
    /*
      Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
      Click all the buttons and verify they are all clicked
      kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
      ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
      test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir.
     */
    HerokuTestPage herokuTestPage;
    Actions actions;

    @Test
    public void test01(){
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        herokuTestPage=new HerokuTestPage();
        actions=new Actions(Driver.getDriver());
        //Click all the buttons and verify they are all clicked

        herokuTestPage.onBlur.click();
        herokuTestPage.onClick.click();
        herokuTestPage.onClick.click();
        actions.contextClick(herokuTestPage.oncontextMenu)
                .doubleClick(herokuTestPage.onDoubleClick)
                .click(herokuTestPage.onFocus)
                .keyDown(herokuTestPage.onKeyDown,"a")
                .keyUp(herokuTestPage.onKeyUp,"a")
                .click(herokuTestPage.onKeyPress).keyDown("d")
                .moveToElement(herokuTestPage.onMouseOver)
                .dragAndDrop(herokuTestPage.onMouseLeave,herokuTestPage.onMouseOver)
                .click(herokuTestPage.onMouseDown).perform();



        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir.
    }



    @Test(dependsOnMethods = "test01")
    public void test02(){
        Assert.assertEquals(herokuTestPage.tiklandiList.size(),herokuTestPage.elementList.size());
        Driver.closeDriver();

    }
}
