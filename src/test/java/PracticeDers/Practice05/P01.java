package PracticeDers.Practice05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.List;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    /*
    1-go to URL : https://www.techlistic.com/p/selenium-practice-form.html
    2-fill the firstname
    3-fill the lastname
    4-check the gender
    5-check the experience
    6-fill the date
    7-choose your profession ->Automomation Tester
    8-choose your tool ->Selenium Webdriver
    9-choose your command ->Antartica
    10-choose your command ->Browser Commands
    11-click submit button
     */

    @Test
    public void test(){

        //1-go to URL : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //2-fill the firstname
        driver.findElement(By.xpath("//*[@*='firstname']")).sendKeys("semih");

        //3-fill the lastname
        driver.findElement(By.xpath("//*[@*='lastname']")).sendKeys("demir");

        //4-check the gender
        //5-check the experience
        //6-fill the date
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).sendKeys(Keys.TAB)
                .sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT).sendKeys(Keys.TAB)
                .sendKeys("11-11-23").perform();

        //7-choose your profession ->Automomation Tester
        driver.findElement(By.xpath("//*[@*='profession-1']")).click();

        //8-choose your tool ->Selenium Webdriver
        driver.findElement(By.xpath("//*[@*='tool-2']")).click();

        //9-choose your command ->Antartica
        WebElement ddm= driver.findElement(By.xpath("//*[@*='continents']"));
        Select options=new Select(ddm);
        options.selectByVisibleText("Antartica");


        //10-choose your command ->Browser Commands
        driver.findElement(By.xpath("//*[@*='selenium_commands']/option[1]")).click();

        //11-click submit button
        driver.findElement(By.xpath("//*[@*='submit']")).click();

    }
}
