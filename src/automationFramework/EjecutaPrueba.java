package automationFramework;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EjecutaPrueba {

	String user;  
	String pass;
    int i = 1;
	
	@FindBy(id="txtNombreUsuario") WebElement txtNombreUsuario;
	@FindBy(id="txtContrasena") WebElement txtContrasena;
	@FindBy(id="btnIngresar") WebElement btnIngresar;
	String url="http://192.168.13.142/NomifacilTest/Default.aspx";
	
@Test(priority=1, description="Este caso demuestra los pasos para acceder al sistema de nomina", testName="LOGIN NOMIFACIL")
public void Login() throws IOException{	
	WebDriver driver = new FirefoxDriver();		
	//buscamos la pagina
	driver.manage().window().maximize();
	//System.out.println("navegamos a la url: "+this.url); 
	Reporter.log("navegamos a la url: "+this.url);
	driver.navigate().to(this.url);	
	
EjecutaPrueba locateElements =  PageFactory.initElements(driver, EjecutaPrueba.class);


exampleOfWebDriverWait(driver,locateElements.txtNombreUsuario);
locateElements.txtNombreUsuario.click();
locateElements.txtNombreUsuario.clear();
locateElements.txtNombreUsuario.sendKeys(user);

//System.out.println("Se ingresa el usuario "+user);
Reporter.log("Se ingresa el usuario "+user);
exampleOfWebDriverWait(driver,locateElements.txtContrasena);
	//waitSeconds(1);
locateElements.txtContrasena.clear();
locateElements.txtContrasena.sendKeys(pass);
//System.out.println("Se ingresa el password "+pass);
Reporter.log("Se ingresa el password "+pass);
	//waitSeconds(1);
exampleOfWebDriverWait(driver,locateElements.btnIngresar);
//System.out.println("Se da clic en ingresar ");
Reporter.log("Se da clic en ingresar ");
waitSeconds(1);
takeScreenshoot(driver);
locateElements.btnIngresar.click();
waitSeconds(2);
takeScreenshoot(driver);
	AssertJUnit.assertTrue("Ocurrio un error al ingresar al sistema",driver.getPageSource().contains("Bienvenido al sistema de nómina")==true);
	//driver.quit();


}


public void waitSeconds(int secons) {
	System.out.print("Pausing for " + secons + " seconds: ");
	try {
		Thread.currentThread();		
		int x = 1;
		while(x <= secons) {
		Thread.sleep(1000);
		System.out.print(" " + x );
		x = x + 1;
		}
		System.out.print('\n');
	} catch (InterruptedException ex) {
		ex.printStackTrace();
	}	
}

public EjecutaPrueba() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\molvera\\Documents\\selenium\\geckodriverv0.19.1win64\\geckodriver.exe");
	//System.setProperty("org.uncommons.reportng.escape-output", "false");

	// TODO Auto-generated constructor stub
	user="denisse@mltic.com";
	pass="gobdigital2";
}
	
@Test(priority=2, description="este es un segundo caso vacio")
public void case2() {
	System.out.println("Segunda prueba xxx");
	AssertJUnit.assertEquals(11, 12);
}
	


public void exampleOfWebDriverWait(WebDriver driver, WebElement element) {  

    new WebDriverWait(driver, 10)
    .pollingEvery(2, TimeUnit.SECONDS)
    .withTimeout(10, TimeUnit.SECONDS)
    .until(ExpectedConditions.visibilityOf(element));
}




public   void takeScreenshoot(WebDriver driver) throws IOException
{
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now).toString().replace(":", "_").replace("/", "_"));  


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String rutaArch="C:\\Users\\molvera\\Documents\\selenium\\ScreenShoot\\IMAGE_NO"+i+"_"+dtf.format(now).toString().replace(":", "_").replace("/", "_")+".png";
      
    

	FileHandler.copy(scrFile,  new File(rutaArch));      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)
	i++;
	
	Reporter.log("<img src='"+rutaArch+"'/>");
}

}
