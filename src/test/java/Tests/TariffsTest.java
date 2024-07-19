package Tests;

import Pages.CreateTariff;
import Pages.LoginPage;
import Utilities.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TariffsTest {
    WebDriver driver;

    public void setUp() {
        driver = Driver.getDriver();
        driver.get("https://supplysync.us/login");
    }

    @Test
    public void testSignInToTariff() {

        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com","codewise123");

        CreateTariff createTariff = new CreateTariff();
        createTariff.createTariff(
                "Hawaii ",
                "Express Delivery",
                "24 hours",
                "Out of city",
                "50",
                "Alabama",
                "123,456",
                "No additional info",
                true
        );
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
