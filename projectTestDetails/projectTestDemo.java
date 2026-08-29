package projectTestDetails;


import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageDetails.loginPage;
import projectEnvSetUp.preCondition;
import projectPageDetails.closeTheBrowser;
import projectPageDetails.homePageDetails;
import projectPageDetails.loginPageDetails;
import projectPageDetails.registrationPage;
import projectPageDetails.selectProduct;
import projectPageDetails.shoppingCart;
import projectPageDetails.wishList;


@Test(priority = 1)
public class projectTestDemo extends preCondition{
	public void loginTest() {
		loginPage lp = new loginPage(driver);
		
	}
	
		@Test(priority = 3)
		
		 public void titleSetUp() throws InterruptedException {
			 homePageDetails home=new homePageDetails(driver);
				
				AssertJUnit.assertTrue(home.headertext());
				home.bookpage();
				driver.navigate().back();
				home.computerpage();
				 driver.navigate().back();
				 home.electronicspage();
				 driver.navigate().back();
				 home.apparelAndshoes();
				 driver.navigate().back();
				 home.digitaldownloades();
				 driver.navigate().back();
				 home.jewelery();
				 driver.navigate().back();
				 home.giftCard();
				 driver.navigate().back();
				 Thread.sleep(2000);
				 home.scrollDown();
				 home.scrollUp();
				 AssertJUnit.assertTrue(home.verifySearchBox());
			        AssertJUnit.assertTrue(home.verifySearchButton());
			        Thread.sleep(2000);
			        home.searchValue("computer");
			        home.clickSearch();
			        home.scrollDown();
			        Thread.sleep(2000);
			        driver.navigate().back();
			        Thread.sleep(2000);
			        home.searchValue("phone");
			        Thread.sleep(2000);
			        home.clickSearch();
			        home.scrollDown();
			        driver.navigate().back();
			        
			}
		 
		
			 @Test(priority = 2)

		 
	     public void registerTest() throws InterruptedException {

		        
		        registrationPage register = new registrationPage(driver);

	         //Click on Register link
		        register.clickRegisterLink();
		        register.selectFemale();
		        register.firstName("Sandra", "Thomas", "sandrathomas@gmail.com", "Sandra12@", "Sandra12@");
		        Thread.sleep(2000);
		        register.clickRegister();
		        
	     }
			 @Test(priority = 4)

	     public void searchAndSelectProduct() {
	    	 selectProduct product= new selectProduct(driver);	
	    	 homePageDetails home=new homePageDetails(driver);
	    	 home.searchValue("computer");
	    	    home.clickSearch();
	    	    product.selectProduct();
	    	    
	    	    product.selectHDD();
	    	    product.clickAddToCart();
	    	    
	     }  
	     @Test(priority = 7)

	
	     public void shoppingCartTest() {

	         shoppingCart cart = new shoppingCart(driver);
	         cart.shoppingCart();
	     
	     

          // Verify Shopping Cart heading
	         AssertJUnit.assertTrue(cart.verifyShoppingCartHeading());
	        
         
	      // Verify product
	         AssertJUnit.assertTrue(cart.verifyProduct());
//
//
//	           
//
//	         // Change quantity
	         cart.enterQuantity("2");
//	         
//	         //select the country
//	         cart.selectCountry("india");
//	         
//	         //select the other
//	         cart.selectOther();
//	     
//
            // Update cart
	         cart.clickUpdateCart();
	         
	         //continue Shopping
	         cart.clickContinueShopping();
	         
	         //Select terms and contition
	         cart.selectTerms();
	         
	      // Click checkout
	         cart.clickCheckout();
	         
	         
     }
	     @Test(priority=6)
	     public void wishListCart() {
	    	 wishList wish = new wishList(driver);
	    	 wish.searchValue("bag");
	    	 wish.clickSearch();
	    	 wish.jewelryClick();
	
	    	 
	     }
	     
	     @Test(priority = 5)
	     public void verifyLoginPageHeading() {

	         loginPageDetails login = new loginPageDetails(driver);
	         login.loginClicks();

	         boolean result=login.isLoginHeadingDisplayed();
	         System.out.println(result);
	         
	         
	         login.enterEmail("sandrathomas@gmail.com");
	         login.enterPassword("Sandra12@");
	         login.clickRememberMe();
	         Assert.assertTrue(login.isRememberMeSelected(),"Remember Me checkbox is not selected");
	         Assert.assertTrue(login.isRegisterButtonDisplayed(),"Register button is not displayed");
	         Assert.assertTrue(login.isLoginButtonDisplayed(),"Login button is not displayed");
	         login.clickLogin();
	                 
	     }  
	     //
	     @Test(priority=8)
	     public void tabClose() throws InterruptedException {
	    	 Thread.sleep(2000);
	    	 closeTheBrowser cb=new  closeTheBrowser(driver);
	    	 cb.close();
	    	 
	     }
	     
	                
}	                 
	                 
	         
	                 
	                 
	     
	    
	    
	                 
	                 
	         
	                 
	     

	     

	
	    	    
	    	    

	    	   
	    	
	    
	     
		        
		        
		        
		        
		        
		        
		        
		        
		
		 
		 
		 

	    

