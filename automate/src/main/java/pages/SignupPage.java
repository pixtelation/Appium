package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignupPage {
    private AndroidDriver driver;
    WebElement element;

    public SignupPage(AndroidDriver driver)
    {
        this.driver =driver;
    }
    
    By homesignbutton = By.xpath("//android.widget.Button[@content-desc=\"Sign up\"]");
    By SignUsername = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    By SignEmail = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    By SignPassword = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    By SignUpButton = By.xpath("//android.widget.Button[@content-desc=\"Sign up\"]");


    public void signup(String username, String email, String password) throws InterruptedException {
        driver.findElement(homesignbutton).click();
        driver.findElement(SignUsername).click();
        driver.findElement(SignUsername).sendKeys(username);
        driver.findElement(SignEmail).click();
        driver.findElement(SignEmail).sendKeys(email);
        driver.findElement(SignPassword).click();
        driver.findElement(SignPassword).sendKeys(password);
        driver.findElement(SignUpButton).click();


    }


}
