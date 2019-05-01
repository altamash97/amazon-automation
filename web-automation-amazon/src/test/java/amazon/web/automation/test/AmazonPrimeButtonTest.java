package amazon.web.automation.test;

import amazon.web.automation.page.AmazonPrimeButtonTestPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

public class AmazonPrimeButtonTest extends BaseTest{
    private static final Logger logger = Logger.getLogger(AmazonSearchProductTest.class);
    @Test
    public void testAmazonPrime()throws IOException{
        try {
            SetUp();
            AmazonPrimeButtonTestPage select = new AmazonPrimeButtonTestPage(BaseTest.getdriver());
            select.tryPrime();
            tearDown();
        }
        catch(IOException e){
            logger.error("<b> - Amazon prime test failed - <font color=\"red\">ERROR</font></b>, exception: " + e);
            throw e;
        }
    }
}
