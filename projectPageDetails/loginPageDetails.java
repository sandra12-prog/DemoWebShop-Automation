package projectPageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageDetails {
	 WebDriver driver;

	    public loginPageDetails(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	    }
	    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")WebElement loginClick;
	    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")WebElement loginDisplay;
	    @FindBy(name = "Email")WebElement email;
	    @FindBy(name = "Password") WebElement password;
	    @FindBy(id = "RememberMe") WebElement rememberMe;
	    @FindBy(xpath = "//input[@value='Register']")WebElement registerButton;
	    @FindBy(xpath = "//input[@value='Log in']") WebElement loginButton;
	   
	    
	   
	    
	    
	    public void loginClicks() {
	    	loginClick.click();	
	    }
	    public boolean isLoginHeadingDisplayed() {
	        return loginDisplay.isDisplayed();
	    }
	    public void enterEmail(String emailId) {
	        
	        email.sendKeys(emailId);
	    }
	    public void enterPassword(String pwd) {
	        
	        password.sendKeys(pwd);
	    }
	    public void clickRememberMe() {
	        rememberMe.click();
	    }
	    public boolean isRememberMeSelected() {
	        return rememberMe.isSelected();
	    }
	    public boolean isRegisterButtonDisplayed() {
	        return registerButton.isDisplayed();
	    }
	    public void clickLogin() {
	        loginButton.click();
	    }
	    public boolean isLoginButtonDisplayed() {
	        return loginButton.isDisplayed();
	    }
	   
	}


	    


