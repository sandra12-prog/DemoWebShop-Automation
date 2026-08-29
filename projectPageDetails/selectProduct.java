package projectPageDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectProduct {
	WebDriver driver;
	public selectProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    } 
	@FindBy(linkText = "Build your own computer")WebElement computerProduct;
	
	@FindBy(name = "product_attribute_16_3_6")
	WebElement hdd;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-16\"]") WebElement addToCartButton;
	
	public void selectProduct ()  {
	    computerProduct.click();
	    
	    
	}
	public void selectHDD() {
	    hdd.click();
	}

	public void clickAddToCart() {
	    addToCartButton.click();
	}

	

}
