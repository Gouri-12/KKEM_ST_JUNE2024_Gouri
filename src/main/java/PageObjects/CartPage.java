package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//div[@data-name='Active Items']//span[@class='a-truncate-cut']") 
    WebElement cartItemName;

    // Actions

    // Get the name of the item in the cart
    public String getCartItemName() {
        // Wait for the cart item name to be visible
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOf(cartItemName));

        // Return the cart item name text
        return cartItemName.getText();
    }
}
