package practicaTestNg;

import org.openqa.selenium.*;

import framework.utility.Log;

public class LogIn_Page {

	static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver){

    element = driver.findElement(By.id("log"));

	Log.info("Username text box found");

    return element;

    }

public static WebElement txtbx_Password(WebDriver driver){

    element = driver.findElement(By.id("pwd"));

	Log.info("Password text box found");

    return element;

    }

public static WebElement btn_LogIn(WebDriver driver){

    element = driver.findElement(By.id("login"));

	Log.info("Submit button found");

    return element;

    }

}