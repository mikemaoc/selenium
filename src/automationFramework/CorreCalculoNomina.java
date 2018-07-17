package automationFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import tools.Utilities;
import pageObjects.HomeNominas;
import pageObjects.Home_Page;

public class CorreCalculoNomina extends Utilities{

	WebDriver driver;
	String url="http://192.168.13.142/NomifacilTest/Default.aspx";
	String homeIndex="Home Page";
	String user="denisse@mltic.com", pwd="gobdigital2";
	String cia="1.-OPERARIOS";
	String anio="2018";
	String periodo="27 - 2018-07-03 - 2018-07-09 - ABIERTO";
	String rutaImagenes="C:\\Users\\molvera\\Documents\\selenium\\ScreenShoot";
	
@BeforeSuite  (description="Este metodo inicializa el navegador")
public void InicializaDriver() throws IOException{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\molvera\\eclipse-workspace\\SeleniumBatch\\lib\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
 	driver.navigate().to(url);	  
 	Reporter.log("se inicializa el navegador y se redirige a la url "+url);
 	takeScreenshoot(driver,rutaImagenes);
}

@Test (priority=1,description="Este caso de prueba navega al sistema e intenta loggearse")
public void IngresaSistema() throws IOException {	
	 
	//buscamos la pagina

	    driver.findElement(By.id("txtNombreUsuario")).click();
	    driver.findElement(By.id("txtNombreUsuario")).clear();
	    driver.findElement(By.id("txtNombreUsuario")).sendKeys(user);
		Reporter.log("Se ingresa el usuario "+user);
		takeScreenshoot(driver,rutaImagenes);
	    driver.findElement(By.id("txtContrasena")).clear();
	    driver.findElement(By.id("txtContrasena")).sendKeys(pwd);
	    Reporter.log("Se ingresa el pass "+pwd);
	    takeScreenshoot(driver,rutaImagenes);
	    Reporter.log("Clic en boton ingresar");
	    driver.findElement(By.id("btnIngresar")).click();	    

}



@Test (/*dependsOnMethods = { "IngresaSistema"}*/priority=2, description="Este caso de prueba comprueba la direccion del sistema")
public void compruebaUrl() throws IOException {
	String urlActual=driver.getTitle();
	//System.out.println("URL ACTUAL: "+urlActual);
	assertEquals(homeIndex, urlActual, "La url actual no corresponde a la pagina de inicio: "+urlActual);
	Reporter.log("la url actual es: "+urlActual);
	takeScreenshoot(driver,rutaImagenes);
}


@Test(/*dependsOnMethods = { "IngresaSistema", "compruebaUrl"}*/priority=3, description="Este caso de prueba comprueba el correcto acceso al sistema")
public void compruebaIngreso()throws InterruptedException, IOException {
	Thread.currentThread();
	Thread.sleep(3000);
	//assertTrue(driver.getPageSource().contains("Bienvenido"));
	Reporter.log("estatus de loggin: "+driver.getPageSource().contains("Bienvenido"));
	takeScreenshoot(driver,rutaImagenes);
	
}

@Test(/*dependsOnMethods = { "compruebaIngreso"}*/priority=4, description="Este caso de prueba accede al modulo de nominas y selecciona un periodo")
public void ConfiguraCalculo() throws IOException {
	waitSeconds(3);
	Home_Page.modNominas(driver).click();
	Reporter.log("Se ingresa al modulo de nominas");
	takeScreenshoot(driver,rutaImagenes);
	waitSeconds(3);
	HomeNominas.menuCalculo(driver).click();
	Reporter.log("Se camos clic en el menu de calculo");
	takeScreenshoot(driver,rutaImagenes);
	waitSeconds(3);
	HomeNominas.ComboTipoNomina(driver, cia);
	Reporter.log("Se selecciona la compañia: "+cia);
	takeScreenshoot(driver,rutaImagenes);
	waitSeconds(1);
	HomeNominas.ComboAnio(driver, anio);
	Reporter.log("Se selecciona el año: "+anio);
	takeScreenshoot(driver,rutaImagenes);
	waitSeconds(3);
	HomeNominas.ComboPeriodo(driver, periodo);	
	Reporter.log("Se selecciona el periodo: "+periodo);
	takeScreenshoot(driver,rutaImagenes);
	waitSeconds(3);
	HomeNominas.menuCalcularNomina(driver).click();
	Reporter.log("Damos clic en el menu calculo");
	takeScreenshoot(driver,rutaImagenes);
	waitSeconds(2);
	HomeNominas.radioTipoCalculo(driver, 2, "01003", rutaImagenes);	
	waitSeconds(10);
	takeScreenshoot(driver,rutaImagenes);
	
}



@AfterSuite (description="Este metodo cierra el navegador")
public void cierraPagina() {
    //driver.quit();
    Reporter.log("se cierra la pagina con exito");
}
	
	
	
}
