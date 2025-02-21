package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private AndroidDriver driver;
    
    
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }
    
    
    By homeloginButton = By.xpath("//android.widget.Button[@content-desc=\"Log in\"]");
    By emailField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    By passwordField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    By loginbutton = By.xpath("//android.widget.Button[@content-desc=\"Log in\"]");

    public void login(String email, String password) {
        driver.findElement(homeloginButton).click();
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginbutton).click();
        
    }
}
