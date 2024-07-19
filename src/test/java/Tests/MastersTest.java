package Tests;

import Pages.CommonPage;
import Pages.LoginPage;
import Pages.MastersPage;
import Utilities.Driver;
import Utilities.SelUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MastersTest {
    LoginPage loginPage = new LoginPage();
    MastersPage mastersPage = new MastersPage();
    CommonPage commonPage = new CommonPage();



    @BeforeClass
    public static void login(){
        Driver.getDriver().get("https://supplysync.us/login");
        LoginPage loginPage1 = new LoginPage();
        loginPage1.signIn("admin@codewise.com","codewise123");
    }
    @AfterClass
    public static void close(){
        Driver.getDriver().close();
    }

    @Test
    public void verifyMastersCreated(){
        Driver.getDriver().get("https://supplysync.us/login");
        loginPage.signIn("admin@codewise.com", "codewise123");
        commonPage.masters.click();
        mastersPage.createMasterButton.click();
        mastersPage.MasterCreate("dsad", "sad", "sad@123.com", "sadas", "sa", "1234569898");
        Assert.assertTrue(mastersPage.mastersCardShows());

    }
}
