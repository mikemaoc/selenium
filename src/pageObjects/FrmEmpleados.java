package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import tools.Utilities;

public class FrmEmpleados extends Utilities{

	
	WebDriver driver;
	
	
	
	@FindBy(id="txtPaterno") WebElement txtPaterno;
	@FindBy(id="txtMaterno") WebElement txtMaterno;	
	@FindBy(id="txtNombre") WebElement txtNombre;
	@FindBy(id="dtpFechaNacimiento") WebElement dtpFechaNacimiento;
	@FindBy(id="dtpFechaAlta") WebElement dtpFechaAlta;
	@FindBy(id="txtAntiguedad") WebElement txtAntiguedad;
	@FindBy(id="txtAntMM") WebElement txtAntMM;
	@FindBy(id="txtAntDD") WebElement txtAntDD;
	
	
	

	@FindBy(id="txtRfc") WebElement txtRfc;
	@FindBy(id="cboSexo") WebElement cboSexo;
	@FindBy(id="cboEstadoNac") WebElement cboEstadoNac;
	@FindBy(id="txtLugarNac") WebElement txtLugarNac;
	@FindBy(id="txtCurp") WebElement txtCurp;
	@FindBy(id="txtNss") WebElement txtNss;
	@FindBy(id="cboEdoServicio") WebElement cboEdoServicio;
	@FindBy(id="cboSindicalizado") WebElement cboSindicalizado;
	@FindBy(id="cboTurno") WebElement cboTurno;
	@FindBy(id="cboCategoria") WebElement cboCategoria;
	@FindBy(id="cboTipoSalario") WebElement cboTipoSalario;
	@FindBy(id="cboTipoContratoSat") WebElement cboTipoContratoSat;
	@FindBy(id="cboTipoPago") WebElement cboTipoPago;
	@FindBy(id="cboJornada") WebElement cboJornada;
	@FindBy(id="cboTipoContrato") WebElement cboTipoContrato;
	@FindBy(id="cboBanco") WebElement cboBanco;
	@FindBy(id="txtCuenta") WebElement txtCuenta;
	@FindBy(id="txtNoTarjeta") WebElement txtNoTarjeta;
	
	
	
	
	/*ASIGNACION DE EMPLEADOS*/		
	@FindBy(id="ui-accordion-accSecciones-header-1") WebElement acordAsignaEmp;
	@FindBy(id="cboPlanta") WebElement cboPlanta;
	@FindBy(id="cboHorario") WebElement cboHorario;	
	@FindBy(id="cboTipoTrabajo") WebElement cboTipoTrabajo;
	@FindBy(id="cboDepartamento") WebElement cboDepartamento;
	@FindBy(id="cboLinea") WebElement cboLinea;
	@FindBy(id="cboCentroCosto") WebElement cboCentroCosto;
	@FindBy(id="cboPuesto") WebElement cboPuesto;
	@FindBy(id="cboSupervisor") WebElement cboSupervisor;
	@FindBy(id="cboArea") WebElement cboArea;
	
	@FindBy(id="ui-accordion-accSecciones-header-2") WebElement acordDatPersonal;
	@FindBy(id="cboEstadoCivil") WebElement cboEstadoCivil;
	@FindBy(id="txtCalle") WebElement txtCalle;
	@FindBy(id="txtExt") WebElement txtExt;
	@FindBy(id="txtInt") WebElement txtInt;
	@FindBy(id="txtColonia") WebElement txtColonia;
	@FindBy(id="txtCp") WebElement txtCp;
	@FindBy(id="cboEstado") WebElement cboEstado;
	@FindBy(id="cboMunicipio") WebElement cboMunicipio;
	@FindBy(id="txtRuta") WebElement txtRuta;
	@FindBy(id="txtMail") WebElement txtMail;
	@FindBy(id="txtTelefono") WebElement txtTelefono;
	@FindBy(id="txtCelular") WebElement txtCelular;
	@FindBy(id="txtOtro") WebElement txtOtro;
	@FindBy(id="txtPaternoC") WebElement txtPaternoC;
	@FindBy(id="txtMaternoC") WebElement txtMaternoC;
	@FindBy(id="txtNombreC") WebElement txtNombreC;
	@FindBy(id="dtpFecNacC") WebElement dtpFecNacC;
	@FindBy(id="txtPaternoEm") WebElement txtPaternoEm;
	@FindBy(id="txtMaternoEm") WebElement txtMaternoEm;
	@FindBy(id="txtNombreEm") WebElement txtNombreEm;	
	@FindBy(id="txtTelefonoEm") WebElement txtTelefonoEm;
	@FindBy(xpath="(//button[@id='btnGuardar'])[2]") WebElement btnGuardar;

	

