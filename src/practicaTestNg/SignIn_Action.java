package practicaTestNg;



import org.openqa.selenium.WebDriver;

import practicaTestNg.Home_Page;

import practicaTestNg.LogIn_Page;
import tools.Utilities;
import framework.utility.ExcelUtils;

import framework.utility.Log;

public class SignIn_Action extends Utilities {

public static void Execute(WebDriver driver) throws Exception{

	String sUserName = ExcelUtils.getCellData(1, 1);

	Log.info("Username picked from Excel is "+ sUserName );

	String sPassword = ExcelUtils.getCellData(1, 2);


	Log.info("Password picked from Excel is "+ sPassword );
	Home_Page.lnk_MyAccount(driver).click();


	Log.info("Click action performed on My Account link");
	LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

	Log.info("Username entered in the Username text box");
	//	waitSeconds(1);
	LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

	Log.info("Password entered in the Password text box");
	//waitSeconds(1);
	LogIn_Page.btn_LogIn(driver).click();
	Log.info("Click action performed on Submit button");


	


}

}