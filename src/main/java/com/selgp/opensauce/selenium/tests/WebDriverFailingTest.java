package com.selgp.opensauce.selenium.tests;

import com.selgp.opensauce.webdriver.BaseWebDriverTest;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * WebDriver Automated Test Failed Example.
 *
 * @author guillem.hernandez
 */
public class WebDriverFailingTest extends BaseWebDriverTest {

    @Test(description = "Test Failed Webdriver example")
    public void testWebDriverFailingExample() {
        driver().get("http://www.google.com");
        Assert.assertEquals(
                "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",
                driver().getTitle().toString());
    }
}
