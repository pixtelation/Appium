package tests;
import base.Base;
import org.testng.annotations.Test;
import pages.SignupPage; 

public class SignUpTest extends Base {

    @Test
    public void signuptest() throws InterruptedException{
        SignupPage signuptest = new SignupPage(driver);
        signuptest.signup("Chkj", "Chk@yopmail.com", "Test@123456");
        System.out.println("Signup Test Executed!");


    }
    
}
