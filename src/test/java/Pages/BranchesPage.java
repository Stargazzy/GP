package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.annotation.Native;

public class BranchesPage {
    WebDriver driver;

    public BranchesPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@placeholder=\"Enter login\"]")
    public WebElement loginBtn;


    @FindBy(xpath = "//input[@placeholder=\"Enter password\"]")
    public WebElement passwordBtn;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement singInBtn;

    @FindBy(xpath = "//span[text()= 'Branches']")
    public WebElement branchesBtn;

    @FindBy(xpath = "//button[text() = 'Create Branch']")
    public WebElement createBranch;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement branchName;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@name=\"address\"]")
    public WebElement address;

    @FindBy(xpath = "//input[@name=\"phoneNumber\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name=\"city\"]")
    public WebElement city;

    @FindBy(xpath = "//div[@id=\"mui-component-select-regionId\"]")
    public WebElement region;

    @FindBy(xpath = "//li[@data-value=\"13\"]")
    public WebElement illinois;

    @FindBy(xpath = "//div[@id=\"mui-component-select-companyId\"]")
    public WebElement companies;

    @FindBy(xpath = "//li[@data-value=\"5\"]")
    public WebElement nameOfCompany;

    @FindBy(xpath = "//button[@form=\"add-branch-form\"]")
    public WebElement createBtn;

    @FindBy(xpath = "(//button[@type=\"button\"])[3]")
    public WebElement funBtn;

    @FindBy(xpath = "(//li[text()='Edit'])[1]")
    public WebElement editBtn;

    @FindBy(xpath = "//button[text() = 'Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[@id=\"mui-component-select-company\"]")
    public WebElement allCompanies;

    @FindBy(xpath = "//li[text() = 'Bank of America']")
    public WebElement bankOfAmericaBtn;

    @FindBy(xpath = "(//li[text() = 'Block'])[1]")
    public WebElement blockBtn;

    @FindBy(xpath = "//button[@aria-label=\"Account settings\"]")
    public WebElement administratorBtn;

    @FindBy(xpath = "//img[@src=\"/static/media/Logout.9bd9ef5c.svg\"]")
    public WebElement logOut;

    @FindBy(xpath = "//button[text() = 'Exit' ]")
    public WebElement exitBtn;



    @FindBy(xpath = " //h3[text() = 'THE OLD ONE']")
    public WebElement checkBranchName;

    @FindBy(xpath = "(//div[@class=\"sc-kjOQFR fHgxRQ\"])[1]")
    public WebElement checkEmail;





}
