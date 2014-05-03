package com.selgp.opensauce.selenium.tests;

import com.selgp.opensauce.webdriver.BaseWebDriverTest;
import org.testng.annotations.Test;
import org.testng.Assert;


/**
 * WebDriver Automated Test Passed Example.
 *
 * @author guillem.hernandez
 */
public class WebDriverPassingTest extends BaseWebDriverTest {

    @Test(description = "Test Passed WebDriver example")
    public void testWebDriverPassingExample() {
        driver().get("http://www.amazon.com");
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
                , driver().getTitle());
    }
}
