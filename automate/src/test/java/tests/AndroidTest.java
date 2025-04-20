package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class AndroidTest {
    public static AndroidDriver driver;


    @BeforeClass
    public void setUp() throws Exception {
         UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("RealMe 9i");
        options.setUdid("192.168.100.5:5555");
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.MainActivity");
        options.setAutomationName("UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    }

    @Test
    public void testExample() {
        // Your test code here
    }

    // @AfterClass
    // public void tearDown() {
    //     driver.quit();
    // }
}