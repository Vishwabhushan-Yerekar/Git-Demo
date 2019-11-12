package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Error_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "OK")
	public static WebElement OK;

public static void verify_OK(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OK.getAttribute("name"),data);
	}

}

public static boolean verify_OK_Status(String data){
		//Verifies the Status of the OK
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(OK.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(OK.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!OK.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_OK(){
		OK.click();
}

public static void verify_Text(String data){
	Assert.assertEquals(data,data);
}
}