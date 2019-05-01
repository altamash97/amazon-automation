package amazon.web.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchProductTestPage extends BaseTestPage{
    public AmazonSearchProductTestPage(WebDriver driver) {
        super(driver);
    }
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");

    WebDriverWait wait = new WebDriverWait(driver,10);

    public void searchProduct(String productName){
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

}
