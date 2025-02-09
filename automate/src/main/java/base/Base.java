package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("RealMe 9i");
        options.setUdid("192.168.100.2:5555");
        options.setAppPackage("com.bashdit.app");
        options.setAppActivity("com.bashdit.app.MainActivity");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
