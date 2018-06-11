set projectPath=C:\Users\molvera\eclipse-workspace\QA
cd\
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\lib\*;
java org.testng.TestNG loginScreenshot.xml