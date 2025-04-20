package tests;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class IOSTest {
    public static IOSDriver driver;

    @Test
    public void setUp() throws Exception {
        XCUITestOptions options = new XCUITestOptions();
       
        options.setPlatformName("iOS");
        options.setDeviceName("iPhone 16");
        options.setPlatformVersion("18.4");
        // options.setApp("/Users/abhishekmehta/Downloads/SwagLabsMobileApp");
        options.setAutomationName("XCUITest");
        options.setBundleId("com.apple.Preferences");
        driver = new IOSDriver(new URL("http://192.168.100.10:4725/"), options);
    }

    // @Test
    // public void testExample() {
    //     // Your test code here
    // }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}