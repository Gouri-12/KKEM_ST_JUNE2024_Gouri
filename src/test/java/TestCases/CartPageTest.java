package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductDetailsPage;
import PageObjects.SearchResultsPage;

public class CartPageTest extends TestBase {
	
	@Test
	public void testCartItemName() {
		//perform a search for "Laptop"
		HomePage homepage = new HomePage(driver);
		homepage.searchProduct("Laptop");
		
		//select the first product from the search results
		
		SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
		searchResultsPage.selectFirstProduct();
		
		//add the product to the cart
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.addToCart();
		
		//go to the cart page and get the cart item name 
		CartPage cartpage = new CartPage(driver);
		String cartItemName = cartpage.getCartItemName();
		
		//Assert that the cart item name contains "Laptop"
		Assert.assertTrue(cartItemName.toLowerCase().contains("Laptop"));
	}
}
