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
import tools.Utilities;
public class NominasEmpleadosAbc extends Utilities {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2016/11/16

		inicializaDriverProperty(Constant.DriverName, Constant.RutaDriv);		
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		 
		
		SignIn_Action.Execute(driver, Constant.URL, Constant.P_USER, Constant.P_PASS);
		Home_Page.modNominas(driver).click();
		waitSeconds(3);
		HomeNominas.menuEmpleadosAbc(driver).click();
		waitSeconds(2);
		FrmEmpleados locateElements =  PageFactory.initElements(driver, FrmEmpleados.class); 
		
		locateElements.capturaDatosGrales("Olvera", "Colmenero", "Miguel Angel", "1987-09-28", ""+localDate,"0","0","0",  "OECM870928QA7", "MASCULINO", "GUANAJUATO", "SAN MIGUEL ALLENDE", "OECM870928HGTLLG01", "12048728195", "QUE-QUERETARO", "NO", "1", "7 - CATEGORIA1 NOMINA4", "Fijo", "SUELDOS", "Transferencia", "01-DIURNA", "01-CONTRATO DE TRABAJO POR TIEMPO INDETERMINADO", "BANORTE", "12048728195", "66666");
		locateElements.capturaDatosAsignacion( "SIN PLANTA", "SIN TIPO DE TRABAJO","PRIMER TURNO", "ASA", "SIN LINEA", "SIN CENTRO DE COSTO", "SIN PUESTO", "CALIDAD", "SIN AREA");
		locateElements.capturaDatosPersonales("SOLTERO(A)", "SALIDA A QRO", "68", "68", "CENTRO", "37700", "QUERETARO", "CORREGIDORA", "RUTA DE PASO", "test@test.com", "123456789", "4424395600", "4546456", "VAZQUEZ", "OLVERA", "JOSE CESAREO","2018-02-22", "TAMAYO","AVALOS", "DANIEL","15454566");
		locateElements.GuardaDatosEmp();
	}

}
