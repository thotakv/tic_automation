package testcases.smoke;

import dataModel.*;
import org.testng.annotations.Test;

import components.BaseClass;
import pageObjects.*;
import utils.XML_Operations;

public class Smoke_Testcases extends BaseClass {
	// ****************** CLASS INSTANCES ****************************//
	XML_Operations xml_Ops = new XML_Operations();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	CanvasPage canvasPage = new CanvasPage();

	// ****************** TEST SCRIPTS ****************************//

	/*
	 * TC_01_LoginWithValidData
	 *
	 */

	/*
	 * This is a test case to login to the application with valid data
	 *
	 * Author : Kavitha Thota (kavitha.t@comakeit.com)
	 */
	@Test(groups = { "smoke", "regression" })
	public void TC_01_LoginWithValidData() {

		homePage = launch_TIC_Application();
		homePage = loginPage.login();

	}

	@Test(groups = { "smoke", "regression" })
	public void Tc_2_navigateToCavasPage_Create_UI() {

		homePage = launch_TIC_Application();
		canvasPage = homePage.openCanvas();
		canvasPage.createUI();
		//canvasPage.createService();
	}
	@Test(groups = { "smoke", "regression" })
	public void TC_3_create_Service() {
		homePage = launch_TIC_Application();
		canvasPage = homePage.openCanvas();
		canvasPage.createService();
	}
	
	
}
