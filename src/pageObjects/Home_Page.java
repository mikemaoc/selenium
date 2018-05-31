package pageObjects;

    import org.openqa.selenium.By;

    import org.openqa.selenium.WebDriver;

    import org.openqa.selenium.WebElement;

    

 public class Home_Page {

    private static WebElement element = null;
    

 public static WebElement lnk_MyAccount(WebDriver driver){

    element = driver.findElement(By.xpath("//*[@id=\"btnUsuario\"]"));

    return element;

    }

 public static WebElement lnk_LogOut(WebDriver driver){

    element = driver.findElement(By.xpath("//*[@id=\"btnCerrarSesion\"]"));

 return element;

    }

public static WebElement lnk_SignIn(WebDriver driver, String url) {
	// TODO Auto-generated method stub
	driver.navigate().to(url);
	System.out.println("Redirigimos a la Url: "+url);
	return element;
	    
	
}

//lista de modulos

public static WebElement modNominas(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("mnuTile1326"));//nominas
	return element;
	    
	
}


public static WebElement modRh(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("mnuTile1327"));//RH
	return element;
	    
	
}


public static WebElement modTya(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("mnuTile1330"));//Tya
	return element;	    
	
}


public static WebElement modHrr(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("mnuTile1345"));//Herramientas
	return element;	    
	
}


public static WebElement notificacionCumple(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("divAviso1"));//notificacion de cumpleaños
	return element;	    
	
}


public static WebElement notificacionAniversarioEmp(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("divAviso2"));//notificacion de Aniversario
	return element;	    
	
}

public static WebElement notificacionContratoVencido(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("divAviso3"));//notificacion de contrato vencido
	return element;	    
	
}


public static WebElement notificacionPeriodoBimestral(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("divAviso5"));//notificacion de periodo bimestral
	return element;	    
	
}


public static WebElement notificacionPeriodoTimbrado(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.id("divAviso4"));//notificacion de periodo timbrado
	return element;	    
	
}
}
 