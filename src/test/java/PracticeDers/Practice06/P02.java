package PracticeDers.Practice06;

import org.testng.annotations.Test;
import utilities.Driver;

public class P02 {
    /*
    * Navigate to  https://www.saucedemo.com/
    * Enter the username  as standard_user
    * Enter the password as   secret_sauce
    * Click on login button
    * Choose price low to high
    and verify that PRICE (LOW TO HIGH) is visible
     */

    @Test
    public void test01() {
        //* Navigate to  https://www.saucedemo.com
        Driver.getDriver().get("https://www.saucedemo.com");

        //* Enter the username  as standard_user
        //* Enter the password as   secret_sauce
        //* Click on login button
        //* Choose price low to high
        //and verify that PRICE (LOW TO HIGH) is visible
    }
}
