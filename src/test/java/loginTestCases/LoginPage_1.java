package loginTestCases;

import org.openqa.selenium.By;
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

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuList;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;
    @FindBy(css= "#login_button_container > div > form > div.error-message-container.error > h3")
    WebElement errorAuthMessage;
    protected static WebDriver chromeDriver;

    public LoginPage_1(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

    public void loginWithValidUsers(String username, String password) throws InterruptedException {
        userName.sendKeys(username);
        passwordValue.sendKeys(password);
        loginButton.click();
        menuList.click();
        logoutButton.click();

    }

    public String loginWithInvalidPassword(String username, String password) {
        userName.sendKeys(username);
        passwordValue.sendKeys(password);
        loginButton.click();
        return errorAuthMessage.getText();
    }
}

