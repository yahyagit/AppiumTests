package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by AkshayS on 18/10/16.
 */
public class HomePage extends BasePage {

    @FindBy(id = "text_gopay_balance")
    private WebElement goPayBalance;


    public HomePage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }

    public void verifyGoPayBalance() throws MalformedURLException {
        waitForElement(goPayBalance);
        Assert.assertTrue(!goPayBalance.getText().isEmpty());
    }

}
