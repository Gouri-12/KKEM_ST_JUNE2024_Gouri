package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductDetailsPage;
import PageObjects.SearchResultsPage;

public class ProductDetailsPageTest extends TestBase {
	WebDriver driver;
	@Test
	public void testAddToCartFunctionality() {
		  //Search for a product
		  HomePage homepage = new HomePage(driver);
		  homepage.searchProduct("Laptop");
		  //Select the first product from the search results
		  SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
		  searchResultsPage.selectFirstProduct();
		  //add the product to the cart
		  ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		  productDetailsPage.addToCart();
		  //verify the cart count
		  Assert.assertEquals(productDetailsPage.getCartCount(),prop.getProperty("cartcount"));
	}
}