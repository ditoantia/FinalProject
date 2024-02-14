package PageObject;
import org.openqa.selenium.By;

public class RegistrationObject {
    public static By
            emailField = By.id("reg_email"),
            passwordFiled = By.id("reg_password"),
            regButton = By.xpath("//input[@name='register' and @type='submit']");
}
