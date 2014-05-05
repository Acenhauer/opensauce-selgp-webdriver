package com.selgp.opensauce.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Register fails without name test.
 * 
 * @author guillem.hernandez
 */
public class RegisterFailsWithoutNameTest extends BaseDemoTest {

	@Test(description = "Test Register fails without name")
	public void testRegisterFailsWithoutNameTest() {
		verifyRegisterFailsWithoutNameTest();
	}

	private void verifyRegisterFailsWithoutNameTest() {
		driver().get("http://tutorialapp.saucelabs.com");
		Map<String, String> userDetails = createRandomUser();
		userDetails.put("name", "");
		doRegister(userDetails, false);
		Assert.assertEquals("Message not found", "Please enter a value", driver()
                .findElement(By.cssSelector(".error")).getText());
	}
}
