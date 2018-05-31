package tools;

public class Constant {
	 public static final String URL="http://192.168.13.142/LoginTest/ingresar.aspx";
	 public static final String P_USER="denisse@mltic.com";//"denisse@mltic.com";
	 public static final String P_PASS="gobdigital2";//"gobdigital2";
	 public static final String Path_TestData = "C:/Users/molvera//eclipse-workspace//QA//src//testData//";//ruta del archivo
	 public static final String File_TestData = "TestData - copia.xlsx";//"TestData.xlsx";//nombre del archivo
	 public static final String File_TestDataEmp = "TestData.xlsx";//"AltaEmpleados.xlsx";//nombre del archivo
	 public static final String File_sheet = "H1";//hoja del archivo
	 public static final String DriverName = "webdriver.gecko.driver";//"webdriver.chrome.driver";
	 public static final String RutaDriv="C:\\Users\\molvera\\Documents\\selenium\\geckodriverv0.19.1win64\\geckodriver.exe";//"C:\\Users\\molvera\\Documents\\selenium\\chromedriver\\chromedriver.exe";
	 //01989
	 /*
delete from HTipoJornada_Sat where id_emp = 862
delete from HTipoContrato_Sat where id_emp = 862
delete from HEdoPrestacionServicio where id_emp = 862
delete from hrfc where id_emp = 862
delete from hcurp where id_emp = 862
delete from empleados where rfc like '%OECM%'

select * from empleados where rfc like '%OECM%'

delete from HTipoJornada_Sat where id_emp in
(
select id_emp from empleados where rfc like '%OECM%'
)
delete from HTipoContrato_Sat where id_emp in
(
select id_emp from empleados where rfc like '%OECM%'
)
delete from HEdoPrestacionServicio  where id_emp in
(
select id_emp from empleados where rfc like '%OECM%'
)
delete from hrfc where  where id_emp in
(
select id_emp from empleados where rfc like '%OECM%'
)
delete from hcurp  where id_emp in
(
select id_emp from empleados where rfc like '%OECM%'
)
delete from empleados where  where id_emp in
(
select id_emp from empleados where rfc like '%OECM%'
)
	  * */
}
