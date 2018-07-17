package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import tools.Utilities;

public class ListadoEmpleados extends Utilities{
	WebDriver driver;

	@FindBy(id="gs_No.Emp") WebElement noEmpleado;	
	@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr/td/div/div[3]/div[3]/div/table/tbody/tr[2]/td[6]") WebElement seleccionaRegistro;
	@FindBy(id="btnHistorias") WebElement btnHistorias;
	//@FindBy(id="ui-id-29") WebElement tabHistoriaEmpleado;
	@FindBy(linkText="Historia del Empleado")  WebElement tabHistoriaEmpleado;
	@FindBy(id="cboCatHistoria")  WebElement cboCatHistoria;
	
	
	@FindBy(id="btnCerrar")  WebElement btnCerrar;
	
	
	
	public void buscaEmpleado(String noempx) {
		noEmpleado.sendKeys(noempx, Keys.RETURN);
		
		
		
	}
	
	public void SeleccionaReg() {
		seleccionaRegistro.click();
	}
	
	public void accedeHistorias() {
		btnHistorias.click();
	}
	
	public void accedeTabHistorias(String PcboCatHistoria) {
		tabHistoriaEmpleado.click();
		System.out.println("entra al ");
		new Select(cboCatHistoria).selectByVisibleText(PcboCatHistoria);
	}
	
	public void Salir() {
		btnCerrar.click();
		
	}
	
	public ListadoEmpleados(WebDriver dri) {
		this.driver = dri;
	}
	
}
