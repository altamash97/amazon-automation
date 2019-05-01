package amazon.web.automation.test;

import amazon.web.automation.page.AmazonSearchProductTestPage;
import org.testng.annotations.Test;

import java.io.IOException;
import org.apache.log4j.Logger;

public class AmazonSearchProductTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(AmazonSearchProductTest.class);
    @Test
    public void testAmazonProductSearch() throws IOException {
        try {
            SetUp();
            AmazonSearchProductTestPage find = new AmazonSearchProductTestPage(BaseTest.getdriver());
            find.searchProduct("Iphone");
            tearDown();

        } catch (IOException e) {
            logger.error("<b> - Searching for product failed - <font color=\"red\">ERROR</font></b>, exception: " + e);
            throw e;
        }
    }
}
