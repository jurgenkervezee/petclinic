package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindOwnerPage {

    public FindOwnerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="search-owner-form")
    private WebElement findOwner;

    @FindBy(id="lastName")
    private WebElement searchLastName;

    public void enterLastName(String lastName){
    }

    public void pressFindOwner(){
        findOwner.click();
    }
}
