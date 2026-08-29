package projectPageDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageDetails {
	 WebDriver driver;

	    public homePageDetails(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	    } 
	    // Demo Web Shop heading
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")WebElement heading;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")WebElement book;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")WebElement computers;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")WebElement electronics;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")WebElement apparelandshoes;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")WebElement digitaldownload;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")WebElement jewelry;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")WebElement giftcards;
	   @FindBy(name="q")WebElement searchBox;
	   @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")WebElement searchButton;
	   public WebElement logo;
	   
	   public boolean headertext() {
		   
		   return heading.isDisplayed();
		   
	   }
	   //Book Page
	   public void bookpage() {
		   book.click();
	   }
	   //Computer Page
	   public void computerpage() {
		   computers.click();
	   }
	   //Electronics Page
	   public void electronicspage() {
		   electronics.click();
		   
	   }
	   //Apparel and Shoes
	   public void apparelAndshoes() {
		   apparelandshoes.click();
	   }
	   //Digital Download Page
	   public void digitaldownloades() {
		   digitaldownload.click();
		   
	   }
	   //jewlery Page
	   public void jewelery() {
		   jewelry.click();
		   
	   }
	   //Gift Cards
	   public void giftCard() {
		   giftcards.click();
	   }
	   //ScrollDown the page
	   public void scrollDown() {
		   JavascriptExecutor js =(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,500)");
	   }
	   //ScrollUp the page
	   public void scrollUp() {
		   JavascriptExecutor jss =(JavascriptExecutor)driver;
		   jss.executeScript("window.scrollBy(0,500)");
		   
		   
		   
	   }
	   

	    public boolean verifySearchBox() {
	        return searchBox.isDisplayed();
	    }

	    public boolean verifySearchButton() {
	        return searchButton.isDisplayed();
	    }
	    public void searchValue(String computer) {
	        searchBox.sendKeys(computer);
	        
	        
	    }
	    public void searchValues(String phone) {
	    	searchBox.sendKeys(phone);
	    }
	    public void clickSearch() {
	        searchButton.click();
	    }
	   

	   


}
