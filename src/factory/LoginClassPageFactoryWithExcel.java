package factory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import tools.Constant;
import tools.ExcelUtils;
import tools.Utilities;
public class LoginClassPageFactoryWithExcel extends Utilities{
	private static WebDriver driver= null;
	@Test
	public void loginVerify() throws Exception{
	
		//se inicializa el driver
		inicializaDriverProperty(Constant.DriverName,Constant.RutaDriv);
		//se crea el objeto del navegador
		driver = new FirefoxDriver();

		//driver.navigate().to(Constant.URL);
		
	try {
		//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
		System.out.println("Ruta: "+Constant.Path_TestData + Constant.File_TestData);
		System.out.println("sheet: "+"H1");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,Constant.File_sheet);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		WebElements locateElements = PageFactory.initElements(driver, WebElements.class);
		//locateElements.LoginMethod(Constant.P_USER,Constant.P_PASS);
		
		
		for (int i=1; i<=4; i ++) {
			String  url = ExcelUtils.getCellData(i, 0);
			String  sUserName = ExcelUtils.getCellData(i, 1);
			String sPassword = ExcelUtils.getCellData(i, 2);
			driver.manage().window().maximize();
			driver.navigate().to(url);
			locateElements.LoginMethod(sUserName,sPassword);
			System.out.println("Login test "+i+" usuario logeado: "+sUserName);
						 
			if(i==4){
				System.out.println("ya es el ultimo usuario: "+sUserName+ "Repetimos la lista");
				i=0;
				
			}
			
		}
		
	}
	
}
