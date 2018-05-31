package factory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import tools.Constant;
import tools.Utilities;
public class loginClassPageFactory extends Utilities{
	private static WebDriver driver= null;
	@Test
	public void loginVerify() throws InterruptedException{
	
		//se inicializa el driver
		inicializaDriverProperty(Constant.DriverName,Constant.RutaDriv);
		//se crea el objeto del navegador
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Constant.URL);	

		WebElements locateElements = PageFactory.initElements(driver, WebElements.class);
		locateElements.LoginMethod(Constant.P_USER,Constant.P_PASS);
		
	}
	
}
