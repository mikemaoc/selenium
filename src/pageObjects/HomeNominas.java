package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeNominas {
	 private static WebElement element = null;
	 
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
}

