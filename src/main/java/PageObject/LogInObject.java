package PageObject;

import org.openqa.selenium.By;

public class LogInObject {
    public static By

        usernameField = By.id("username"),
        passwordField = By.id("password"),
        submitButton = By.name("login"),
        logoutButton = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[6]/a"),
        accDetails = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[5]/a"),
        saveChanges = By.name("save_account_details");






}
