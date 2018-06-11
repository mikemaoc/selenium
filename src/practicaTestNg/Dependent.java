package practicaTestNg;

import org.apache.log4j.Priority;
import org.testng.annotations.Test;
//http://toolsqa.com/selenium-webdriver/testng-introduction/
public class Dependent {
	 
	  @Test (dependsOnMethods = { "OpenBrowser" })
	 
	  public void SignIn() {
	 
		  System.out.println("This will execute second (SignIn)");
	 
	  }
	 
	  @Test
	 
	  public void OpenBrowser() {
	 
		  System.out.println("This will execute first (Open Browser)");
	 
	  }
	 
	  @Test (dependsOnMethods = { "SignIn" })
	 
	  public void LogOut() {
	 
		  System.out.println("This will execute third (Log Out)");
	 
	  }
}