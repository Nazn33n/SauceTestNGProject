//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPage {
//    @FindBy(id = "user-name")
//    WebElement userName;
//    @FindBy(id = "password")
//    WebElement passwordEnter;
//    @FindBy(id = "login-button")
//    WebElement loginButton;
//    protected static WebDriver chromeDriver;
//
//    public LoginPage(WebDriver chromeDriver)
//    {
//        this.chromeDriver = chromeDriver;
//        PageFactory.initElements(chromeDriver, this);
//    }
//    public void doLogin(String username, String password)
//    {
//        userName.sendKeys(username);
//        passwordEnter.sendKeys(password);
//        loginButton.click();
//    }
//}
