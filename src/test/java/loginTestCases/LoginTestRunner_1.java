package loginTestCases;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestRunner_1 extends Setup_1 {
    LoginPage_1 loginPage1;
    Utils utils;
    @Test(priority = 1)
    public void loginWithValidUsers_1() throws IOException, ParseException, InterruptedException {

          loginPage1 = new LoginPage_1(chromeDriver);
          utils = new Utils();
          utils.getUsers(0);
        {
             chromeDriver.get("https://www.saucedemo.com/");
             loginPage1.loginWithValidUsers(utils.getEmail(), utils.getPassword());
             Thread.sleep(2000);

        }
    }
    @Test(priority = 2)
    public void loginWithInvalidPassword() throws IOException, ParseException, InterruptedException {

        loginPage1 = new LoginPage_1(chromeDriver);
        utils = new Utils();
        utils.getUsers(1);
        {
           String errorMessage =  loginPage1.loginWithInvalidPassword(utils.getEmail(), utils.getPassword());
           Assert.assertTrue(errorMessage.contains("service"));
           System.out.println("The error message is:" + errorMessage);

        }
    }
}
