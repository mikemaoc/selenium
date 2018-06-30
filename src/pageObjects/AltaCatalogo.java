package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tools.Utilities;

public class AltaCatalogo extends Utilities {

	WebDriver driver=null;
	//MAPEO DE ELEMENTOS
	@FindBy(xpath="//*[@id=\"cboCatNom\"]") 
	 WebElement cboCatNom;
	
	
	@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr[2]/td/div[1]/div[5]/div/table/tbody/tr/td[1]/table/tbody/tr/td[6]/div")
	 WebElement btnAlta;

	@FindBy(xpath="//*[@id=\"jqg1_CveArea\"]")
	 WebElement clave;
	
	@FindBy(xpath="//*[@id=\"jqg1_DesArea\"]")
	 WebElement descripcion;
	
	@FindBy(xpath="//*[@id=\"jqg1_CNTA1\"]")
	 WebElement cuenta;
	
	@FindBy(xpath="//*[@id=\"jqg1_StatusB\"]")
	 WebElement cboStatus;
	
	@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr[2]/td/div[1]/div[5]/div/table/tbody/tr/td[1]/table/tbody/tr/td[8]/div")
	 WebElement btnGuardar;
	
	@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr[2]/td/div[1]/div[5]/div/table/tbody/tr/td[1]/table/tbody/tr/td[9]/div/span")
	 WebElement btnCancelar;
	
	@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr[2]/td/div[1]/div[5]/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/img")
	 WebElement btnExportaPdf;
	@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr[2]/td/div[1]/div[5]/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/img")
	 WebElement btnExportaExcel;
	
	//ACCIONES A REALIZAR CON LOS ELEMENTOS MAPEADOS
	public   void seleccionaCatalogo(WebDriver driv,String Pcatalogo) {
		System.out.println(""+Pcatalogo+" ->");
		
		
		exampleOfWebDriverWaitCombos(driv, cboCatNom);
		
		new Select(cboCatNom).selectByVisibleText(Pcatalogo);
		    
		
	}
	
	public   void capturaDatos(WebDriver driv, String Pclave, String Pdescripcion, String Pcuenta, String Pstatus) {
		
		exampleOfWebDriverWait(this.driver, clave);
		
		clave.sendKeys(Pclave);
		//waitSeconds(1);
		exampleOfWebDriverWait(this.driver, descripcion);
		
		descripcion.sendKeys(Pdescripcion);
		//waitSeconds(1);
				exampleOfWebDriverWait(this.driver, cuenta);
		
		cuenta.sendKeys(Pcuenta);
		//waitSeconds(3);
		exampleOfWebDriverWait(driv, cboStatus);
		
		new Select(cboStatus).selectByVisibleText(Pstatus);
		//waitSeconds(1);
	}
	
	public  void alta() {
		
		btnAlta.click();	
	}
	
	public  void guardar() {

		btnGuardar.click();
		//waitSeconds(2);
		if(validaCamposVacios()==true) {
			System.out.println("exitoso");
        Assert.assertTrue("prueba satisfactoria, se valida guardado exitoso",validaCamposVacios()==true);
		}else {
			System.out.println("fracasa");
				Assert.assertFalse("Prueba satisfactoria, se validan datos requeridos",validaCamposVacios()==false);
		}				
		//driver.close();
		
		
		//waitSeconds(1);
		
	}
	
	public  void cancelar() {
		btnCancelar.click();
	}
	
	public  void ExportaPdfExcel(String tipo) {
		try {
		int t = Integer.parseInt(tipo);
		if(t==1) {
			btnExportaExcel.click();
			
		}else if (t==2)
		{
			btnExportaPdf.click();
			
		}
		}catch(Exception e) {
			System.out.println("Verifique el parametro para exportacion en excel ingrese 1 y para pdf ingrese 2");
		}
	}
	
	public boolean validaCamposVacios() {
		boolean flag = true;
		if(driver.getPageSource().contains("Campo obligatorio")) {
			flag=false;
		}
		if(driver.getPageSource().contains("El registro se ha guardado correctamente.")) {
			flag=true;
		}
		return flag;
	}
	
	
	
	public void testCatalogo(WebDriver dri) {		
		WebElement myDynamicElement = (new WebDriverWait(dri, 100))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cboCatNom\"]")));
		waitSeconds(2);
		new Select(myDynamicElement).selectByVisibleText("Catálogo de Áreas");
		
	}
	
	
	//SE INICILIZA EÑ DRIVER CON EL CONSTRUCTOR
		public AltaCatalogo(WebDriver dri) {
			this.driver = dri;
			//dri.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		}
		
}




