package steps;

import com.google.common.base.Verify;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by AkshayS on 18/10/16.
 */
public class LoginSteps extends BaseStep {

    @Given("^When I am on login page$")
    public void whenIAmOnLoginPage() throws Throwable {

    }

    @When("^User enters email \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userEntersEmailAndPasswordAs(String email, String password) throws Throwable {
        new LoginPage(wd).login(email, password);
    }

    @Then("^Verify GoPay Amount$")
    public void verifyGoPayAmount() throws Throwable {
        new HomePage(wd).verifyGoPay();
    }
}

