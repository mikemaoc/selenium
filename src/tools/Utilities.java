package tools;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Utilities {

    static int i=0;	

//metodo para espera explicita forzando click con javascript
public static void ExplicitWait(WebDriver driver, By by, int time, String op) {
(new WebDriverWait(driver,time))
.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	
System.out.println("se busca el elemento"+by);
WebElement element= driver.findElement(by);
	switch(op) {
	case "click":			
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	break;
	case "espera":
	
	//((JavascriptExecutor) driver).executeScript("arguments[0].sendkeys('algo');", element);
	
	
	break;
	
	}

}
//metodo para pausar
public static void waitSeconds(int secons) {
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

public static void clickElementWithJSE( String id,WebElement driver ) {
	//Create the object of JavaScript Executor 
	//click command through Javascript
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement element= driver.findElement( By.id( id ) );
	//Use any locator type using to identify the element
	js.executeScript( "arguments[0].click();", element );
	js = null;
}

public static void waitForPageToLoad(WebElement driver) {
	String pageLoadStatus = "";
	do {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		pageLoadStatus = (String)js.executeScript("return document.readyState");
		System.out.print(".");
	} while ( !pageLoadStatus.equals("complete") );
	System.out.println();
	System.out.println("Page Loaded.");
}

//metodo para buscar en combos desplegables la opcion
public static void seleccionaCombos(WebDriver driver, By by, String option)
{
try {
  new Select(driver.findElement(by)).selectByVisibleText(option);  
}catch(Exception e) {
  System.out.println("elemento no existente "+e);
}

}
//METODO PARA SELECCIONAR ELEMENTOS DE TIPO datapicker
public static void seleccionaFecha(WebDriver driver, By by, String val)
{
	try {
	  WebElement element= driver.findElement(by);
		
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + val +"'"), element); 
	}catch(Exception e) {
	  System.out.println("elemento no existente "+e);
	}
}

//METODO PARA NAVEGAR A VENTANAS
public static void  inicializaDriver( WebDriver driver,String url) {
	//buscamos la pagina
		driver.manage().window().maximize();
		 driver.navigate().to(url);	

}


//METODO PARA UN LOGIN A UNA APLICACION
public static void ingresar(WebDriver driver, String caja1, String caja2, String botonIngresar, String val1, String val2) {
	try {
		driver.findElement(By.id(caja1)).click();
		driver.findElement(By.id(caja1)).clear();
		driver.findElement(By.id(caja1)).sendKeys(val1);
		driver.findElement(By.id(caja2)).clear();
		driver.findElement(By.id(caja2)).sendKeys(val2);
		driver.findElement(By.id(botonIngresar)).click();
		System.out.println("Ingresa pagina principal");
	}catch(Exception e) {
		System.out.println("ocurrio un error: "+e);
	}
}



//METODO QUE VALIDA SI LA PRUEBA PASA O NO EN BASE A UN MENSAJE DESPLEGADO
public static void success(WebDriver driver, String message) {
	if(driver.getPageSource().contains(message)==true){
		System.out.println("Test Passed");
	}else {
		System.out.println("Test Not Passed");
	}
	
}

public static void inicializaDriverProperty(String driverName, String RutaDriv) {
	System.setProperty(driverName,RutaDriv);
}

//metodo para cargar elementos

public void exampleOfWebDriverWait(WebDriver driver, WebElement element) {  

    new WebDriverWait(driver, 10)    
    .withTimeout(5, TimeUnit.SECONDS)
    .pollingEvery(2, TimeUnit.SECONDS)
    .ignoring(NoSuchElementException.class)
    .until(ExpectedConditions.visibilityOf(element));
}

@SuppressWarnings({ "deprecation", "unchecked" })
public void exampleOfWebDriverWaitCombos(WebDriver driver, WebElement element) {  

	try {
       
		WebDriverWait wait = new WebDriverWait(driver, 50, 9000);
        ((FluentWait<WebDriver>) wait).withTimeout(30, TimeUnit.SECONDS);
        ((FluentWait<WebDriver>) wait).pollingEvery(5, TimeUnit.SECONDS);
        ((FluentWait<WebDriver>) wait).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
        
    } catch (Exception ex) {
        throw new RuntimeException("Failed clicking on element %s"+ex);
    }

}

public void waitForPageLoaded(WebDriver driver) {
   /* ExpectedCondition<Boolean> expectation = new
            ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                }
            };
    try {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(expectation);
    } catch (Throwable error) {
        Assert.fail("Timeout waiting for Page Load Request to complete.");
    }*/
	ExpectedCondition<Boolean> pageLoadCondition = new
            ExpectedCondition<Boolean>() {
                @Override
				public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                }
            };
    WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(pageLoadCondition);
}


public static  void takeScreenshoot(WebDriver driver) throws IOException
{
    Date d = new Date(0);
    System.out.println(d.toString());


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	FileHandler.copy(scrFile,  new File("C:\\Users\\molvera\\Documents\\selenium\\ScreenShoot\\image"+sdf.format(d)+"_"+i+".png"));      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)
	i++;
}






}


