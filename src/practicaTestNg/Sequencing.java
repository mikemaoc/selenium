package practicaTestNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequencing {
	 
	@Test

	public void testCase1() {

		System.out.println("Este es el caso de prueba 1");

	}

	@Test

	public void testCase2() {

		System.out.println("Este es el caso de prueba 2");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("Esto se ejecutar� antes de cada M�todo");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("Esto se ejecutar� despu�s de cada M�todo");

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("Esto se ejecutar� antes de la clase");

	}

	@AfterClass

	public void afterClass() {

		System.out.println("Esto se ejecutar� despu�s de la clase");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("Esto se ejecutar� antes de la Prueba");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("Esto se ejecutar� despu�s de la prueba");

	}

	@BeforeSuite

	public void beforeSuite() {

		System.out.println("Esto se ejecutar� antes de la Suite de prueba");

	}

	@AfterSuite

	public void afterSuite() {

		System.out.println("Esto se ejecutar� despu�s del Test Suite");

	}

}