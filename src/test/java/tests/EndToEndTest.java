package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import utils.DriverManager;

public class EndToEndTest {

    @Test
    public void userFlowTest() {
        HomePage home = new HomePage();
        home.navigateToHome();
        home.goToPhones();

        ProductPage product = new ProductPage();
        product.addSamsungToCart();  // Handles alert automatically

        CartPage cart = product.goToCart();
        assert cart.isProductInCart("Samsung galaxy s6") : "Product not found in cart!";
        System.out.println("✅ E2E test passed: Product added and visible in cart");
    }

    @BeforeMethod
    public void setup() {
        // DriverManager handles setup
    }

    @AfterMethod
    public void teardown() {
        DriverManager.quitDriver();
    }
}
