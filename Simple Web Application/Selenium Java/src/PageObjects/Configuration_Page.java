package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Configuration_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "baseUrl")
	public static WebElement baseUrl;

public static void verify_baseUrl(String data){
		Assert.assertEquals(baseUrl,baseUrl);
}

public static boolean verify_baseUrl_Status(String data){
		//Verifies the Status of the baseUrl
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(baseUrl.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(baseUrl.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!baseUrl.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void field_baseUrl(String data){
		baseUrl.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertEquals(data,data);
}
}