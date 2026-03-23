package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By phonesLink = By.id("navbarExample");
    private By phonesCategory = By.linkText("Phones");

    public HomePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void navigateToHome() {
        driver.get("https://www.demoblaze.com/index.html");
    }

    public ProductPage goToPhones() {
        wait.until(ExpectedConditions.elementToBeClickable(phonesLink)).click();
        driver.findElement(phonesCategory).click();
        return new ProductPage();
    }
}
