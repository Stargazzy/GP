package Pages;

import Utilities.Driver;
import Utilities.SelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MastersPage {
    WebDriver driver;


    public MastersPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//*[text()= \"Masters\"]")
        public WebElement mastersButton;

    @FindBy(xpath = "//button[text()='Create Master']")
    public WebElement createMasterButton;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    public WebElement lastNameInput;

    @FindBy (xpath = "//input[@name=\"email\"]")
    public WebElement emailInput;

    @FindBy (xpath = "//input[@name=\"password\"]")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@name=\"location\"]")
    public WebElement placeOfResidenceInput;

    @FindBy (xpath = "//input[@class=\"sc-cvZCdy ijDIKo\"]")
    public WebElement phoneNumberInput;

    @FindBy (xpath = "//div[@id=\"mui-component-select-branch_id\"]")
    public WebElement branchSelect;

    @FindBy (xpath = "//button[text()='Create']")
    public WebElement createButton;

    @FindBy (xpath = "//h3[text()='John']")
    public WebElement mastersCard;

    @FindBy (xpath = "(//li[text()=\"BugBusters\"])[1]")
    public WebElement selectBug;


    public void MasterCreate (String name, String lastName, String email, String password, String placeOfResidence, String phoneNumber){
        nameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        placeOfResidenceInput.sendKeys(placeOfResidence);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        branchSelect.click();
        selectBug.click();
        createButton.click();
        SelUtils.waitForSeconds(4);

    }


    public boolean mastersCardShows (){
        mastersButton.click();
        return mastersCard.isDisplayed();
    }
}
