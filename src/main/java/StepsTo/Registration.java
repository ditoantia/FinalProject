package StepsTo;

import PageObject.RegistrationObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Registration extends RegistrationObject {

    static WebDriver driver;
//    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public Registration(WebDriver driver1){
        driver = driver1;
    }
    public void email(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void password(String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }
//    public void clickregister(){
//
////        wait.until(ExpectedConditions.elementToBeClickable(regButton));
//        driver.findElement(regButton).click();
   // }

    public void wait(ExpectedCondition<WebElement> webElementExpectedCondition) {

    }
}
