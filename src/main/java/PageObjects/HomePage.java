package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver ;
	
	//constructor
	public  HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
 }
		//locators
		
		@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]") WebElement SearchAmazonTab;
		@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]") WebElement SearchButton;
	// actions
	//verify if the search box is present
	public boolean  searchBoxPresent() {
		 return SearchAmazonTab.isDisplayed();
	}
	//verify if the search button is enable
	public boolean searchBtnEnable() {
		return SearchButton.isEnabled();
	}

    // Search for a product by name
	public void searchProduct(String productName) {
       
        SearchButton.sendKeys(productName);
        SearchButton.click();
    }
	
}