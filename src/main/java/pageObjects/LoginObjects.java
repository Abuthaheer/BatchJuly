package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects extends BasePage {

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public LoginObjects() {
		PageFactory.initElements(driver, this);
	}

	public void loginToApp(String user, String pass) {
		setText(userName, user);
		setText(passWord, pass);
		btnLogin.click();
	}

	public void setUserName(String user) {
		setText(userName, user);
	}

	public String getUserNameTxt() {
		return userName.getAttribute("value");
	}

}
