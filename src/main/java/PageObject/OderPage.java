package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Browser.OpenChrome.driver;

public class OderPage {

//    public void testPriceFilterHighToLow() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        List<WebElement> productElements = driver.findElements(By.cssSelector("ul.products li"));
//
//        List<Product> products = new ArrayList<>();
//
//        for (WebElement productElement : productElements) {
//            WebElement priceElement = productElement.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a[1]/span/span"));
//            String priceText = priceElement.getText().replace("₹", "").replace(",", "").trim();
//            double price = Double.parseDouble(priceText);
//
//            products.add(new Product(price, productElement));
//        }
//
//        double expectedPrice = 500.0;
//
//        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
//
//        Assert.assertEquals(products.stream().map(Product::getPrice).collect(Collectors.toList()),
//                products.stream().map(Product::getPrice).sorted(Collections.reverseOrder()).collect(Collectors.toList()),
//                "Products are not sorted in high to low order");
//
//        Assert.assertEquals(products.get(0).getPrice(), expectedPrice, "The first product's price is not equal to the expected price");
//        System.out.println("expected price is: " + expectedPrice);
////        System.out.println("actual price is: " + );
//    }

    class Product {
        private double price;
        private WebElement element;

        public Product(double price, WebElement element) {
            this.price = price;
            this.element = element;
        }

        public double getPrice() {
            return price;
        }

        public WebElement getElement() {
            return element;
        }
    }
//
//







    public void chooseAllSortOptions() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement dropdownContainer = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form"));
        dropdownContainer.click();

        List<WebElement> sortOptions = dropdownContainer.findElements(By.xpath("//select[@name='orderby']/option"));

        for (int i = 0; i < sortOptions.size(); i++) {
            dropdownContainer = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/select"));
            sortOptions = dropdownContainer.findElements(By.xpath("//select[@name='orderby']/option"));
            WebElement sortOption = sortOptions.get(i);
            wait.until(ExpectedConditions.elementToBeClickable(sortOption));
            sortOption.click();
        }


    }
    public static By

            downloadsButton = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[3]/a"),
            goToShopButton = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/a"),
            dropdownButton = By.xpath("/html/body/div[1]/div[2]/div/div/form"),
            lastOption = By.xpath("//select[@name='orderby']/option[last()]"),
            addToCartButton = By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/a[2]"),
            cartButton  = By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a"),
            removeItemsButton =  By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[1]/td[1]/a"),
            sliderHandle = By.cssSelector(".ui-slider-handle"),
            filterButton = By.cssSelector("button.button");


}
