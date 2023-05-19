package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_1 {
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passwordValue;

    @FindBy(id = "login-button")
    WebElement loginButton;
    protected static WebDriver chromeDriver;
    public LoginPage_1(WebDriver chromeDriver)
    {
         this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }
    public void doLogin_1(String username, String password)
    {
        userName.sendKeys(username);
        passwordValue.sendKeys(password);
        loginButton.click();
    }
}

