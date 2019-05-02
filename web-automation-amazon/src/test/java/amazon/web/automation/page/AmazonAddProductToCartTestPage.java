package amazon.web.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAddProductToCartTestPage extends BaseTestPage {
    public AmazonAddProductToCartTestPage(WebDriver driver) {
        super(driver);
    }
    // Ideally should be using an id instead of xpath through a search results list
    By clickIphoneImage = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[6]/div/div/div/div[2]/div[1]/div/div/span/a/div/img");
    By addToCartButton = By.id("add-to-cart-button");
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void selectFromSearchResults(){
        wait.until(ExpectedConditions.elementToBeClickable(clickIphoneImage));
        driver.findElement(clickIphoneImage).click();
    }

    public void addItemToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement((addToCartButton)).click();
    }
}
