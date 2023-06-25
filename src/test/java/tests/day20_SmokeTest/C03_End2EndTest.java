package tests.day20_SmokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_End2EndTest {
    /*
    1. Tests packagenin altına class olusturun: CreateHotel
    2. Bir metod olusturun: createHotel
    3. https://www.hotelmycamp.com adresine git.
    4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
    a. Username : manager
    b. Password : Manager1!
    5. Login butonuna tıklayın.
    6. Hotel Management/Room reservation menusunden ADD ROOM RESERVATION
    butonuna tiklayin
    7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    8. Save butonuna tıklayın.
    9. “RoomReservation was inserted successfully” textinin göründüğünü test edin.
    10. OK butonuna tıklayın.

     */

    @Test
    public void E2ETest(){
        //3. https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.guvenlik1.click();
        hotelMyCampPage.guvenlik2.click();

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //a. Username : manager
        hotelMyCampPage.login.click();
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("userName"));

        //b. Password : Manager1!
        //5. Login butonuna tıklayın.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


        //6. Hotel Management/Room reservation menusunden ADD ROOM RESERVATION
        //butonuna tiklayin
        hotelMyCampPage.hotelMenagement.click();
        hotelMyCampPage.roomResarvation.click();
        hotelMyCampPage.addRooomResarvation.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
       hotelMyCampPage.idUser.sendKeys("manager");
       actions.sendKeys(Keys.TAB).sendKeys("gamze")
               .sendKeys(Keys.TAB).sendKeys("semihhh")
               .sendKeys(Keys.TAB).sendKeys("06/29/2023")
               .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("06/30/2023")
               .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("ayi")
               .sendKeys(Keys.TAB).sendKeys("elma")
               .sendKeys(Keys.TAB).sendKeys("elma")
               .sendKeys(Keys.TAB).sendKeys("555 555 5555")
               .sendKeys(Keys.TAB).sendKeys("elma@gmail.com")
               .sendKeys(Keys.TAB).sendKeys("ayva")
               .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
       Driver.getDriver().switchTo().alert().accept();





        //8. Save butonuna tıklayın.
        //9. “RoomReservation was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.

    }
}
