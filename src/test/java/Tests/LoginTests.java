package Tests;

import Pages.CommonPage;
import Pages.LoginPage;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {

    @AfterClass
    public static void close(){
        Driver.getDriver().close();
    }

    @BeforeMethod
    public void directToTheURL(){
        Driver.getDriver().get("https://supplysync.us/login");
    }

    @Test
    public void SignInTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com","codewise123");
        Assert.assertTrue(loginPage.verifyLoggedIn());
    }

    @Test
    public void wrongUsernameSignIn(){
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("qwdqwd", "codewise123");
        Assert.assertTrue(loginPage.verifyFailedLogin());
    }


    @Test
    public void wrongPasswordSignIn(){
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com", "sdasda");
        Assert.assertTrue(loginPage.verifyFailedLogin());
    }


}
