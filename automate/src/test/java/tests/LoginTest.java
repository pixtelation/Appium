package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Base {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Arif.raza@weavers-web.com", "Test@123");
        System.out.println("Login Test Executed!");
        
    }
}
