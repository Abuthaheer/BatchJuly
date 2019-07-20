package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;

public class Logintests {

	LoginObjects lg;

	public Logintests() {
		lg = new LoginObjects();
	}

	@Test
	public void verifyLogin() {
		lg.loginToApp("Abuthaheer", "test");
		Assert.assertTrue(lg.getTitlte().contains("Search"), "Failed: Login failed");
	}

	@Test
	public void verifyUserName() {
		lg.setUserName("Admin");
		String user = lg.getUserNameTxt();
		Assert.assertTrue(user.equals("Admin"), "Failed: Not Typed");
	}
}