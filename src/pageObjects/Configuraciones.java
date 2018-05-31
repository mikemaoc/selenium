package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Configuraciones {
	 private static WebElement element = null;
	 
	 
	 public static WebElement menuConfiguracion(WebDriver driver) {
		 element = driver.findElement(By.xpath("//*[@id=\"btnConfiguracion\"]"));
		 return element;
	 }
	 
	 public static WebElement menuCatalogos(WebDriver driver) {
		 element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/a[6]/div/span[1]"));
		 return element;
		 
	 }
	 
}
