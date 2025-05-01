package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import resources.Data;

public class SignupPage {
  
    private AndroidDriver driver;
    WebElement element;

    public SignupPage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath = "//android.widget.Button[@content-desc=\"Sign up\"]")
   WebElement homesignbutton;

   @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
    WebElement SignUsername;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
   WebElement SignEmail;

   @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]")
   WebElement SignPassword;

   @FindBy(xpath = "//android.widget.Button[@content-desc=\"Sign up\"]")
   WebElement SignUpButton;

    

    public void signup(String username, String email, String password) throws InterruptedException {
       homesignbutton.click();
       SignUsername.click();
       SignUsername.sendKeys(username);
       SignEmail.click();
       SignEmail.sendKeys(email + "@yopmail.com");
       SignPassword.click();
       SignPassword.sendKeys(password);
       SignUpButton.click();
       
    }

    public void otp(){
        String otpText = "Your OTP to verify email is: 395987"; // The text from the element

        driver.get("http://www.yopmail.com/en/");               //Open Yopmail
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Data.RndString);
        driver.findElement(By.xpath("//div[@id='refreshbut']")).click();

        // Regex to capture exactly 6 digits
        Pattern pattern = Pattern.compile("(\\d{6})"); // Matches exactly 6 digits
        Matcher matcher = pattern.matcher(otpText);

        String otp = null;
        if (matcher.find()) 
        {
        otp = matcher.group(1);
        System.out.println("OTP: " + otp); // Output: OTP: 395987
        } 

        
    }


}
