package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOwnerPage {

    @FindBy(id="search-owner-form")
    private WebElement findOwner;


    public void pressFindOwner(){
        clickFindOwner();

    }
    private void clickFindOwner(){
        findOwner.click();
    }

}
