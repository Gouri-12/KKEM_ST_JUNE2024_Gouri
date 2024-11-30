package TestCases;

import PageObjects.HomePage;
import PageObjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsPageTest extends TestBase {

    @Test
    public void testSelectFirstProduct() {
        // Initialize the HomePage object and SearchResultsPage object
        HomePage homepage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver); // Pass driver to constructor

        // Perform a search for "Laptop"
        homepage.searchProduct("Laptop");

        // Select the first product from the search results
        searchResultsPage.selectFirstProduct();

        // Get the current URL after selecting the first product
        String currentUrl = searchResultsPage.returnurl(); // Call returnUrl() method

        // Assert that the URL matches the expected base URL
        Assert.assertTrue(currentUrl.contains("dp"), "URL should contain 'dp' indicating a product page.");
    }
}
