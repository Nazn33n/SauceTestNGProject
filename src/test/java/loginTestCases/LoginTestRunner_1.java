package loginTestCases;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestRunner_1 extends Setup_1 {
    @Test
    public void loginToWebsite_1() throws IOException, ParseException, InterruptedException {

        LoginPage_1 loginPage_1 = new LoginPage_1(chromeDriver);
        Utils utils = new Utils();
        utils.getUsers(0);
        {
             chromeDriver.get("https://www.saucedemo.com/");
             loginPage_1.doLogin_1(utils.getEmail(), utils.getPassword());
             Thread.sleep(3000);

        }
    }
}
