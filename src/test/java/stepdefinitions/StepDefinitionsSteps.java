package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.*;


public class StepDefinitionsSteps {

    private static WebDriver driver;

    public StepDefinitionsSteps(){driver = Driver.getDriver();}


    @Given("^I am on the home page of petclinic$")
    public void i_am_on_the_home_page_of_petclinic() {
        driver.get("http://localhost:8080/");

    }

    @Given("^I am on the owners search page$")
    public void i_am_on_the_owners_search_page() {
        driver.get("http://localhost:8080/owners/find");

    }

    @Then("^I should see pet name \"([^\"]*)\"$")
    public void i_should_see(String petName) {
        FindOwnerPage findOwnerPage= new FindOwnerPage(driver);
        Assert.assertEquals(findOwnerPage.petName(petName).getText(), petName);
    }

    @And("^I press Find Owner$")
    public void i_press_find_owner(){
        FindOwnerPage findOwnerPage= new FindOwnerPage(driver);
        findOwnerPage.enterLastName("Henk");
        findOwnerPage.pressFindOwner();

    }

    @When("^I follow \"([^\"]*)\"$")
    public void i_follow(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @After
    public void closeBrowser(){
        //driver.close();

    }

    @Given("^I am on the \"owners search page\"$")
    public void iAmOnThe() throws Throwable {
        driver.get("http://localhost:8080/owners/find");
    }

    @And("^I press \"Find Owner\"$")
    public void iPress() throws Throwable {
        FindOwnerPage findOwnerPage= new FindOwnerPage(driver);
        findOwnerPage.pressFindOwner();
    }

    @When("^I select owner \"([^\"]*)\"$")
    public void iSelect(String owner) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        FindOwnerPage findOwnerPage= new FindOwnerPage(driver);
        findOwnerPage.clickOwner(owner);
    }

    @Then("^I should see heading \"([^\"]*)\"$")
    public void iShouldSeeHeading(String heading) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        FindOwnerPage findOwnerPage= new FindOwnerPage(driver);
        Assert.assertEquals(findOwnerPage.resultHeading(heading).getText(),heading);
    }
}

