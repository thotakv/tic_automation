package pageObjects;

import components.BaseClass;
import org.openqa.selenium.By;

/*
 * Class which contains the web elements and performs Home page activities (methods)
 *
 * Extends : BaseClass
 *
 * Author : Kavitha  (Kavitha.t@comakeit.com)
 */
public class CanvasPage extends BaseClass {

	// ****************** WEB ELEMENTS ****************************//
	
	public By link_login = By.xpath("//p[normalize-space()='Login']");	
	
	By node_UI = By.xpath("//div[contains(text(),'UI+Gateway')]");	
	By drop_place = By.xpath("//div[@class='react-flow__edgelabel-renderer']");
	
	By dragged_UI = By.xpath("//div[@role='button']//div[contains(text(),'UI+Gateway')]");
	
	By UI_application_Name = By.xpath("//input[@id='applicationName']");
	By UI_client_Framework = By.xpath("//select[@id='clientFramework']");
	By UI_package_Name = By.xpath("//input[@id='packageName']");
	By UI_serverPort = By.xpath("//input[@id='serverPort']");
	By UI_button_Sumbit = By.xpath("//button[normalize-space()='Submit']");
	   //** service web elements**//
	
	By node_Service= By.xpath(" //div[@class='dndnode output'][normalize-space()='Service']");
    By drop_place_service = By.xpath("//div[@class='react-flow__edgelabel-renderer']");
	
	By dragged_Service = By.xpath("//div[@role='button']//div[contains(text(),'Service')]");
	
	By Service_application_Name = By.xpath("//input[@id='applicationName']");
	By Service_client_Framework = By.xpath("  //select[@id='applicationFramework']");
	By Service_package_Name = By.xpath("//input[@id='packagename']");
	By Service_serverPort = By.xpath("//input[@id='serverport']");
	By Service_button_Sumbit = By.xpath("//button[normalize-space()='Submit']");
	   
	/*
	 * Method to navigate to Canvas Page
	 *
	 * Author : Kavitha Thota(Kavitha.t@comakeit.com)
	 */
	
	public void createUI() {
		//dragAndDrop(node_UI, drop_place);
		draganddropwithJSE(node_UI, drop_place);
		doubleClick(dragged_UI);
		enterText(UI_application_Name, "TestApp", "Application Name");
		selectDropdown(UI_client_Framework,"React", "Application Framework");
		enterText(UI_package_Name, "testPackage","Package Name");
		enterText(UI_serverPort, "1234","Server Port");
		clickOnButton(UI_button_Sumbit, "Submit button");
		
		
	}
	public void createService() {
		//dragAndDrop(node_Service, drop_place);
		draganddropwithJSE(node_Service, drop_place);
		doubleClick(dragged_Service);
		enterText(Service_application_Name, "TestApp", "Application Name");
		selectDropdown(Service_client_Framework,"Spring Boot", "Client Framework");
		enterText(Service_package_Name, "testPackage","Package Name");
		enterText(Service_serverPort, "1234","Server Port");
		clickOnButton(Service_button_Sumbit, "Submit button");
		

	}
	
}

 