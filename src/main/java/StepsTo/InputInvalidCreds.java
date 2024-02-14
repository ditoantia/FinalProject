package StepsTo;
import PageObject.LogInObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class InputInvalidCreds extends LogInObject {
    WebDriver driver;
    public InputInvalidCreds(WebDriver driver1){
        driver = driver1;
    }

    @Step("შეჰყავს არასწორი მომხმარებლის სახელი uusername ველში")
    public void fillUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }
    @Step("შეჰყავს არასწორი მომხმარებლის პაროლი password ველში")
    public void fillPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    @Step("აწვება login ღილაკს")
    public void clickSubmit(){

        driver.findElement(submitButton).click();
    }

}
