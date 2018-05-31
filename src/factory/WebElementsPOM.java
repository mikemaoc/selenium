package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tools.*;

public class WebElementsPOM extends Utilities{
	private static WebElement element = null;
	WebDriver driver;
	//@CacheLookup
	@FindBy(id="txtNombreUsuario") WebElement user;
	//@CacheLookup
	@FindBy(id="txtContrasena") WebElement pass;
	//@CacheLookup
	@FindBy(id="btnIngresar")
	static WebElement btnIngresar;
	@FindBy(id="mnuTile1326")
	static WebElement BtnNominas;
	//@CacheLookup
	@FindBy(xpath="//*[@id=\"btnUsuario\"]")
	static WebElement btnUsuario;
	@FindBy(xpath="//*[@id=\"btnCerrarSesion\"]")
	static WebElement btnCerrarSesion;
	
	
	//Constructor para inicializar elementos
	public WebElementsPOM(WebDriver dri) {
		this.driver = dri;
	}
	
	public void LoginMethod(String us, String pwd) {
		user.sendKeys(us);
		pass.sendKeys(pwd);
		btnIngresar.click();
		
	}
	
	
	
	
	public static WebElement BtnNominas(){
		element=BtnNominas; 
		return element;
	}
	
	
	public static WebElement btnUsuario(){
		element=btnUsuario; 
		return element;
	}
	

	public static WebElement btnCerrarSesion(){
		element=btnCerrarSesion; 
		return element;
	}

	
}
