package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;

    @FindBy(xpath="/html/head/title")
    private WebElement pageTitle;


    public String resultTitle() {
        return pageTitle.getAttribute("innerHTML");
    }

}
