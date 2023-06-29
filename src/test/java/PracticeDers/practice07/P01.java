package PracticeDers.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.WebdriveruniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    /*

    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
    // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen,
    // Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
    //Tüm yapılacakların üzerini çiz.
    //Tüm yapılacakları sil.
    //Tüm yapılacakların silindiğini doğrulayın.
    //Exploratory Testing
     */
    Actions actions;
    private String name;




    @Test
    public  void test() throws InterruptedException {


        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("https://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen,
        // , Selenyum çalış, Uyu)
        WebdriveruniversityPage webdriveruniversityPage=new WebdriveruniversityPage();
        List<String> workList=new ArrayList<>(Arrays.asList("Kayvaltiyi hazirla",
                "Bulaşıkları yıka","Bebekle ilgilen","cocukla ilgilen","Selenyum çalış","Uyu"));
         actions=new Actions(Driver.getDriver());

        for (String w:workList) {
            actions.click(webdriveruniversityPage.todo).sendKeys(w+Keys.ENTER).perform();

        }




        //Tüm yapılacakların üzerini çiz.
        webdriveruniversityPage.ustCizList.stream().forEach(t->t.click());

        //Tüm yapılacakları sil.
        webdriveruniversityPage.sil.stream().forEach(t->t.click());

        //Tüm yapılacakların silindiğini doğrulayın.
        //Exploratory Testing
        Thread.sleep(3000);
        Assert.assertTrue(webdriveruniversityPage.ustCizList.size()==0);
        Driver.quitDriver();
    }
}
