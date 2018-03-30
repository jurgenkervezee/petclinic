package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindOwnerPage {

    public FindOwnerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;

 //   @FindBy(id="search-owner-form")
  //  @FindBy(xpath = "//button[text()[contains(.,'Find\\n          Owner')]]")
    @FindBy(css = "button[type='submit']")
    private WebElement findOwner;

    @FindBy(id="lastName")
    private WebElement searchLastName;

    public void enterLastName(String lastName){
    }

    public void pressFindOwner(){
        findOwner.click();
    }

    public void clickOwner(String owner) {
        this.driver.findElement(By.linkText(owner)).click();
    }

    public WebElement resultHeading(String heading) {
        return driver.findElement(By.xpath("//h2[text()='" + heading + "']"));
    }

    public WebElement petName(String petName) {
        return driver.findElement(By.xpath("//dt/../dd[text()='" + petName + "']"));
    }
}
