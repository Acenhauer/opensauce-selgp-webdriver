package com.selgp.opensauce.selenium.tests;

import org.testng.annotations.Test;

import java.util.Map;

/**
 * Login test.
 * 
 * @author guillem.hernandez
 */
public class LoginTest extends BaseDemoTest {

	@Test(description = "Test Login")
	public void testLogin() {
		verifyLogin();
	}

	private void verifyLogin() {
		driver().get("http://tutorialapp.saucelabs.com");
		Map<String, String> userDetails = createRandomUser();
        doRegister(userDetails, true);
        doLogin(userDetails.get("username"), userDetails.get("password"));
	}
}
