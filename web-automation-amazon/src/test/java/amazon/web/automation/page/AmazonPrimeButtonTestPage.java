package amazon.web.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class AmazonPrimeButtonTestPage extends BaseTestPage {
    public AmazonPrimeButtonTestPage(WebDriver driver) {
        super(driver);
    }

    By tryPrimeButton = By.id("nav-link-prime");
    By headerPrimeButton = By.id("prime-header-CTA");

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void tryPrime(){
        wait.until(ExpectedConditions.elementToBeClickable(tryPrimeButton));
        driver.findElement(tryPrimeButton).click();

        wait.until(ExpectedConditions.elementToBeClickable(headerPrimeButton));
        driver.findElement(headerPrimeButton).click();
    }
}
