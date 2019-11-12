package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Login_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "MenuBar")
	public static WebElement MenuBar;

public static void verify_MenuBar(String data){
		Assert.assertEquals(MenuBar,MenuBar);
}

public static boolean verify_MenuBar_Status(String data){
		//Verifies the Status of the MenuBar
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(MenuBar.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(MenuBar.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!MenuBar.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_MenuBar(){
		MenuBar.click();
}

@FindBy(how= How.ID, using = "File")
	public static WebElement File;

public static void verify_File(String data){
		Assert.assertEquals(File,File);
}

public static boolean verify_File_Status(String data){
		//Verifies the Status of the File
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(File.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(File.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!File.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_File(){
		File.click();
}

@FindBy(how= How.ID, using = "Save")
	public static WebElement Save;

public static void verify_Save(String data){
		Assert.assertEquals(Save,Save);
}

public static boolean verify_Save_Status(String data){
		//Verifies the Status of the Save
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(Save.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(Save.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!Save.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_Save(){
		Save.click();
}

@FindBy(how= How.ID, using = "Help")
	public static WebElement Help;

public static void verify_Help(String data){
		Assert.assertEquals(Help,Help);
}

public static boolean verify_Help_Status(String data){
		//Verifies the Status of the Help
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(Help.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(Help.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!Help.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_Help(){
		Help.click();
}

@FindBy(how= How.ID, using = "userName")
	public static WebElement userName;

public static void verify_userName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(userName.getAttribute("value"),data);
	}

}

public static boolean verify_userName_Status(String data){
		//Verifies the Status of the userName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(userName.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(userName.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!userName.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void set_userName(String data){
		userName.sendKeys(data);
}

@FindBy(how= How.ID, using = "password")
	public static WebElement password;

public static void verify_password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(password.getAttribute("value"),data);
	}

}

public static boolean verify_password_Status(String data){
		//Verifies the Status of the password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(password.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(password.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!password.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void set_password(String data){
		password.sendKeys(data);
}

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