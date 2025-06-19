package automation_web_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    
    @Test(priority = 1, description = "Verify successful login with valid credentials")
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmit();
        System.out.println("Valid username & password "+driver.getPageSource().contains("Logged In Successfully"));
        // Verify login by checking if "Hello, User" appears
        Assert.assertTrue(driver.getPageSource().contains("successfully logged in"), 
            "Login was not successful");
    }
    
    @Test(priority = 2, description = "Verify error message with invalid password")
    public void testInvalidPassword() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("valid_email@example.com");
        loginPage.enterPassword("validPassword123");
        loginPage.clickSubmit();
        System.out.println("invalid username & password ");
        
        String actualError = loginPage.getErrorMessage();
        Assert.assertTrue(actualError.contains("Your username is invalid!"), 
            "Error message not displayed for invalid password");
    }
    
    @Test(priority = 3, description = "Verify error message with empty credentials")
    public void testEmptyCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.clickSubmit(); // Click continue without entering email
        
        String actualError = loginPage.getErrorMessage();
		/*
		 * Assert.assertTrue(actualError.contains("Your username is invalid!"),
		 * "Error message not displayed for invalid password");
		 * ("Your username is invalid!"),
		 * "Error message not displayed for invalid password");
		 */
        Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"), 
                "Login was not successful");
    }
}