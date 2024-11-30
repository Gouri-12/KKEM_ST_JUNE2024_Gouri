package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class HomePageTest extends TestBase{
	 HomePage homepage;
	 
	    // Test case to check if the search box is present
	@Test
	public void testSearchBoxPresence() {
		
		 // Initialize the HomePage object
		HomePage homepage = new HomePage(driver);
		
		 // Assert that the search box is displayed
		Assert.assertTrue(homepage.searchBoxPresent());
	}
	  // Test case to check if the search button is enabled
	@Test
	public void testSearchButtonEnabled() {
		HomePage homnepage = new HomePage(driver);
	}
}