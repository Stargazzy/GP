package Pages;

import Utilities.Driver;
import Utilities.SelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "input")
    public WebElement usernameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@class=\"sc-fKVqWL bIUtrB\"]")
    public WebElement signInButton;

    @FindBy (xpath = "//p[text()=\"Incorrect login and/or password.\"]")
    public WebElement failedMsg;

    public void signIn (String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public boolean verifyLoggedIn (){
        return usernameInput.isDisplayed();
    }
    public boolean verifyFailedLogin(){
        return failedMsg.isDisplayed();
    }


}
