package automation_web_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id = "username")
    private WebElement userName;
    
    @FindBy(id = "password")
    private WebElement password;
    
    @FindBy(id = "submit")
    private WebElement submit;
    
//    @FindBy(id = "ap_password")
//    private WebElement passwordField;
//    
//    @FindBy(id = "signInSubmit")
//    private WebElement signInButton;
//    
    @FindBy(xpath = "//*[@id=\"error\"]")
    private WebElement errorMessage;
//    
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void enterUsername(String uName) {
    	userName.sendKeys(uName);
    }
    public void enterPassword(String pass) {
        
        password.sendKeys(pass);
    }
    public void clickSubmit() {
    	submit.click();
    }
    
//    public void clickSignInLink() {
//        signInLink.click();
//    }
//    
//    public void enterEmail(String email) {
//        emailField.clear();
//        emailField.sendKeys(email);
//    }
//    
//    public void clickContinue() {
//        continueButton.click();
//    }
//    
//    public void enterPassword(String password) {
//        passwordField.clear();
//        passwordField.sendKeys(password);
//    }
//    
//    public void clickSignIn() {
//        signInButton.click();
//    }
//    
    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
