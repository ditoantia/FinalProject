package Browser;
import StepsTo.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import static DataObject.LogInData.*;

public class OpenChrome {


    public static WebDriver driver = new ChromeDriver();

    @BeforeTest(description = "ბრაუზერის გახსნა")
    public void openChrome() {
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();

    }
    @AfterTest(description = "ბრაუზერის დახურვა")
    public void closeBrowser(){
        driver.quit();
    }
}



