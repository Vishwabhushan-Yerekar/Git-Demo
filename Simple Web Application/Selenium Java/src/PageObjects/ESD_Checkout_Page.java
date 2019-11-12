package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ESD_Checkout_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Shopping_cart")
	public static WebElement Shopping_cart;

public static void verify_Shopping_cart(String data){
		Assert.assertEquals(Shopping_cart,Shopping_cart);
}

public static boolean verify_Shopping_cart_Status(String data){
		//Verifies the Status of the Shopping_cart
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(Shopping_cart.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(Shopping_cart.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!Shopping_cart.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void table_Shopping_cart(String data){
		Shopping_cart.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertEquals(data,data);
}
}