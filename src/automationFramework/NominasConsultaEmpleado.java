package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import appModule.SignIn_Action;
import pageObjects.HomeNominas;
import pageObjects.Home_Page;
import pageObjects.ListadoEmpleados;
import tools.Constant;
import tools.Utilities;

public class NominasConsultaEmpleado extends Utilities{
	private static WebDriver driver = null;

	public static void main(String[] args) {

		inicializaDriverProperty(Constant.DriverName, Constant.RutaDriv);		
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		SignIn_Action.Execute(driver, Constant.URL, Constant.P_USER, Constant.P_PASS);
		Home_Page.modNominas(driver).click();
		waitSeconds(3);		
		ListadoEmpleados locateElements =  PageFactory.initElements(driver, ListadoEmpleados.class);		
		locateElements.buscaEmpleado("01003");				
		waitSeconds(2);
		locateElements.SeleccionaReg();
		waitSeconds(1);		
		HomeNominas.menuEmpleadosAbc(driver).click();
		waitSeconds(1);				
		locateElements.accedeHistorias();
		waitSeconds(2);
		locateElements.accedeTabHistorias("Salarios");
		waitSeconds(2);
		locateElements.Salir();
		waitSeconds(2);
		locateElements.Salir();
		waitSeconds(3);
		locateElements.buscaEmpleado("01012");				
		waitSeconds(2);
		locateElements.SeleccionaReg();
		waitSeconds(1);		
		HomeNominas.menuEmpleadosAbc(driver).click();
		waitSeconds(2);				
		locateElements.accedeHistorias();
		waitSeconds(2);
		locateElements.accedeTabHistorias("Salarios");
		waitSeconds(2);
		locateElements.Salir();
		waitSeconds(2);
		locateElements.Salir();
		waitSeconds(2);
		Home_Page.lnk_MyAccount(driver).click();
		waitSeconds(2);
		Home_Page.lnk_LogOut(driver).click();
		driver.close();
		
	}
}
