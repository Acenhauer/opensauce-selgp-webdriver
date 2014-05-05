package com.selgp.opensauce.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Register failing without username test.
 *
 * @author guillem.hernandez
 */

public class RegisterFailsWithoutUsernameTest extends BaseDemoTest {

    @Test(description = "Test Register failing without username test")
    public void testRegisterFailsWithoutUsername() {
        verifyRegisterFailsWithoutUsername();
    }

    private void verifyRegisterFailsWithoutUsername() {
        driver().get("http://tutorialapp.saucelabs.com");
        Map<String, String> userDetails = createRandomUser();
        userDetails.put("username", "");
        doRegister(userDetails, false);
        Assert.assertEquals("Please enter a value", driver()
                .findElement(By.cssSelector(".error")).getText());
    }
}
