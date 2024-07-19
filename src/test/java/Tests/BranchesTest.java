package Tests;


import Pages.BranchesPage;
import Pages.LoginPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BranchesTest {
    WebDriver driver;
    BranchesPage branches = new BranchesPage();
    Actions actions = new Actions(driver);

    @BeforeClass
    public void setup(){
        driver = Driver.getDriver();
    }

    @AfterClass
    public static void close(){
        Driver.getDriver().close();
    }

    @Test
    public void createBrunch ()  {

        Driver.getDriver().get("https://supplysync.us/login");
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com","codewise123");

        branches.branchesBtn.click();
        branches.createBranch.click();
        branches.branchName.sendKeys("THE OLD ONE");
        branches.email.sendKeys("bugbusters@gmail.com");
        branches.address.sendKeys("2250 W Devon Ave");
        branches.phoneNumber.click();
        branches.phoneNumber.sendKeys("1111111111");
        branches.city.sendKeys("Chicago");
        branches.region.click();
        branches.illinois.click();
        branches.companies.click();
        branches.nameOfCompany.click();
        branches.createBtn.click();

        Assert.assertEquals("THE OLD ONE", branches.checkBranchName.getText());

    }


    @Test
    public void testsEdit(){
        Driver.getDriver().get("https://supplysync.us/login");
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com","codewise123");

        branches.branchesBtn.click();
        branches.funBtn.click();
        branches.editBtn.click();
        actions.keyDown(branches.email, Keys.COMMAND).sendKeys("a").
                keyUp(Keys.COMMAND).keyDown(branches.email,Keys.BACK_SPACE ).
                keyUp(Keys.BACK_SPACE).build().perform();
        branches.email.sendKeys("aigul111@gmail.com");
        branches.city.sendKeys("Chicago");
        branches.saveBtn.click();

        Assert.assertEquals("aigul111@gmail.com", branches.checkEmail.getText());

    }

}
