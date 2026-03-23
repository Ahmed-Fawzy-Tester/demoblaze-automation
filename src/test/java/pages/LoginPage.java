package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginButton = By.id("login2");
    private By username = By.id("loginusername");
    private By password = By.id("loginpassword");
    private By loginSubmit = By.xpath("//button[text()='Log in']");

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void enterUsername(String user) {
        WaitUtils.waitForVisibility(driver, username).sendKeys("mido123");
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys("123321");
    }

    public void clickSubmit() {
        driver.findElement(loginSubmit).click();
    }

    // 🔥 Clean business method
    public void login(String user, String pass) {
        clickLogin();
        enterUsername(user);
        enterPassword(pass);
        clickSubmit();
    }
}