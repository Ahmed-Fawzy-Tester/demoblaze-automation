package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        String hubUrl = "http://selenium-hub:4444/wd/hub"; // IMPORTANT

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        driver = new RemoteWebDriver(new URL(hubUrl), options);

        driver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}