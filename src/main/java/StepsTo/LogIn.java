package StepsTo;
import DataObject.LogInData.*;
import PageObject.LogInObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.correctUsername;

public class LogIn extends LogInObject {
    WebDriver driver;
    public LogIn(WebDriver driver1){
        driver = driver1;
    }

    @Step("შეჰყავს სწორი ემაილი username ველში")
    public void fillUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }
    @Step("შეჰყავს სწორი პაროლის password ველში")
    public void fillPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    @Step("აწვება login ღილაკს")
    public void clickSubmit(){

        driver.findElement(submitButton).click();
    }
    @Step("აწვება logout ღილაკს")
    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }


}
