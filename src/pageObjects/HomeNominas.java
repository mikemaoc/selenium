package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import tools.Utilities;

public class HomeNominas extends Utilities {
	 private static WebElement element = null;

	 /* Menus de Empleados+submenus*/
	 public static WebElement menuEmpleados(WebDriver driver) {
		 element = driver.findElement(By.id("/html/body/form/div[6]/div/div[2]/div[1]/a[1]/span"));
		 return element;
	 }
	 
	 
	 public static WebElement menuEmpleadosAbc(WebDriver driver) {
		 element = driver.findElement(By.xpath("//*[@id=\"opSubmenu1257_lbl\"]"));
		 return element;
	 }
	 
	 public static WebElement menuEmpleadosArchivoIms(WebDriver driver) {
		 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[2]/div[2]/span"));
		 return element;
	 }
	 
	 public static WebElement menuEmpleadosProcEspeciales(WebDriver driver) {
		 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[3]/div[2]/span"));
		 return element;
	 }
	 
	 
	 public static WebElement menuEmpleadosSdiBim(WebDriver driver) {
		 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[4]/div[2]/span"));
		 return element;
	 }
	 
	 public static WebElement menuEmpleadosReportes(WebDriver driver) {
		 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[5]/div[2]/span"));
		 return element;
	 }
	 
	 
	 public static WebElement menuEmpleadosCardex(WebDriver driver) {
		 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[6]/div[2]/span"));
		 return element;
	 }
	 
	  public static WebElement OpcionesBusquedaEmp(WebDriver driver) {
		 element = driver.findElement(By.xpath("//*[@id=\"ui-accordion-resizable-header-0\"]"));
		 return element;
	 }
	  /* Fin Menus de Empleados+submenus*/
	  
	  /* Menus de Calculo+submenus*/
	  public static WebElement menuCalculo(WebDriver driver) {
			 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[1]/a[2]/span"));
			 return element;
	  }

	  public static WebElement menuCapExcepciones(WebDriver driver) {
			 element = driver.findElement(By.xpath("//*[@id=\"opSubmenu1324_lbl\"]"));
			 return element;
	  }
	  
	  public static WebElement menuPrenomina(WebDriver driver) {
			 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[2]/div[2]/span"));
			 return element;
	  }
	  
	  public static WebElement menuCalcularNomina(WebDriver driver) {
			 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[3]/div[2]/span"));
			 return element;
	  }
  
	  
	  public static WebElement menuListaRaya(WebDriver driver) {
			 element = driver.findElement(By.xpath("//*[@id=\"opSubmenu1266_lbl\"]"));
			 return element;
	  }
	  
	  public static WebElement menuTimbrado(WebDriver driver) {
			 element = driver.findElement(By.xpath("//*[@id=\"opSubmenu1268_lbl\"]"));
			 return element;
	  }
	  
	  public static WebElement menuBancos(WebDriver driver) {
			 element = driver.findElement(By.xpath("//*[@id=\"opSubmenu1298_lbl\"]"));
			 return element;
	  }
	  
	  public static WebElement menuRecibos(WebDriver driver) {
			 element = driver.findElement(By.xpath("//*[@id=\"opSubmenu1298_lbl\"]"));
			 return element;
	  }
	  
	  public static WebElement menuMasOpciones(WebDriver driver) {
			 element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div[2]/div/a[8]/span"));
			 return element;
	  }

	  public static WebElement menuMasOpcionesReportesNomina(WebDriver driver) {
			 element = driver.findElement(By.xpath("/html/body/div[10]/div[1]/div[2]/div/a/div[2]/span"));
			 return element;
	  }
	  
	  /* fin menus calculo+submenus*/
	  
	  /*combos de seguridad*/
	  
	  //new Select(cboSexo).selectByVisibleText(PcboSexo);
	  public static void ComboTipoNomina(WebDriver driver, String opcion) {
			 element = driver.findElement(By.xpath("//*[@id=\"cmbCias\"]"));
			 new Select(element).selectByVisibleText(opcion);
	  }
	  
	  public static void ComboAnio(WebDriver driver, String opcion) {
			 element = driver.findElement(By.xpath("//*[@id=\"cmbAnio\"]"));
			 new Select(element).selectByVisibleText(opcion);
	  }
	  
	  public static void ComboPeriodo(WebDriver driver, String opcion) {
			 element = driver.findElement(By.xpath("//*[@id=\"comboPeriodo\"]"));
			 new Select(element).selectByVisibleText(opcion);
	  }
	  
	  
	  public static void radioTipoCalculo(WebDriver driver, int opcion, String noempx, String ruta) throws IOException {
		  switch(opcion) {
		  case 1:
			  element = driver.findElement(By.xpath("//*[@id=\"rbTotal\"]"));//total
			  takeScreenshoot(driver,ruta);
			  waitSeconds(1);
			  element.click();
			  waitSeconds(1);
			  element = driver.findElement(By.xpath("//*[@id=\"btCalcular\"]"));//btncalcular
			  waitSeconds(1);
			  element.click();
			  Reporter.log("Se ejecuta calculo general");
			  takeScreenshoot(driver,ruta);
			  break;
		  case 2:
			  element = driver.findElement(By.xpath("//*[@id=\"rbIndividual\"]"));//individual
			  waitSeconds(1);
			  element.click();
			  Reporter.log("Se ejecuta calculo individual");
			  takeScreenshoot(driver,ruta);
			  waitSeconds(1);
			  element = driver.findElement(By.xpath("//*[@id=\"btCalcular\"]"));//btncalcular
			  element.click();
			  takeScreenshoot(driver,ruta);
			  waitSeconds(3);
			  element = driver.findElement(By.xpath("//*[@id=\"txtClave\"]"));//busqueda Emp
			  waitSeconds(2);
			  element.sendKeys(noempx,Keys.RETURN);
			  takeScreenshoot(driver,ruta);
			  waitSeconds(2);
			  element=driver.findElement(By.xpath("//*[@id=\"btGuardarCalcInd\"]"));//btnGuardar
			  waitSeconds(2);
			  element.click();
			  waitSeconds(2);
			  element = driver.findElement(By.xpath("//*[@id=\"btCalcular\"]"));//btncalcular
			  waitSeconds(2);
			  element.click();
			  Reporter.log("Se ejecuta calculo individual para el empleado: "+noempx);
			  takeScreenshoot(driver,ruta);
			  break;
			  default:
			  System.out.println("Seleccione una opcion correcta: 1 para calculo total [noemp no es requerido puede ir '''' ''''], 2 para calculo individual[ llenar noemp requerido]");
			
		  }
			 
			 
	  }
	  
	  
	  ////*[@id="rbTotal"]

}


