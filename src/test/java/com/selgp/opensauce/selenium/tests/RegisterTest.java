package com.selgp.opensauce.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Register test.
 *
 * @author guillem.hernandez
 */
public class RegisterTest extends BaseDemoTest {

    @Test(description = "Test Register")
    public void testRegister() {
        verifyRegister();
    }

    private void verifyRegister() {
        driver().get("http://tutorialapp.saucelabs.com");
        Map<String, String> userDetails = createRandomUser();
        doRegister(userDetails, false);
        Assert.assertTrue(
                driver().findElement(By.cssSelector(".username")).getText()
                        .contains("You are logged in as ")
        );
    }
}
