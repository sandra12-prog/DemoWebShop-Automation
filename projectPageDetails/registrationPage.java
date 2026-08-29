package projectPageDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class registrationPage {
	 WebDriver driver;


	
	 // open the page
    @FindBy(linkText = "Register")
    WebElement registerLink;
    //Radiobutton
    @FindBy(name = "Gender")WebElement radio; 
    //FirstName
    @FindBy(name="FirstName")WebElement firstname;
    //Last Name
    @FindBy(name="LastName")WebElement lastname;
    //Email
    @FindBy(name="Email")WebElement email;
    @FindBy(name="Password")WebElement password;
    @FindBy(name="ConfirmPassword")WebElement confrimPsw;
    @FindBy(name="register-button")WebElement registration;
	
    
    

    // Constructor
    public registrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Action Method
    public void clickRegisterLink() {
        registerLink.click();

    }
    public void selectFemale() {
    	radio.click();
    	
    }
    public void firstName(String fname,String lname,String id,String psw,String cnpsw) {
    	firstname.sendKeys(fname);
    	lastname.sendKeys(lname);
    	email.sendKeys(id);
    	password.sendKeys(psw);
    	confrimPsw.sendKeys(cnpsw);
    	
    	
    }
    
    public void clickRegister() {
    	registration.click();
    	
    	
    }
	
}


