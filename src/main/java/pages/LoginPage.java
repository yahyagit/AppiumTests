package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by AkshayS on 18/10/16.
 */
public class LoginPage {
    private AndroidDriver wd;

    public LoginPage(AndroidDriver wd) {
        this.wd = wd;
    }

    public void login(String email, String password){
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.findElement(By.id("input_email")).sendKeys(email);
        wd.findElement(By.id("input_password")).sendKeys(password);
        wd.findElement(By.id("button_signin")).click();
    }
}
