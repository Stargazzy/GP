package Tests;

import Pages.CommonPage;
import Pages.LoginPage;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Statement;

public class CommonTests {


    @AfterClass
    public static void close(){
        Driver.getDriver().close();
    }

    @BeforeMethod
    public void directToTheURL(){
        Driver.getDriver().get("https://supplysync.us/login");
    }

    @Test
    public void logoutTest(){
        CommonPage commonPage = new CommonPage();
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com","codewise123");
        commonPage.logout();
        Assert.assertTrue(loginPage.usernameInput.isDisplayed());
    }
}
