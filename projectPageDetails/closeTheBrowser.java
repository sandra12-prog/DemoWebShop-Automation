package projectPageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class closeTheBrowser {
	WebDriver driver;

    public closeTheBrowser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    } 
    public void close() {
    	driver.quit();
    }

}
