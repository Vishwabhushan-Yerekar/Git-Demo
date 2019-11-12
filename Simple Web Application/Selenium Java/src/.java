package src;

import src.types.*;

public interface 
{
    
	public void setUp(String testcaseName);
	public void tearDown(String testcaseName);
	public void sleep(double time);
	public void log(String m);
	/** communication functions for  config interface */
	public void sendnullConfiguration_Message(nullConfiguration_Message argnullConfiguration_Message);

	/** GUI verification functions */
	public void verifynullLogin_screen(nullLogin_screen argnullLogin_screen);

	public void verifynullESD_Main_screen(nullESD_Main_screen argnullESD_Main_screen);

	public void verifynullError_popup(nullError_popup argnullError_popup);

	public void verifynullESD_Checkout_screen(nullESD_Checkout_screen argnullESD_Checkout_screen);

	/** GUI input functions  */
	public void fillnullFill__Login_screen(nullFill__Login_screen argnullFill__Login_screen);

	public void clicknullOK_button_Login_screen(nullOK_button_Login_screen argnullOK_button_Login_screen);

	public void fillnullFill__ESD_Main_screen(nullFill__ESD_Main_screen argnullFill__ESD_Main_screen);

	public void clicknullAdd_Item_button_ESD_Main_screen_Item_form(nullAdd_Item_button_ESD_Main_screen_Item_form argnullAdd_Item_button_ESD_Main_screen_Item_form);

	public void clicknullCheckout_button_ESD_Main_screen(nullCheckout_button_ESD_Main_screen argnullCheckout_button_ESD_Main_screen);

	public void clicknullRemove_item_button_ESD_Main_screen_Shopping_cart_table(nullRemove_item_button_ESD_Main_screen_Shopping_cart_table argnullRemove_item_button_ESD_Main_screen_Shopping_cart_table);

}
