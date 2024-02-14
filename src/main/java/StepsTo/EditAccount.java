package StepsTo;

import PageObject.LogInObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class EditAccount  extends  LogInObject{


    WebDriver driver;
    public EditAccount(WebDriver driver1){
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
    @Step("აწვება account details ღილაკს")
    public void clickAccDetails(){
        driver.findElement(accDetails).click();
    }
    @Step("აწვება save changes ღილაკს")
    public void clickSaveChanges(){
        driver.findElement(saveChanges).click();
    }
}
