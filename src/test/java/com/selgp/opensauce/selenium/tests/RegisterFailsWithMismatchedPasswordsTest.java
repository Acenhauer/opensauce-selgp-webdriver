package com.selgp.opensauce.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Register fails with mismatched passwords test.
 *
 * @author guillem.hernandez
 */
public class RegisterFailsWithMismatchedPasswordsTest extends BaseDemoTest {

    @Test(description = "Test Register fails with mismatched passwords")
    public void testRegisterFailsWithMismatchedPasswordsTest() {
        verifyRegisterFailsWithMismatchedPasswordsTest();
    }

    private void verifyRegisterFailsWithMismatchedPasswordsTest() {
        driver().get("http://tutorialapp.saucelabs.com");
        Map<String, String> userDetails = createRandomUser();
        userDetails.put("confirm_password", getUniqueId());
        doRegister(userDetails, false);
        Assert.assertEquals("Fields do not match", driver()
                .findElement(By.cssSelector(".error")).getText());
    }
}
