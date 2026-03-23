package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;
import utils.DriverManager;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By samsungGalaxyS6 = By.linkText("Samsung galaxy s6");
    private By addToCartBtn = By.xpath("//a[@class='btn btn-success btn-lg']");

    public ProductPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void addSamsungToCart() {
        driver.findElement(samsungGalaxyS6).click();
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();

        // CRITICAL: Handle the "Product added" alert (this fixes your error!)
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
    }

    public CartPage goToCart() {
        return new CartPage();
    }
}
