package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
    WebDriver driver;
    public CommonPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//p[text()=\"Administrator\"]")
    public WebElement accIdentifier;

    @FindBy (xpath = "//img[@alt=\"Logout\"]")
    public WebElement logOutButton;

    @FindBy (xpath = "//button[text()=\"Exit\"]")
    public WebElement exitButton;

    @FindBy (xpath = "//button[text()=\"Cancer\"]")
    public WebElement cancelButton;

    @FindBy (xpath = "//span[text()=\"Companies\"]")
    WebElement buttonCompanies;

    @FindBy (xpath = "//span[text()=\"Branches\"]")
    public WebElement buttonBranches;

    @FindBy (xpath = "//span[text()=\"Masters\"]")
    public WebElement buttonMasters;

    @FindBy (xpath = "//span[text()=\"Tariffs\"]")
    public WebElement buttonTariffs;

    @FindBy (xpath = "//span[text()=\"Orders\"]")
    public WebElement buttonOrders;

    @FindBy (xpath = "//span[text()=\"Regions\"]")
    public WebElement buttonRegions;

    @FindBy (xpath = "//span[text()='Masters']")
    public WebElement masters;

    public void logout(){
        accIdentifier.click();
        logOutButton.click();
        exitButton.click();
    }
}
