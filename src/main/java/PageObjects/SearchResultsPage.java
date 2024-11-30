package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchResultsPage {

    WebDriver driver;

    // Constructor to initialize the WebDriver and page elements
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locator for the first product in the search results
    @FindBy(xpath = "(//div[contains(@class,'s-result-item')]//h2/a)[1]")
    WebElement firstProduct;

    // Method to select the first product, ensuring it's clickable first
    public void selectFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait for up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct));  // Wait until the product link is clickable
        firstProduct.click();  // Click the first product link
    }

    // Method to get the current URL
    public String returnurl() {
        return driver.getCurrentUrl();
    }
}
