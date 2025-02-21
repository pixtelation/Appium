package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

public class Base {
    public AndroidDriver driver;

    @SuppressWarnings("deprecation")
    @BeforeClass
    public void setup() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("RealMe 9i"); 
        options.setUdid("192.168.7.3:5555");    //Change as per device
        options.setAppPackage("app.plugg.social");   //Change as per app
        options.setAppActivity("app.plugg.social.MainActivity");  //Change as per app
        options.setAutomationName("UiAutomator2");
        // options.setNoReset(true);
        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS) ;
        // Thread.sleep(10000);
    }

    // @AfterClass
    // public void tearDown() {
    //     if (driver != null) {
    //         driver.quit();
    //     }
    // }
}
