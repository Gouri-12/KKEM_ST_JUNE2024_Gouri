package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	 WebDriver driver;
	 
	 //constructor 

	    public ProductDetailsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements( driver,this);
}
	    //locators
	    @FindBy(xpath="//button[@id=\"a-autoid-0-announce\"]") WebElement addToCartButton;
	    @FindBy(xpath="//span[@id='nav-cart-count']") WebElement cartCount;
	    
	    //actions
	    
	    // Click on the Add to Cart button if it is displayed and enabled
	    public void addToCart() {
	    	if (addToCartButton.isDisplayed() && addToCartButton.isEnabled()) {
	            addToCartButton.click();
	        } else {
	            throw new IllegalStateException("Add to Cart button is not available!");
	        }
	    }
	    //get the current cart count
	    public String getCartCount() {
			return cartCount.getText();
	    	
	    }
		
}