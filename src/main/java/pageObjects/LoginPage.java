package pageObjects;

import components.BaseClass;
import org.openqa.selenium.By;

/*
 * Class which contains the web elements and performs Spa Home page activities (methods)
 *
 * Extends : BaseClass
 *
 * Author : Kavitha (pavanprasad.v@comakeit.com)
 */
public class LoginPage extends BaseClass {
	// ****************** WEB ELEMENTS ****************************//
	public By link_login = By.xpath("//p[normalize-space()='Login']");
	By textbox_Username = By.id("username");
	By textbox_Password = By.id("password");
	By button_SignIn = By.id("kc-login");

	// ****************** ACTIONS ****************************//
	/*
	 * Method to navigate to perform spa login
	 *
	 * Author : Kavitha (Kavitha.t@comakeit.com)
	 */
	public HomePage login() {

		clickOnButton(link_login, "Login Link");
		enterText(textbox_Username, BaseClass.username, "Username Text Box");
		enterText(textbox_Password, BaseClass.password, "Password Text Box" );
		clickOnButton(button_SignIn, "Submit Sign In ");

		HomePage homepage = new HomePage();
		// waitForElementTobeDisplayed(accountsPage.logo_PP);
		passStep("Logged in successfully !!!");
		return homepage;
	}

}
