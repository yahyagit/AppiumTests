package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by AkshayS on 18/10/16.
 */
public class HomePage {
    private AndroidDriver wd;

    public HomePage(AndroidDriver wd) {

        this.wd = wd;
    }

    public void verifyGoPay() {
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        assertTrue("Go pay balance is not display", wd.findElement(By.id("text_gopay_balance")).isDisplayed());
    }
}
