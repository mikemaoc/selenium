package automationFramework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import appModule.SignIn_Action;
import pageObjects.FrmEmpleados;
import pageObjects.HomeNominas;
import pageObjects.Home_Page;
import tools.Constant;
import tools.ExcelUtils;
import tools.Utilities;
public class NominasEmpleadosAbcExc extends Utilities {
	
	private static WebDriver driver = null;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static LocalDate localDate = LocalDate.now();
	//System.out.println(dtf.format(localDate)); //2016/11/16
	public static void main(String[] args) throws Exception {
		

		//datos grales del empleado
		String PtxtPaterno, PtxtMaterno, PtxtNombre, PdtpFechaNacimiento, PdtpFechaAlta, PtxtAntiguedad, PtxtAntMM, PtxtAntDD,PtxtRfc, PcboSexo, PcboEstadoNac, PtxtLugarNac, PtxtCurp, PtxtNss, PcboEdoServicio, PcboSindicalizado, PcboTurno, PcboCategoria, PcboTipoSalario, PcboTipoContratoSat, PcboTipoPago, PcboJornada, PcboTipoContrato, PcboBanco, PtxtCuenta, PtxtNoTarjeta;
		//datos de asignacion del empleado
		String PcboPlanta, PcboTipoTrabajo, PcboHorario, PcboDepartamento, PcboLinea, PcboCentroCosto, PcboPuesto, PcboSupervisor, PcboArea;
		//datos personales del empleado
		String PcboEstadoCivil, PtxtCalle, PtxtExt, PtxtInt, PtxtColonia, PtxtCp, PcboEstado, PcboMunicipio, PtxtRuta, PtxtMail, PtxtTelefono, PtxtCelular, PtxtOtro, PtxtPaternoC, PtxtMaternoC, PtxtNombreC, PdtpFecNacC, PtxtPaternoEm, PtxtMaternoEm, PtxtNombreEm, PtxtTelefonoEm;		
		
		inicializaDriverProperty(Constant.DriverName, Constant.RutaDriv);		
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		 
		
		try {
			//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
			System.out.println("Ruta: "+Constant.Path_TestData + Constant.File_TestDataEmp);
			System.out.println("sheet: "+"H1");
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestDataEmp,Constant.File_sheet);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String  url = ExcelUtils.getCellData(2, 0);
		String  sUserName = ExcelUtils.getCellData(2, 1);
		String sPassword = ExcelUtils.getCellData(2, 2);
		
		/*Se inicializan las variables de datos generales*/
		PtxtPaterno =  ExcelUtils.getCellData(2, 3);
		PtxtMaterno =  ExcelUtils.getCellData(2, 4);
		PtxtNombre =  ExcelUtils.getCellData(2, 5);
		PdtpFechaNacimiento =  ExcelUtils.getCellData(2, 6);
		PdtpFechaAlta =  ExcelUtils.getCellData(2, 7);
		PtxtAntiguedad=  ExcelUtils.getCellData(2, 8);
		PtxtAntMM=  ExcelUtils.getCellData(2, 9);
		PtxtAntDD=  ExcelUtils.getCellData(2, 10);
		PtxtRfc =  ExcelUtils.getCellData(2, 11);
		PcboSexo =  ExcelUtils.getCellData(2, 12);
		PcboEstadoNac =  ExcelUtils.getCellData(2, 13);
		PtxtLugarNac =  ExcelUtils.getCellData(2, 14);
		PtxtCurp =  ExcelUtils.getCellData(2, 15);
		PtxtNss =  ExcelUtils.getCellData(2, 16);
		PcboEdoServicio =  ExcelUtils.getCellData(2, 17);
		PcboSindicalizado =  ExcelUtils.getCellData(2, 18);
		PcboTurno =  ExcelUtils.getCellData(2, 19);
		PcboCategoria =  ExcelUtils.getCellData(2, 20);
		PcboTipoSalario =  ExcelUtils.getCellData(2, 21);
		PcboTipoContratoSat =  ExcelUtils.getCellData(2, 22);
		PcboTipoPago =  ExcelUtils.getCellData(2, 23);
		PcboJornada =  ExcelUtils.getCellData(2, 24);
		PcboTipoContrato =  ExcelUtils.getCellData(2, 25);
		PcboBanco =  ExcelUtils.getCellData(2, 26);
		PtxtCuenta =  ExcelUtils.getCellData(2, 27);
		PtxtNoTarjeta=  ExcelUtils.getCellData(2, 28);
		
		/*se inicializan variables de datos de asignacion */
		PcboPlanta =  ExcelUtils.getCellData(2, 29);
		PcboTipoTrabajo=  ExcelUtils.getCellData(2, 30); 
		PcboHorario =  ExcelUtils.getCellData(2, 31);
		PcboDepartamento =  ExcelUtils.getCellData(2, 32);
		PcboLinea =  ExcelUtils.getCellData(2, 33);
		PcboCentroCosto =  ExcelUtils.getCellData(2, 34);
		PcboPuesto =  ExcelUtils.getCellData(2, 35);
		PcboSupervisor =  ExcelUtils.getCellData(2, 36);
		PcboArea=  ExcelUtils.getCellData(2, 37);
		
		//System.out.println("PcboArea"+PcboArea);
		/*Se inicializan datos personales		 */
		PcboEstadoCivil= ExcelUtils.getCellData(2, 38);
		PtxtCalle = ExcelUtils.getCellData(2, 39);
		PtxtExt = ExcelUtils.getCellData(2, 40);
		PtxtInt = ExcelUtils.getCellData(2, 41);
		PtxtColonia = ExcelUtils.getCellData(2, 42);
		PtxtCp = ExcelUtils.getCellData(2, 43);
		PcboEstado = ExcelUtils.getCellData(2, 44);
		PcboMunicipio = ExcelUtils.getCellData(2, 45);
		PtxtRuta = ExcelUtils.getCellData(2, 46);
		PtxtMail = ExcelUtils.getCellData(2, 47);
		PtxtTelefono = ExcelUtils.getCellData(2, 48);
		PtxtCelular = ExcelUtils.getCellData(2, 49);
		PtxtOtro  = ExcelUtils.getCellData(2, 50);
		PtxtPaternoC  = ExcelUtils.getCellData(2, 51);
		PtxtMaternoC  = ExcelUtils.getCellData(2, 52);
		PtxtNombreC  = ExcelUtils.getCellData(2, 53);
		PdtpFecNacC  = ExcelUtils.getCellData(2, 54);
		PtxtPaternoEm  = ExcelUtils.getCellData(2, 55);
		PtxtMaternoEm  = ExcelUtils.getCellData(2, 56);
		PtxtNombreEm  = ExcelUtils.getCellData(2, 57);
		PtxtTelefonoEm = ExcelUtils.getCellData(2, 58);
		
		
		SignIn_Action.Execute(driver,url, sUserName, sPassword);
		Home_Page.modNominas(driver).click();
		waitSeconds(3);
		HomeNominas.menuEmpleadosAbc(driver).click();
		waitSeconds(2);
		

		System.out.println("Login test usuario logeado: "+sUserName);
		
		
		FrmEmpleados locateElements =  PageFactory.initElements(driver, FrmEmpleados.class);
		//locateElements.capturaDatosGrales("Olvera", "Colmenero", "Miguel Angel", "2017-03-14", "2017-03-14", "OECM870928QA7", "MASCULINO", "GUANAJUATO", "SAN MIGUEL ALLENDE", "OECM870928HGTLLG01", "12048728195", "QUE-QUERETARO", "NO", "1", "7 - CATEGORIA1 NOMINA4", "Fijo", "SUELDOS", "Transferencia", "01-DIURNA", "01-CONTRATO DE TRABAJO POR TIEMPO INDETERMINADO", "BANORTE", "12048728195", "66666");
		locateElements.capturaDatosGrales(PtxtPaterno, PtxtMaterno, PtxtNombre, PdtpFechaNacimiento, PdtpFechaAlta,PtxtAntiguedad,PtxtAntMM,PtxtAntDD, PtxtRfc, PcboSexo, PcboEstadoNac, PtxtLugarNac, PtxtCurp, PtxtNss, PcboEdoServicio, PcboSindicalizado, PcboTurno, PcboCategoria, PcboTipoSalario, PcboTipoContratoSat, PcboTipoPago, PcboJornada, PcboTipoContrato, PcboBanco, PtxtCuenta, PtxtNoTarjeta);
		//locateElements.capturaDatosAsignacion( "SIN PLANTA", "SIN TIPO DE TRABAJO","PRIMER TURNO", "ASA", "SIN LINEA", "SIN CENTRO DE COSTO", "SIN PUESTO", "CALIDAD", "SIN AREA");
		locateElements.capturaDatosAsignacion(PcboPlanta, PcboTipoTrabajo, PcboHorario, PcboDepartamento, PcboLinea, PcboCentroCosto, PcboPuesto, PcboSupervisor, PcboArea);
		//locateElements.capturaDatosPersonales("SOLTERO(A)", "SALIDA A QRO", "68", "68", "CENTRO", "37700", "QUERETARO", "CORREGIDORA", "RUTA DE PASO", "test@test.com", "123456789", "4424395600", "4546456", "VAZQUEZ", "OLVERA", "JOSE CESAREO","2018-02-22", "TAMAYO","AVALOS", "DANIEL","15454566");
		locateElements.capturaDatosPersonales(PcboEstadoCivil, PtxtCalle, PtxtExt, PtxtInt, PtxtColonia, PtxtCp, PcboEstado, PcboMunicipio, PtxtRuta, PtxtMail, PtxtTelefono, PtxtCelular, PtxtOtro, PtxtPaternoC, PtxtMaternoC, PtxtNombreC, PdtpFecNacC, PtxtPaternoEm, PtxtMaternoEm, PtxtNombreEm, PtxtTelefonoEm);
		//locateElements.GuardaDatosEmp();
	}

}
