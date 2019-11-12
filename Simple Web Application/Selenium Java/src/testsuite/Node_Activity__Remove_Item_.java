package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;


/** Conformiq generated test case
	Node_Activity__Remove_Item_
*/
public class Node_Activity__Remove_Item_ extends PageObjectBase
{

	public Node_Activity__Remove_Item_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test
	public void test() throws Exception
	{

	Login_Page login_page_init=PageFactory.initElements(driver, Login_Page.class);

	ESD_Main_Page esd_main_page_init=PageFactory.initElements(driver, ESD_Main_Page.class);

	Configuration_Page configuration_page_init=PageFactory.initElements(driver, Configuration_Page.class);

	ESD_Checkout_Page esd_checkout_page_init=PageFactory.initElements(driver, ESD_Checkout_Page.class);

	Error_Page error_page_init=PageFactory.initElements(driver, Error_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__Remove_Item_", "TC_Node_Activity__Remove_Item_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Send Configuration Message");

	testReport.fillTableStep("Step 1", "Send Configuration Message");

	configuration_page_init.field_baseUrl("esd.conformiq.com");

	Reporter.log("Step - 2- verify Login screen");

	testReport.fillTableStep("Step 2", "verify Login screen");

	login_page_init.verify_userName_Status("Dont care");
	login_page_init.verify_userName("Dont care");
	login_page_init.verify_password_Status("Dont care");
	login_page_init.verify_password("Dont care");
	login_page_init.verify_OK_Status("Dont care");
	login_page_init.verify_OK("OK");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_2");

	Reporter.log("Step - 3- Fill UserInfo form Login screen");

	testReport.fillTableStep("Step 3", "Fill UserInfo form Login screen");

	login_page_init.set_userName("Armen");
	login_page_init.set_password("123");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_3");

	Reporter.log("Step - 4- click OK button Login screen");

	testReport.fillTableStep("Step 4", "click OK button Login screen");

	login_page_init.click_OK();
	login_page_init.click_OK();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_4");

	Reporter.log("Step - 5- verify ESD Main screen");

	testReport.fillTableStep("Step 5", "verify ESD Main screen");

	esd_main_page_init.verify_sku_Status("ENABLED");
	esd_main_page_init.verify_sku("Dont care");
	esd_main_page_init.verify_qty_Status("ENABLED");
	esd_main_page_init.verify_qty("Dont care");
	esd_main_page_init.verify_Add_Item_Status("ENABLED");
	esd_main_page_init.verify_Add_Item("Add_Item");
	esd_main_page_init.verify_Checkout_Status("Dont care");
	esd_main_page_init.verify_Checkout("Checkout");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_5");

	Reporter.log("Step - 6- Fill Item form ESD Main screen");

	testReport.fillTableStep("Step 6", "Fill Item form ESD Main screen");

	esd_main_page_init.set_sku("CQ_0001");
	esd_main_page_init.set_qty("5");
	esd_main_page_init.click_Add_Item();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_6");

	Reporter.log("Step - 7- click Add Item button ESD Main screen Item form");

	testReport.fillTableStep("Step 7", "click Add Item button ESD Main screen Item form");

	esd_main_page_init.click_Add_Item();
	esd_main_page_init.click_Add_Item();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_7");

	Reporter.log("Step - 8- verify ESD Main screen");

	testReport.fillTableStep("Step 8", "verify ESD Main screen");

	esd_main_page_init.verify_sku_Status("ENABLED");
	esd_main_page_init.verify_sku("Dont care");
	esd_main_page_init.verify_qty_Status("ENABLED");
	esd_main_page_init.verify_qty("Dont care");
	esd_main_page_init.verify_Add_Item_Status("ENABLED");
	esd_main_page_init.verify_Add_Item("Add_Item");
	esd_main_page_init.verify_Checkout_Status("Dont care");
	esd_main_page_init.verify_Checkout("Checkout");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_8");

	Reporter.log("Step - 9- click Remove item button ESD Main screen Shopping cart table");

	testReport.fillTableStep("Step 9", "click Remove item button ESD Main screen Shopping cart table");

	esd_main_page_init.click_Remove_item();
	esd_main_page_init.set_sku("CQ_0001");
	esd_main_page_init.set_qty("5");
	esd_main_page_init.click_Remove_item();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_9");

	Reporter.log("Step - 10- verify ESD Main screen");

	testReport.fillTableStep("Step 10", "verify ESD Main screen");

	esd_main_page_init.verify_sku_Status("ENABLED");
	esd_main_page_init.verify_sku("Dont care");
	esd_main_page_init.verify_qty_Status("ENABLED");
	esd_main_page_init.verify_qty("Dont care");
	esd_main_page_init.verify_Add_Item_Status("ENABLED");
	esd_main_page_init.verify_Add_Item("Add_Item");
	esd_main_page_init.verify_Checkout_Status("Dont care");
	esd_main_page_init.verify_Checkout("Checkout");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__Remove_Item_","Step_10");
	}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__Remove_Item_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
