import Browser.OpenChrome;
import StepsTo.LogIn;
import StepsTo.EditAccount;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.LogInData.*;
import Browser.OpenChrome;
import Browser.OpenChromeWithoutLogin;
import StepsTo.Registration;
import StepsTo.selectOption;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static Browser.OpenChromeWithoutLogin.driver;
import static DataObject.RegistrationData.regEmail;
import static DataObject.RegistrationData.regPassword;
import static PageObject.RegistrationObject.regButton;
import java.time.Duration;

import java.time.Duration;

import DataObject.RegistrationData.*;
import Browser.OpenChromeWithoutLogin;
import StepsTo.LogIn;
import StepsTo.ResetPassword;
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
import Browser.OpenChrome;
import PageObject.OderPage;
import StepsTo.LogIn;
import StepsTo.EditAccount;
import StepsTo.selectOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.LogInData.*;
import PageObject.OderPage.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static PageObject.OderPage.*;
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
import Browser.OpenChromeWithoutLogin;
import StepsTo.Registration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static Browser.OpenChromeWithoutLogin.driver;
import static DataObject.RegistrationData.regEmail;
import static DataObject.RegistrationData.regPassword;
import static PageObject.RegistrationObject.regButton;
import java.time.Duration;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import DataObject.RegistrationData.*;

public class TestSite extends OpenChrome {

    @Test(priority = 1)
    @Description("ამ ტესტში მომხმარებელი ლოგინდება სწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)
    public void Login(){
        LogIn step1 = new LogIn(driver);
        step1.fillUsername(correctUsername);
        step1.fillPassword(correctPassword);
        step1.clickSubmit();
        String
                expectedResult = "Hello dito18 (not dito18? Sign out)",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();

    }

    @Test(priority = 2)
    @Description("ეს ტესტი ამოწმებს მუშაობს თუ არა პროდუქტის დამატების ღილაკი ")
    @Severity(SeverityLevel.CRITICAL)
    public void addToCart() throws InterruptedException {
        selectOption step1 = new selectOption(driver);
        step1.clickDownloadButton();
        step1.clickShopButton();
        step1.addToCart();
        Thread.sleep(1000);
        WebElement cartNumb = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a/span[1]"));
        String
                expectedResult = "2 Items",
                actualResult = cartNumb.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualResult.contains(expectedResult));
        softAssert.assertAll();

        System.out.println("expected: " + expectedResult);
        System.out.println("actual: " + actualResult);

        //selectOption step1 = new selectOption(driver);



    }
    @Test(priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("ეს ტესტი ამოწმებს მუშაობს თუ არა პროდუქტის წაშლის ღილაკი ")
    public void removeItem() throws InterruptedException {
        selectOption step1 = new selectOption(driver);
        step1.editCart();
        step1.removeItems();
        Thread.sleep(1000);
        String
                expectedResult1 = "Your basket is currently empty.",
                actualResult1 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/p[1]")).getText();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(actualResult1, expectedResult1);
        System.out.println("actual result is " + actualResult1);
        System.out.println("expected result is " + expectedResult1);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();

    }
    @Test(priority = 4)
    @Severity(SeverityLevel.MINOR)
    @Description("ეს ტესტი ამოწმებს არის თუ არა პროდუქტების გაფიტვრის ჩამონათვალის ყველა წევრი მონიშვნადი  ")
    public void selectAllOptions() throws InterruptedException {
        selectOption step1 = new selectOption(driver);
        step1.clickDownloadButton();
        step1.clickShopButton();
        step1.clickFilterContainer();
        step1.chooseAllSortOptions();
        step1.clickHighToLow();
//        step1.testPriceFilterHighToLow();
        String
                expectedResult1 = "₹500.00",
                actualResult1 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]/span/span")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult1, expectedResult1);
        System.out.println("actual result is " + actualResult1);
        System.out.println("expected result is " + expectedResult1);
        Thread.sleep(2000);

        ////ul[@class='products']/li[@class='post-160']/a/h3[text()='Selenium Ruby']


        Thread.sleep(5000);
        String
                expectedResult = "Sort by price: high to low",
                actualResult = driver.findElement(By.xpath("//select[@name='orderby']/option[last()]")).getText();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(actualResult, expectedResult);
        System.out.println("actual result is " + actualResult);
        System.out.println("expected result is " + expectedResult);

    }
    @Test(priority = 5)
    @Description("ეს ტესტი ამოწმებს პროდუქტების დალაგება ფასების კლების მიხევით მუშაობს თუ არა")
    @Severity(SeverityLevel.MINOR)
    public void checkHighToLow() throws InterruptedException {
        selectOption step1 = new selectOption(driver);
        step1.clickHighToLow();
//        step1.testPriceFilterHighToLow();
        String
                expectedResult1 = "₹500.00",
                actualResult1 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]/span/span")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult1, expectedResult1);
        System.out.println("actual result is " + actualResult1);
        System.out.println("expected result is " + expectedResult1);
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    @Description("ეს ტესტი ამოწმებს მუშაობს თუ არა პროდუქტების გაფილტვრა ფასების მიხედვით")
    @Severity(SeverityLevel.MINOR)
    public void checkPriceFilter() throws InterruptedException {
        selectOption step1 = new selectOption(driver);


        movePriceSlider(300);




        step1.filteButtonClick();
        Thread.sleep(2000);
///html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]/h3
        String
                expectedResult = "Selenium Ruby",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]/h3")).getText();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(actualResult, expectedResult);
        System.out.println("actual result is " + actualResult);
        System.out.println("expected result is " + expectedResult);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();

    }



    private void movePriceSlider(int targetPrice) {
        double percentage = ((double) (targetPrice - 150) / (500 - 150)) * 100;

        WebElement sliderHandle = driver.findElement(By.cssSelector(".ui-slider-handle"));

        String script = "arguments[0].setAttribute('style', 'left: " + percentage + "%')";
        ((ChromeDriver) driver).executeScript(script, sliderHandle);



    }
    @Test (priority = 7)
    @Description("ეს ტესტი ამოწმებს მუშაობს თუ არა პროდუქტების გაფილტვრა ფასების მიხედვით")
    @Severity(SeverityLevel.MINOR)
    public void leaveFieldsEmpty(){

        EditAccount step2 = new EditAccount(driver);
        SoftAssert softAssert = new SoftAssert();

        step2.clickAccDetails();
        step2.clickSaveChanges();
        String
                expectedResult3 = "First Name is a required field.",
                actualResult3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li[1]")).getText();

        softAssert.assertEquals(actualResult3, expectedResult3);
        System.out.println("actual result is " + actualResult3);
        System.out.println("expected result is " + expectedResult3);




    }
    @Test(priority = 8)
    @Description("ეს ტესტი ამოწმებს ,ცვლილებეის სავალდებულო ველებში ინფორმაციის შეტანის გარეშე, ანგარიშის დეტალების ცვლილებების დამახსოვრების ღილაკზე დაჭერისას გენერირდება თუ არა შესაბამისი მესიჯი ")
    @Severity(SeverityLevel.NORMAL)
    public void SignOut(){
        LogIn step1 = new LogIn(driver);
        step1.clickLogout();
        String
                expectedResult2 = "Remember me",
                actualResult2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/label")).getText();
        Assert.assertEquals(actualResult2,expectedResult2);
        System.out.println("actual result is " + actualResult2);
        System.out.println("expected result is " + expectedResult2);
    }



}
