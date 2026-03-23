package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By cartLink = By.id("cartur");
    private By productInCart = By.xpath("//td[contains(text(),'Samsung galaxy s6')]");

    public CartPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean isProductInCart(String productName) {
        driver.findElement(cartLink).click();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//td[contains(text(),'" + productName + "')]"))).isDisplayed();
    }
}
