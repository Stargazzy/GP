package Pages;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {

    WebDriver driver;
    public String editPageURL;

    public CompaniesPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//*[contains(text(), \"Create company\")]")
    public WebElement createCompButton;

    @FindBy (xpath = "//p[text()=\"Click on the icon to download or drag\"]/..")
    public WebElement addPictureButton;

    @FindBy (xpath = "//span[contains(text(),\"Company Name *\")]/../../..//input")
    public WebElement companyNameInput;

    @FindBy (xpath = "//span[contains(text(),\"Email *\")]/../../..//input")
    public WebElement emailInput;

    @FindBy (xpath = "//span[contains(text(),\"Address *\")]/../../..//input")
    public WebElement addressInput;

    @FindBy (xpath = "//input[@placeholder=\"+1 ___ ___ ____ *\"]")
    public WebElement phoneInput;

    @FindBy (xpath = "//button[text()=\"Create\"]")
    public WebElement createButton;

    @FindBy (xpath = "//button[text()=\"Cancel\"]")
    public WebElement cancelButton;




    @FindBy (xpath = "(//button[@aria-label=\"more\"])[1]")
    public WebElement preEditButton;

    @FindBy (xpath = "(//li[@class=\"sc-jJoQJp ieRzNh MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root sc-jOxtWs iooOuN sc-hcupDf kXRKGO\"])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//span[text()=\"Company Name *\"]/../../../input")
    public WebElement editCompNameInput;

    @FindBy (xpath = "//span[text()=\"Email *\"]/../../../input")
    public WebElement editEmailInput;

    @FindBy(xpath = "//span[text()=\"Address *\"]/../../../input")
    public WebElement editAddressInput;

    @FindBy(xpath = "//input[@class=\"sc-cvZCdy ijDIKo\"]")
    public WebElement editPhoneInput;

    @FindBy (xpath = "//button[text()=\"Save\"]")
    public WebElement editSaveButton;

    @FindBy(xpath = "//button[text()=\"Cancel\"]")
    public WebElement editCancelButton;





    @FindBy (xpath = "(//div[@class=\"sc-iukxot jQdRLf\"])[1]")
    public WebElement existingCompanyName;

    @FindBy (xpath = "(//div[@class=\"sc-knKHOI jEerXm\"])[1]")
    public WebElement existingCompEmail;

    @FindBy (xpath = "(//div[@class=\"sc-knKHOI jEerXm\"])[3]")
    public WebElement existingCompAddress;

    @FindBy (xpath = "(//div[@class=\"sc-knKHOI jEerXm\"])[4]")
    public WebElement existingCompRegTest;


    public void createACompany(String companyName, String email, String address, String phoneNumber, String routeToTheFile){
        createCompButton.click();
        companyNameInput.sendKeys(companyName);
        emailInput.sendKeys(email);
        addressInput.sendKeys(address);
        phoneInput.click();
        phoneInput.sendKeys(phoneNumber);
        addPictureButton.click();
        addPictureButton.sendKeys(routeToTheFile); ///Users/nurberdibekov/Desktop/screen.png
        createButton.click();

    }
    public void createACompany(String companyName, String email, String address, String phoneNumber){
        createCompButton.click();
        companyNameInput.sendKeys(companyName);
        emailInput.sendKeys(email);
        addressInput.sendKeys(address);
        phoneInput.click();
        phoneInput.sendKeys(phoneNumber);
        createButton.click();

    }

    public void editCompany(String companyName, String email, String address, String phoneNumber){
        preEditButton.click();
        editButton.click();
        String editPageURL = Driver.getDriver().getWindowHandle();
        editCompNameInput.sendKeys(companyName);
        editEmailInput.clear();
        editEmailInput.sendKeys(email);
        editAddressInput.clear();
        editAddressInput.sendKeys(address);
        editPhoneInput.clear();
        editPhoneInput.sendKeys(phoneNumber);
        editSaveButton.click();
        this.editPageURL = editPageURL;

    }

    public boolean verifyEdited(){
        return true;
    }

    public boolean verifyCreatedAComp(){
        return false;
    }
//import Utilities.Driver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class CompaniesPage {
//    WebDriver driver;
//
//    @FindBy(xpath = "//input[@placeholder=\"Enter login\"]")
//    public WebElement loginBtn;
//
//
//    @FindBy(xpath = "//input[@placeholder=\"Enter password\"]")
//    public WebElement passwordBtn;
//
//    @FindBy(xpath = "//button[@type=\"submit\"]")
//    public WebElement singInBtn;
//    @FindBy(xpath = "//button[text()='Create company']")
//    public WebElement addCompanyButton;
//
//    @FindBy (xpath = "//p[text()=\"Click on the icon to download or drag\"]")
//    public WebElement addPictureButton;
//
//
//    @FindBy(xpath = "//span[contains(text(),\"Company Name *\")]/../../..//input")
//    public WebElement companyNameField;
//
//    @FindBy(xpath = "//input[@name='address']")
//    public WebElement addressField;
//
//    @FindBy(xpath = "//input[@name='phoneNumber']")
//    public WebElement phoneField;
//
//    @FindBy(xpath = "//span[contains(text(),\"Email *\")]/../../..//input")
//    public WebElement emailField;
//
//    @FindBy (xpath = "//button[text()='Create']")
//    public WebElement createButton;
//
//    @FindBy (xpath = "//button[text()=\"Cancel\"]")
//    public WebElement cancelButton;
//
//
//    @FindBy(id = "companyList")
//    public WebElement companyList;
//
//
//    public CompaniesPage(){
//        driver = Driver.getDriver();
//        PageFactory.initElements(driver,this);
//    }
//
//
//    public void createCompany(String companyName, String email, String address, String phoneNumber) {
//        addCompanyButton.click();
//        companyNameField.sendKeys(companyName);
//        emailField.sendKeys(email);
//        addressField.sendKeys(address);
//        phoneField.sendKeys(phoneNumber);
//        addPictureButton.sendKeys();
//        createButton.click();
//    }
//
//    public boolean isCompanyListed(String companyName) {
//        return driver.findElement(By.xpath("//td[text()='" + companyName + "']")).isDisplayed();
//    }


}
