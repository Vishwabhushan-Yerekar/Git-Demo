

package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Configurations{
	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	static Date date = new Date();
	static String timestamp = dateFormat.format(date);
	static String newChar = getNewString(timestamp);
	
	public static final String projectName = "Selenium Project";
	public static String browserType = "Mozilla";
	public static String screenshotLocation = "HTMLReports/"+newChar+"/";
	public static String htmlReportLocation = "HTMLReports/"+newChar+"/";
	public static String url = "";
	public static String hosturl = "";
	public static String deviceName = "";
	public static String platformVersion = "";
	
	public static  String getNewString(String newStr){
		String newString = newStr;
		String charectersToAvoid = "[;,`{}\"~=\\/:*?\"<>'|-+&^%$#@!]. ";
		for (int cnt = 0; cnt < charectersToAvoid.length(); cnt++) {
			newString  = newString.replace(charectersToAvoid.charAt(cnt), '_');
		}
		
		return newString;
	}
	
}
