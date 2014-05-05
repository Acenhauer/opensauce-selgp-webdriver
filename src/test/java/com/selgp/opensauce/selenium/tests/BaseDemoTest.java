package com.selgp.opensauce.selenium.tests;

import com.selgp.opensauce.webdriver.BaseWebDriverTest;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;


/**
 * Helper for netcentric example tests.
 *
 * @author guillem.hernandez
 */
public abstract class BaseDemoTest extends BaseWebDriverTest {

    protected String getUniqueId() {
        return Long.toHexString(Double.doubleToLongBits(Math.random()));
    }

    protected void doRegister(Map<String, String> userDetails, boolean logout) {
        userDetails.put(
                "confirm_password",
                userDetails.get("confirm_password") != null ? userDetails
                        .get("confirm_password") : userDetails.get("password")
        );
        driver().get("http://tutorialapp.saucelabs.com/register");
        driver().findElement(By.id("username")).sendKeys(
                userDetails.get("username"));
        driver().findElement(By.id("password")).sendKeys(
                userDetails.get("password"));
        driver().findElement(By.id("confirm_password")).sendKeys(
                userDetails.get("confirm_password"));
        driver().findElement(By.id("name")).sendKeys(userDetails.get("name"));
        driver().findElement(By.id("email")).sendKeys(userDetails.get("email"));
        driver().findElement(By.id("form.submitted")).click();

        if (logout) {
            doLogout();
        }
    }

    private void doLogout() {
        driver().get("http://tutorialapp.saucelabs.com/logout");
        Assert.assertEquals("Logged out successfully.", driver()
                .findElement(By.id("message")).getText());
    }

    protected Map<String, String> createRandomUser() {
        Map<String, String> userDetails = new HashMap<String, String>();
        String fakeId = getUniqueId();
        userDetails.put("username", fakeId);
        userDetails.put("password", "testpass");
        userDetails.put("name", "Fake " + fakeId);
        userDetails.put("email", fakeId + "@example.com");
        return userDetails;
    }

    protected void doLogin(String username, String password) {
        driver().findElement(By.name("login")).sendKeys(username);
        driver().findElement(By.name("password")).sendKeys(password);
        driver().findElement(By.cssSelector("input.login")).click();
        Assert.assertEquals("Logged in successfully.", driver()
                .findElement(By.id("message")).getText());
    }
}