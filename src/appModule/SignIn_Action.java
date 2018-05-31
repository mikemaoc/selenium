package appModule;






import org.openqa.selenium.WebDriver;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import tools.Utilities;

public class SignIn_Action extends Utilities {


		 
	     public static void Execute(WebDriver driver,String url, String sUsername, String sPassword){
	    	Home_Page.lnk_SignIn(driver, url);	    		        
	        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
	        waitSeconds(1);
	        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
	        waitSeconds(1);
	        LogIn_Page.btn_LogIn(driver).click();
	        waitSeconds(3);
	        
	        
	        
	 
	     }
}
