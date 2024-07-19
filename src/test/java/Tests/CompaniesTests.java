package Tests;

import Pages.CompaniesPage;
import Pages.LoginPage;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompaniesTests {

    @AfterClass
    public static void close(){
        Driver.getDriver().close();
    }
    @BeforeClass
    public static void directToTheURL(){
        Driver.getDriver().get("https://supplysync.us/login");
    }

    @BeforeClass
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("admin@codewise.com","codewise123");
    }

    @Test
    public void testAddCompany(){
        CompaniesPage  companiesPage= new CompaniesPage();
        companiesPage.createACompany("Nurmukhammad","dasd@aidas.com","123213s dasd","1233455455");
    }

    @Test
    public void testEditFunction(){
        String mainPageLink = Driver.getDriver().getWindowHandle();
        CompaniesPage companiesPage = new CompaniesPage();
        companiesPage.editCompany("Stargaz","dasd@aidas.com","123213s dasd","1233455455");
        Assert.assertFalse(mainPageLink.equals(mainPageLink.equals(companiesPage.editPageURL)));
    }

}
