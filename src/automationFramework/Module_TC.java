package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;
import pageObjects.Home_Page;
import tools.Utilities;
import tools.Constant;

public class Module_TC extends Utilities {

    private static WebDriver driver = null;

 public static void main(String[] args) {

	  
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\molvera\\Documents\\selenium\\geckodriverv0.19.1win64\\geckodriver.exe");
		  driver = new FirefoxDriver();	

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	   

    // Use your Module SignIn now
	    
    SignIn_Action.Execute(driver, Constant.URL,Constant.P_USER, Constant.P_PASS);  
    waitSeconds(3);
    Home_Page.lnk_MyAccount(driver).click();;
    waitSeconds(2);
    
    Home_Page.lnk_LogOut(driver).click();

    driver.quit();

 }
}
