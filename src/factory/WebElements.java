package factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tools.*;

public class WebElements extends Utilities{
	WebDriver driver;
	//@CacheLookup
	@FindBy(id="txtNombreUsuario") WebElement user;
	//@CacheLookup
	@FindBy(id="txtContrasena") WebElement pass;
	//@CacheLookup
	@FindBy(id="btnIngresar") WebElement btnIngresar;
	@FindBy(id="mnuTile1326") WebElement BtnNominas;
	//@CacheLookup
	@FindBy(xpath="//*[@id=\"btnUsuario\"]") WebElement btnUsuario;
	@FindBy(xpath="//*[@id=\"btnCerrarSesion\"]") WebElement btnCerrarSesion;
	
	
	//Constructor para inicializar elementos
	public WebElements(WebDriver dri) {
		this.driver = dri;
	}
	
	public void LoginMethod(String us, String pwd) {
		user.sendKeys(us);
		pass.sendKeys(pwd);
		btnIngresar.click();
		assertTrue("TEST CASE FAILURE: verifique usuario del sistema", driver.getPageSource().contains("Bienvenido"));
		assertEquals("Bienvenido", "Bienvenido");
		waitSeconds(3);
		BtnNominas.click();
		waitSeconds(3);
		btnUsuario.click();
		waitSeconds(3);
		btnCerrarSesion.click();
	}
	
}
