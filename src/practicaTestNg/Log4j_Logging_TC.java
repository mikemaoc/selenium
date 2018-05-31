package practicaTestNg;

import java.util.concurrent.TimeUnit;

// Import Package Log4j.*

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import framework.utility.ExcelUtils;
import framework.utility.Log;
import tools.Constant;

public class Log4j_Logging_TC {

	private static WebDriver driver = null;

public static void main(String[] args) throws Exception {

	// Provide Log4j configuration settings

	DOMConfigurator.configure("log4j.xml");

	Log.startTestCase("Selenium_Test_001");

	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,Constant.File_sheet);

	Log.info(" Excel sheet opened");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\molvera\\Documents\\selenium\\geckodriverv0.19.1win64\\geckodriver.exe");

	driver = new FirefoxDriver();

	Log.info("New driver instantiated");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	Log.info("Implicit wait applied on the driver for 10 seconds");

	driver.navigate().to("http://www.store.demoqa.com");

	Log.info("Web application launched");

	SignIn_Action.Execute(driver);

	System.out.println("Login Successfully, now it is the time to Log Off buddy.");

	//Home_Page.lnk_LogOut(driver).click(); 

	Log.info("Click action is perfomred on Log Out link");

	driver.quit();

	Log.info("Browser closed");

	ExcelUtils.setCellData("CASO APROBADO", 1, 3);

	Log.endTestCase("Selenium_Test_001");
	

}
 
}