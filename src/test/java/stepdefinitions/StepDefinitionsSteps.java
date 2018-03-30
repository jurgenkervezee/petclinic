package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDefinitionsSteps {

    private static WebDriver driver;

    public StepDefinitionsSteps(){driver = Driver.getDriver();}


    @Given("^I am on the home page of petclinic$")
    public void i_am_on_the_home_page_of_petclinic() {
        driver.get("http://localhost:8080/");
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {

        throw new PendingException();
    }

    @Given("^I press \"([^\"]*)\"$")
    public void i_press(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I follow \"([^\"]*)\"$")
    public void i_follow(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I open nos\\.nl$")
    public void i_open_nos_nl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I launch nos\\.nl$")
    public void i_launch_nos_nl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I am at nos\\.nl$")
    public void i_am_at_nos_nl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
