package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import tools.*;


public class PageObjectModel extends Utilities{

    private static WebDriver driver = null;

  public static void main(String[] args) {
	  boolean bandera = false;
    
    System.setProperty("webdriver.gecko.driver","C:\\Users\\molvera\\Documents\\selenium\\geckodriverv0.19.1win64\\geckodriver.exe");
	  driver = new FirefoxDriver();	

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.navigate().to("http://192.168.13.142/LoginTest/ingresar.aspx");
    waitSeconds(2);
    // Use page Object library now

   

    LogIn_Page.txtbx_UserName(driver).sendKeys("denisse@mltic.com");
    waitSeconds(1);

    LogIn_Page.txtbx_Password(driver).sendKeys("gobdigital2");
    waitSeconds(1);

    
    LogIn_Page.btn_LogIn(driver).click();
    waitSeconds(3);
    bandera = driver.getPageSource().contains("denisse@mltic.com");
//Assert.assertEquals("Home age", driver.getTitle());
    //Assert.assertTrue("Login OK", false);
   
   
    Home_Page.lnk_MyAccount(driver).click();
     
    waitSeconds(2);
 Home_Page.lnk_LogOut(driver).click(); 

    //driver.quit();

    }

}