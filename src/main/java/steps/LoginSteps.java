package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by AkshayS on 18/10/16.
 */
public class LoginSteps extends BaseStep {

    @Given("^Given I am on the Go-Jek app log in page$")
    public void givenIAmOnTheGoJekAppLogInPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User enters email \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userEntersEmailAndPasswordAs(String email, String password) throws Throwable {
        new LoginPage(driver).login(email, password);
    }

    @Then("^Verify GoPay Amount$")
    public void verifyGoPayAmount() throws Throwable {
        new HomePage(driver).verifyGoPayBalance();
    }
}

