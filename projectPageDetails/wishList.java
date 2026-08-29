package projectPageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wishList {
	WebDriver driver;

    public wishList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    } 
    @FindBy(name="q")WebElement searchbox;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")WebElement searchB;
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/h2/a")
    WebElement jewelry;
    
   // @FindBy(xpath="//*[@id=\"add-to-wishlist-button-43\"]")WebElement wishList;

    public void searchValue(String jewelry) {
        searchbox.sendKeys(jewelry);
        
        
    }
    public void clickSearch() {
        searchB.click();
        
        
    }
    public void jewelryClick() {
    	jewelry.click();
    	
    	
    }
   
    
//    public void wishListS() {
//    	wishList.click();
//    }
    
    
    

}
