package StepsTo;

import PageObject.ResetPassObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ResetPassword extends ResetPassObject {

    WebDriver driver;
    public ResetPassword(WebDriver driver1){
        driver = driver1;
    }
    @Step("აწვება forgot password ღილაკს")
    public void clickResetPass(){
        driver.findElement(resetPassButton).click();
    }

    @Step("შეჰყავს სწორი პაროლის password ველში")
    public void fillEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    @Step("აწვება reset password ღილაკს")
    public void clickResetButton(){
        driver.findElement(submitButton).click();
    }
}
