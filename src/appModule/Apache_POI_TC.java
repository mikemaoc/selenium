package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import tools.Constant;
import tools.ExcelUtils;
import tools.Utilities;

public class Apache_POI_TC extends Utilities {
	 
	private static WebDriver driver= null;

public static void main(String[] args) throws Exception {

//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
	System.out.println("Ruta: "+Constant.Path_TestData + Constant.File_TestData);
	System.out.println("sheet: "+"H1");
ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,Constant.File_sheet);

//se inicializa el driver
inicializaDriverProperty(Constant.DriverName,Constant.RutaDriv);
//se crea el objeto del navegador
driver = new FirefoxDriver();


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//driver.get(Constant.URL);
/*
String  url = ExcelUtils.getCellData(1, 0);
String  sUserName = ExcelUtils.getCellData(1, 1);
String sPassword = ExcelUtils.getCellData(1, 2);

SignIn_Action.Execute(driver, url, sUserName, sPassword);

System.out.println("Login Successfully, now it is the time to Log Off buddy.");
Home_Page.lnk_MyAccount(driver).click();
waitSeconds(2);
Home_Page.lnk_LogOut(driver).click(); 

driver.quit();

//This is to send the PASS value to the Excel sheet in the result column.

ExcelUtils.setCellData("CONGRATULATIONS!!!", 1, 3);
*/

for (int i=1; i<=4; i ++) {
	String  url = ExcelUtils.getCellData(i, 0);
	String  sUserName = ExcelUtils.getCellData(i, 1);
	String sPassword = ExcelUtils.getCellData(i, 2);	
	SignIn_Action.Execute(driver, url, sUserName, sPassword);

	System.out.println("Login test "+i+" Successfully, now it is the time to Log Off buddy.");
	Home_Page.lnk_MyAccount(driver).click();
	waitSeconds(2);
	Home_Page.lnk_LogOut(driver).click(); 
	if(i==4) {
		i=0;
	}
	ExcelUtils.setCellData("El loging del usuario es correcto !!!"+sUserName, i, 3);
}




}

}