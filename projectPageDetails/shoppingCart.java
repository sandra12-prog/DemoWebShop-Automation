package projectPageDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingCart {
	WebDriver driver;

    public shoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //shopping Cart
    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")WebElement shoppingCart;

    // Shopping Cart heading
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1")
    WebElement shoppingCartHeading;
    // Product name
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a")
    WebElement productName;

    // Quantity textbox
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")WebElement quantity;
    
    //select the country
    @FindBy(name="CountryId")WebElement country;
    //slect the pin number
    @FindBy(name="StateProvinceId")WebElement other;
    // Update Shopping Cart button
    @FindBy(name = "updatecart")
    WebElement updateCartButton;

    // Continue Shopping button
    @FindBy(name = "continueshopping")
    WebElement continueShoppingButton;
 // Terms and conditions checkbox
    @FindBy(name = "termsofservice")
    WebElement termsCheckbox;

    // Checkout button
    @FindBy(name = "checkout")WebElement checkoutButton;
    
   
    
    public void shoppingCart() {
    	shoppingCart.click();
    	
    }


    // Verify Shopping Cart heading
    public boolean verifyShoppingCartHeading() {
        return shoppingCartHeading.isDisplayed();
    }

    // Verify product is displayed
    public boolean verifyProduct() {
        return productName.isDisplayed();
    }

    // Enter quantity
    public void enterQuantity(String qty) {
        quantity.clear();
        quantity.sendKeys(qty);
    }
    //country
    public void selectCountry(String countryName) {
    	country.sendKeys(countryName);
    	
    }
    
    //select other
    public void selectOther() {
    	other.click();
    	
    }

    // Update cart
    public void clickUpdateCart() {
        updateCartButton.click();
    }

    // Continue shopping
    public void clickContinueShopping() {
        continueShoppingButton.click();
    }

    // Select terms and conditions
    public void selectTerms() {
        
            termsCheckbox.click();
        
    }

    // Click checkout
    public void clickCheckout() {
        checkoutButton.click();
    }

}
