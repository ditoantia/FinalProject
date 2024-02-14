import Browser.OpenChromeWithoutLogin;
import StepsTo.LogIn;
import StepsTo.ResetPassword;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import DataObject.LogInData.*;
import static Browser.OpenChromeWithoutLogin.driver;
import Browser.OpenChromeWithoutLogin;
import StepsTo.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import DataObject.LogInData.*;

import static Browser.OpenChromeWithoutLogin.driver;
import static DataObject.LogInData.*;


import static DataObject.LogInData.*;
public class ChangePassword extends OpenChromeWithoutLogin {
    @Test(priority = 1)
    @Description("ამ ტესტში მომხმარებელი ლოგინდება არასწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)
    public void InputInvallidCredentials(){

        LogIn step1 = new LogIn(driver);
        step1.fillUsername(incorUsername);
        step1.fillPassword(incorPassword);
        step1.clickSubmit();
        String
                expectedResult = "Error: The username ditodito is not registered on this site. If you are unsure of your username, try your email address instead.",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("expeected: " + expectedResult);
        System.out.println("actual: " + actualResult);





    }

    @Test(priority = 2)
    @Description("ამ ტესტში მოწმდება , შესაბამისი მონაცემის შეყვანის შემთხვევაში, პაროლის შეცვლის ღილაკზე დაწოლისას გენერირდება თუ არა შესაბამისი მესიჯი")
    @Severity(SeverityLevel.NORMAL)
    public void resetPassword() {

        ResetPassword step1 = new ResetPassword(driver);
        step1.clickResetPass();
        step1.fillEmail(correctUsername);
        step1.clickResetButton();
        String
                expectedResult = "Password reset email has been sent.",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("expeected: " + expectedResult);
        System.out.println("actual: " + actualResult);
    }
    @AfterTest
    public void closeChrome(){

        driver.close();
    }
}
