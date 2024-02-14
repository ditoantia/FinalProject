package StepsTo;

import PageObject.OderPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.correctUsername;
public class selectOption extends OderPage {
    WebDriver driver;
    public selectOption (WebDriver driver1){
        driver = driver1;
    }
    @Step("აწვება Download ღილაკს")
    public void clickDownloadButton(){
        driver.findElement(downloadsButton).click();
    }
    @Step("აწვება goShop ღილაკს")
    public void clickShopButton(){
        driver.findElement(goToShopButton).click();
    }
    @Step("აწვება Default Filter ფილტრს")
    public void clickFilterContainer(){
        driver.findElement(dropdownButton).click();

    }
    @Step("აწვება HighToLow ფილტრს")
    public void clickHighToLow(){
        driver.findElement(lastOption).click();
    }
    @Step("აწვება addToCart ღილაკს")
    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }
    @Step("აწვება კალათის ღილაკს")
    public  void editCart(){
        driver.findElement(cartButton).click();
    }
    @Step("აწვება removeItems ღილაკს")
    public void removeItems(){
        driver.findElement(removeItemsButton).click();
    }

    @Step("აწვება filteButton ღილაკს")
    public void filteButtonClick(){
        driver.findElement(filterButton).click();
    }

}
