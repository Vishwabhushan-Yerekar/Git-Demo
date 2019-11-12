package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ESD_Main_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "sku")
	public static WebElement sku;

public static void verify_sku(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(sku.getAttribute("value"),data);
	}

}

public static boolean verify_sku_Status(String data){
		//Verifies the Status of the sku
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(sku.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(sku.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!sku.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void set_sku(String data){
		sku.sendKeys(data);
}

@FindBy(how= How.ID, using = "qty")
	public static WebElement qty;

public static void verify_qty(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(qty.getAttribute("value"),data);
	}

}

public static boolean verify_qty_Status(String data){
		//Verifies the Status of the qty
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(qty.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(qty.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!qty.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void set_qty(String data){
		qty.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_Item")
	public static WebElement Add_Item;

public static void verify_Add_Item(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Add_Item.getAttribute("name"),data);
	}

}

public static boolean verify_Add_Item_Status(String data){
		//Verifies the Status of the Add_Item
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(Add_Item.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(Add_Item.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!Add_Item.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_Add_Item(){
		Add_Item.click();
}

@FindBy(how= How.ID, using = "Checkout")
	public static WebElement Checkout;

public static void verify_Checkout(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Checkout.getAttribute("name"),data);
	}

}

public static boolean verify_Checkout_Status(String data){
		//Verifies the Status of the Checkout
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(Checkout.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(Checkout.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!Checkout.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_Checkout(){
		Checkout.click();
}

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

@FindBy(how= How.ID, using = "Remove_item")
	public static WebElement Remove_item;

public static void verify_Remove_item(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Remove_item.getAttribute("name"),data);
	}

}

public static boolean verify_Remove_item_Status(String data){
		//Verifies the Status of the Remove_item
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				if(Remove_item.isEnabled())
					return true;
				break;
			case "VISIBLE":
				if(Remove_item.isDisplayed())
					return true;
				break;
			case "HIDDEN":
				if(!Remove_item.isDisplayed())
					return true;
				break;
			default:
				break;
			}
		}
		return false;
	}
public static void click_Remove_item(){
		Remove_item.click();
}

public static void verify_Text(String data){
	Assert.assertEquals(data,data);
}
}