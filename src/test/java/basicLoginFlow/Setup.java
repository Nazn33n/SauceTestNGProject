//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//public class Setup {
//    protected static WebDriver chromeDriver;
//
//    @BeforeMethod
//    public void setUpBrowser() {
//        WebDriverManager.chromedriver().setup();
//        chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://www.saucedemo.com/");
//        chromeDriver.manage().window().maximize();
//        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//    @AfterMethod
//    public void quitBrowser() {
//        chromeDriver.quit();
//    }
//}
