package Browser;
import StepsTo.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static Browser.OpenChrome.driver;
import static DataObject.LogInData.*;
public class OpenChromeWithoutLogin {
    public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

