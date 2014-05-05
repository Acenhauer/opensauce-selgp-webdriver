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

public class RegisterFailsWithBadEmailTest extends BaseDemoTest {

	@Test(description = "Test Register failing using a bad email username test")
	public void testRegisterFailsWithBadEmail() {
		verifyRegisterFailsWithBadEmail();
	}

	private void verifyRegisterFailsWithBadEmail() {
		driver().get("http://tutorialapp.saucelabs.com");
		Map<String, String> userDetails = createRandomUser();
		userDetails.put("email", "test");
		doRegister(userDetails, false);
		Assert.assertEquals("Message not found",
                "An email address must contain a single @", driver()
                        .findElement(By.cssSelector(".error")).getText()
        );
		driver().findElement(By.id("email")).clear();
		driver().findElement(By.id("email")).sendKeys("@example.com");
		driver().findElement(By.id("form.submitted")).click();
        Assert.assertEquals(
                "Message not found",
                "The username portion of the email address is invalid (the portion before the @: )",
                driver().findElement(By.cssSelector(".error")).getText());
		driver().findElement(By.id("email")).clear();
		driver().findElement(By.id("email")).sendKeys("test@example");
		driver().findElement(By.id("form.submitted")).click();
        Assert.assertEquals(
                "Message not found",
                "The domain portion of the email address is invalid (the portion after the @: bob)",
                driver().findElement(By.cssSelector(".error")).getText());
	}
}
