package com.selgp.opensauce.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Login with Bad credentials test.
 *
 * @author guillem.hernandez
 */
public class LoginWithBadCredentialsTest extends BaseDemoTest {

    @Test(description = "Test Login with Bad Credentials")
    public void testLoginWithBadCredentials() {
        verifyLoginWithBadCredentials();
    }

    private void verifyLoginWithBadCredentials() {
        driver().get("http://tutorialapp.saucelabs.com");
        String userName = getUniqueId();
        String password = getUniqueId();
        driver().findElement(By.name("login")).sendKeys(userName);
        driver().findElement(By.name("password")).sendKeys(password);
        driver().findElement(By.cssSelector("input.login")).click();
        Assert.assertNotNull(driver().findElement(By.id("message")));
    }
}
