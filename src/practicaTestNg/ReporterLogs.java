package practicaTestNg;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogs {
	 
	private static WebDriver driver;
 
	private static Logger Log = Logger.getLogger(Log.class.getName());
 
    @Test
 
	public static void test() {
 
		DOMConfigurator.configure("log4j.xml");
 
        driver = new FirefoxDriver();
 
        Log.info("New driver instantiated");
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        Log.info("Implicit wait applied on the driver for 10 seconds");
 
        driver.get("http://www.store.demoqa.com");
 
        Log.info("Web application launched");
 
        // Our first step is complete, so we produce a main event log here for our reports.
 
        Reporter.log("Application Lauched successfully | ");
 
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
        Log.info("Click action performed on My Account link");
 
        driver.findElement(By.id("log")).sendKeys("testuser_1");
 
        Log.info("Username entered in the Username text box");
 
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
        Log.info("Password entered in the Password text box");
 
        driver.findElement(By.id("login")).click();
 
        Log.info("Click action performed on Submit button");
 
        // Here we are done with our Second main event
 
        Reporter.log("Sign In Successful | " );
 
        //driver.findElement(By.id("account_logout"));
 
        Log.info("Click action performed on Log out link");
 
       // driver.quit();
 
        Log.info("Browser closed");
 
        // This is the third main event
 
        Reporter.log("User is Logged out and Application is closed | ");
 
	}
    public ReporterLogs() {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\molvera\\Documents\\selenium\\geckodriverv0.19.1win64\\geckodriver.exe");
    } 
}
