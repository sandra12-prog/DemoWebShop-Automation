package pageDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
WebDriver driver;
	
	//WebElemnts + Action Methods
	
	//create object Repository
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(id = "submit")
	WebElement submit;
	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Action Methods
	public void setValues(String un, String pswd) {
		username.sendKeys(un);
		password.sendKeys(pswd);
	}
	
	public void loginbtn() {
		submit.click();
	}

}
