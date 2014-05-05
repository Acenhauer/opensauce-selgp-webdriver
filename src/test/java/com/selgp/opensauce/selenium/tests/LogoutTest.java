package com.selgp.opensauce.selenium.tests;

import org.testng.annotations.Test;

import java.util.Map;

/**
 * Logout test.
 * 
 * @author guillem.hernandez
 */
public class LogoutTest extends BaseDemoTest {

	@Test(description = "Test Logout")
	public void testLogout() {
		verifyLogout();
	}

	private void verifyLogout() {
		driver().get("http://tutorialapp.saucelabs.com");
		Map<String, String> userDetails = createRandomUser();
        doRegister(userDetails, true);
	}
}
