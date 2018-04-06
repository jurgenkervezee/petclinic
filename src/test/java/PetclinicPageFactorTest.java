import cucumber.api.junit.*;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import static cucumber.api.junit.Cucumber.*;
//import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty:target/test_output/pretty/cucumber.txt",
                "json:target/test_output/json/cucumber.json",
                "junit:target/test_output/junit/cucumber.xml",
                "usage:target/test_output/usage/cucumber.json",
                "html:target/test_output/html"},
        strict = true,
        monochrome = true,
        features = {"src/test/"}
        //glue = "com.oelan.petclinic.cucumber"
)
public class PetclinicPageFactorTest {
}


