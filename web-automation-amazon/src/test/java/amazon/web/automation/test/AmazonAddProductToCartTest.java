package amazon.web.automation.test;

import amazon.web.automation.page.AmazonAddProductToCartTestPage;
import amazon.web.automation.page.AmazonPrimeButtonTestPage;
import amazon.web.automation.page.AmazonSearchProductTestPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

public class AmazonAddProductToCartTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(AmazonAddProductToCartTest.class);
    @Test
    public void testAmazonAddToCart()throws IOException {
        try {
            SetUp();
            AmazonSearchProductTestPage find = new AmazonSearchProductTestPage(BaseTest.getdriver());
            find.searchProduct("Iphone");
            AmazonAddProductToCartTestPage select = new AmazonAddProductToCartTestPage(BaseTest.getdriver());
            select.selectFromSearchResults();
            select.addItemToCart();
            tearDown();
        }
        catch(IOException e){
            logger.error("<b> - Amazon add to cart test failed - <font color=\"red\">ERROR</font></b>, exception: " + e);
            throw e;
        }
    }
}
