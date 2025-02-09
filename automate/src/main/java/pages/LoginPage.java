package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private AndroidDriver driver;
    WebElement element;
    
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }
    
    By emailField = By.xpath("//android.widget.EditText[@text='Email']");
    By passwordField = By.xpath("//android.widget.EditText[@text='Password']");
    By loginButton = By.xpath("//android.widget.TextView[@text='Login']");

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
