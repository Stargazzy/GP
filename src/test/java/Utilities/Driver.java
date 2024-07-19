package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        String browser = Config.getProperty("browser");

        if(driver==null){
            switch (browser){
                case "chrome" -> driver = new ChromeDriver();
//                case "firefox" -> driver = new FirefoxDriver();
//                case "safari" -> driver = new SafariDriver();
                default -> driver = new ChromeDriver();
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).
                    pageLoadTimeout(Duration.ofSeconds(30));

            driver.manage().window().maximize();
        }
        return driver;



    }





}
