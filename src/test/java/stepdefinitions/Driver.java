package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {

    private static final String CHROME_DRIVER = "chromedriver.exe";

    public static WebDriver getDriver(){
        WebDriver driver;
        String browser  = System.getProperty("browser");
        browser = "chrome";
        driver = chrome();

        return driver;

    }

    private static ChromeDriver chrome() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", "drivers/" + CHROME_DRIVER);

        return new ChromeDriver(options);
    }


}