	public void capturaDatosGrales
	(/* WebDriver driver,*/
		String PtxtPaterno, 
		String PtxtMaterno, 
		String PtxtNombre, 
		String PdtpFechaNacimiento,
		String PdtpFechaAlta,
		String PtxtAntiguedad,
		String PtxtAntMM,
		String PtxtAntDD,
		String PtxtRfc,
		String PcboSexo,
		String PcboEstadoNac,
		String PtxtLugarNac,
		String PtxtCurp,
		String PtxtNss,
		String PcboEdoServicio,
		String PcboSindicalizado,
		String PcboTurno,
		String PcboCategoria,
		String PcboTipoSalario,
		String PcboTipoContratoSat,
		String PcboTipoPago,
		String PcboJornada,
		String PcboTipoContrato,
		String PcboBanco,
		String PtxtCuenta,
		String PtxtNoTarjeta			
	)
	{
		System.out.println("PtxtPaterno:="+PtxtPaterno
				+" PtxtMaterno:="+PtxtMaterno
				+" PtxtNombre:= "+PtxtNombre
				+" PdtpFechaNacimiento:="+PdtpFechaNacimiento
				+" PdtpFechaAlta:="+PdtpFechaAlta
				+" PtxtAntiguedad:= "+PtxtAntiguedad
				+" PtxtAntMM:= "+PtxtAntMM
				+" PtxtAntDD:= "+PtxtAntDD
				+" PtxtRfc:="+PtxtRfc
				+" PcboEstadoNac:="+PcboEstadoNac
				+" PtxtLugarNac:="+PtxtLugarNac
				+" PtxtCurp:="+PtxtCurp				
				+" PtxtNss:="+PtxtNss
				+" PcboEdoServicio:="+PcboEdoServicio
				+" PcboSindicalizado:="+PcboSindicalizado
				+" PcboTurno:="+PcboTurno
				+" PcboCategoria:="+PcboCategoria
				+" PcboTipoContratoSat:="+PcboTipoContratoSat
				+" PcboTipoPago:="+PcboTipoPago
				+" PcboJornada:="+PcboJornada
				+" PcboTipoContrato:="+PcboTipoContrato
				+" PcboBanco:="+PcboBanco
				+" PtxtCuenta:="+PtxtCuenta
				+" PtxtNoTarjeta:="+PtxtNoTarjeta
				
				
				);
	try {
		txtPaterno.sendKeys(PtxtPaterno);
		txtMaterno.sendKeys(PtxtMaterno);
		txtNombre.sendKeys(PtxtNombre);
		
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + PdtpFechaNacimiento +"'"), dtpFechaNacimiento);
		dtpFechaNacimiento.sendKeys(Keys.ENTER);
		waitSeconds(1);
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + PdtpFechaAlta +"'"), dtpFechaAlta);
		waitSeconds(1);		
		dtpFechaAlta.sendKeys(Keys.ENTER);
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + PtxtAntiguedad +"'"), txtAntiguedad);
		waitSeconds(1);
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + PtxtAntMM +"'"), txtAntMM);		
		waitSeconds(1);
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + PtxtAntDD +"'"), txtAntDD);		
		waitSeconds(1);
		txtRfc.sendKeys(PtxtRfc);
		waitSeconds(1);
		new Select(cboSexo).selectByVisibleText(PcboSexo);
		waitSeconds(1);
		new Select(cboEstadoNac).selectByVisibleText(PcboEstadoNac);
		waitSeconds(1);
		txtLugarNac.sendKeys(PtxtLugarNac);
		waitSeconds(1);
		txtCurp.sendKeys(PtxtCurp);
		waitSeconds(1);
		txtNss.sendKeys(PtxtNss);
		waitSeconds(1);

		new Select(cboEdoServicio).selectByVisibleText(PcboEdoServicio);
		waitSeconds(1);

		new Select(cboSindicalizado).selectByVisibleText(PcboSindicalizado);
		waitSeconds(1);

		new Select(cboTurno).selectByVisibleText(PcboTurno);
		waitSeconds(1);

		new Select(cboCategoria).selectByVisibleText(PcboCategoria);
		waitSeconds(1);

		new Select(cboTipoSalario).selectByVisibleText(PcboTipoSalario);
		waitSeconds(1);

		new Select(cboTipoContratoSat).selectByVisibleText(PcboTipoContratoSat);
		waitSeconds(1);

		new Select(cboTipoPago).selectByVisibleText(PcboTipoPago);
		waitSeconds(1);

		new Select(cboJornada).selectByVisibleText(PcboJornada);
		waitSeconds(1);

		new Select(cboTipoContrato).selectByVisibleText(PcboTipoContrato);
		waitSeconds(1);

		new Select(cboBanco).selectByVisibleText(PcboBanco);
		waitSeconds(1);
		
		txtCuenta.sendKeys(PtxtCuenta);
		txtNoTarjeta.sendKeys(PtxtNoTarjeta);
	}catch(Exception e) {
	System.out.println("Ocurrio un error al capturar datos generales del empleado "+e);
	}
	}
	
	public void capturaDatosAsignacion(			
			String PcboPlanta,
			String PcboTipoTrabajo,
			String PcboHorario,
			String PcboDepartamento,
			String PcboLinea,
			String PcboCentroCosto,
			String PcboPuesto,
			String PcboSupervisor,
			String PcboArea
			) {
		System.out.println( 
				"PcboPlanta:="+PcboPlanta
				+" PcboHorario:= "+PcboHorario
				+" PcboDepartamento:="+PcboDepartamento
				+" PcboLinea:="+PcboLinea
				+" PcboCentroCosto:="+PcboCentroCosto
				+" PcboPuesto:="+PcboPuesto
				+" PcboSupervisor:="+PcboSupervisor
				+" PcboArea:="+PcboArea			
				
				);
		try {
		waitSeconds(1);
		 if(acordAsignaEmp.isDisplayed()==true) {
				 acordAsignaEmp.click(); 
		 }else {
				 waitSeconds(2);
		 acordAsignaEmp.click();
		 }
		 
		waitSeconds(1);
		 new Select(cboPlanta).selectByVisibleText(PcboPlanta);
			waitSeconds(1);
		
		 new Select(cboTipoTrabajo).selectByVisibleText(PcboTipoTrabajo);
			waitSeconds(1);
		 new Select(cboHorario).selectByVisibleText(PcboHorario);
			waitSeconds(1);
		 new Select(cboDepartamento).selectByVisibleText(PcboDepartamento);
			waitSeconds(1);
		new Select(cboLinea).selectByVisibleText(PcboLinea);
		waitSeconds(1);
		new Select(cboCentroCosto).selectByVisibleText(PcboCentroCosto);
		waitSeconds(1);
		new Select(cboPuesto).selectByVisibleText(PcboPuesto);
		waitSeconds(1);
		new Select(cboSupervisor).selectByVisibleText(PcboSupervisor);
		waitSeconds(1);
		
		 new Select(cboArea).selectByVisibleText(PcboArea);
			waitSeconds(1);
		}catch(Exception e) {
			System.out.println("Ocurrio un error al capturar datos de asignacion del empleado "+e);
			}
	}
	public void capturaDatosPersonales(
			
			String PcboEstadoCivil,
			String PtxtCalle,
			String PtxtExt,
			String PtxtInt,
			String PtxtColonia,
			String PtxtCp,
			String PcboEstado,
			String PcboMunicipio,
			String PtxtRuta,
			String PtxtMail,
			String PtxtTelefono,
			String PtxtCelular,
			String PtxtOtro,
			String PtxtPaternoC,
			String PtxtMaternoC,
			String PtxtNombreC,
			String PdtpFecNacC,
			String PtxtPaternoEm,
			String PtxtMaternoEm,
			String PtxtNombreEm,	
			String PtxtTelefonoEm
			) {
		System.out.println(				
				" PcboEstadoCivil:= "+PcboEstadoCivil
				+" PtxtCalle:="+PtxtCalle
				+" PtxtInt:="+PtxtInt
				+" PtxtColonia:="+PtxtColonia
				+" PtxtCp:="+PtxtCp
				+" PcboEstado:="+PcboEstado
				+" PcboMunicipio:="+PcboMunicipio			
				+" PtxtRuta:="+PtxtRuta
				+" PtxtMail:="+PtxtMail
				+" PtxtTelefono:="+PtxtTelefono
				+" PtxtCelular:="+PtxtCelular
				+" PtxtOtro:="+PtxtOtro
				+" PtxtPaternoC:="+PtxtPaternoC
				+" PtxtMaternoC:="+PtxtMaternoC
				+" PtxtNombreC:="+PtxtNombreC				
				+" PdtpFecNacC:="+PdtpFecNacC
				+" PtxtPaternoEm:="+PtxtPaternoEm
				+" PtxtMaternoEm:="+PtxtMaternoEm
				+" PtxtNombreEm:="+PtxtNombreEm
				+" PtxtTelefonoEm:="+PtxtTelefonoEm				
				);
		try {
		
		if(acordDatPersonal.isDisplayed()==true) {
				 acordDatPersonal.click(); 
		 }else {
				 waitSeconds(2);
				 acordDatPersonal.click();
		 }
		new Select(cboEstadoCivil).selectByVisibleText(PcboEstadoCivil);
		waitSeconds(1);
		txtCalle.sendKeys(PtxtCalle);
		waitSeconds(1);
		txtExt.sendKeys(PtxtExt);
		waitSeconds(1);
		txtInt.sendKeys(PtxtInt);
		waitSeconds(1);
		txtColonia.sendKeys(PtxtColonia);
		waitSeconds(1);
		txtCp.sendKeys(PtxtCp);
		waitSeconds(1);
		new Select(cboEstado).selectByVisibleText(PcboEstado);
		waitSeconds(1);			
		new Select(cboMunicipio).selectByVisibleText(PcboMunicipio);
		waitSeconds(1);
		txtRuta.sendKeys(PtxtRuta);
		waitSeconds(1);
		txtMail.sendKeys(PtxtMail);
		waitSeconds(1);
		txtTelefono.sendKeys(PtxtTelefono);
		waitSeconds(1);
		txtCelular.sendKeys(PtxtCelular);
		waitSeconds(1);
		txtOtro.sendKeys(PtxtOtro);
		waitSeconds(1);
		txtPaternoC.sendKeys(PtxtPaternoC);
		waitSeconds(1);
		txtMaternoC.sendKeys(PtxtMaternoC);
		waitSeconds(1);
		txtNombreC.sendKeys(PtxtNombreC);	
		waitSeconds(1);
		((JavascriptExecutor) driver).executeScript(("arguments[0].value= '" + PdtpFecNacC +"'"), dtpFecNacC);
		waitSeconds(1);
		txtPaternoEm.sendKeys(PtxtPaternoEm);
		waitSeconds(1);
		txtMaternoEm.sendKeys(PtxtMaternoEm);
		waitSeconds(1);
		txtNombreEm.sendKeys(PtxtNombreEm);
		waitSeconds(1);
		txtTelefonoEm.sendKeys(PtxtTelefonoEm);
		}catch(Exception e) {
			System.out.println("Ocurrio un error al capturar datos de Personales del empleado "+e);
			}
	}
	
	public void GuardaDatosEmp() {
		waitSeconds(1);
		btnGuardar.click();
	}
	
	public FrmEmpleados(WebDriver dri) {
		this.driver = dri;
	}
	

}

