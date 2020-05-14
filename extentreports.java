import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class ListarTodasRegioesTest 
{
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		report.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));

	}

	@Test
	public void CT01() 	{
			
			test = report.startTest("CT01_ListarAno");
			
			//code
			
			test.log(LogStatus.INFO, "Chamando a Api", urlBase);
			test.log(LogStatus.PASS, "Retorno");	
	}
	
		@Test
	public void CT02() 	{
			
			test = report.startTest("CT01_ListarAno");
			
			//code
			
			test.log(LogStatus.INFO, "Chamando a Api", urlBase);
			test.log(LogStatus.PASS, "Retorno");	
	}
	
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}

}


/* 

// Arquivo de config

extent-config.xml


<?xml version="1.0" encoding="UTF-8"?>
<extentreports>
  <configuration>
    <!-- report theme -->
    <!-- standard, dark -->
    <theme>standard</theme>
  
    <!-- document encoding -->
    <!-- defaults to UTF-8 -->
    <encoding>UTF-8</encoding>
    
    <!-- protocol for script and stylesheets -->
    <!-- defaults to https -->
    <protocol>https</protocol>
    
    <!-- title of the document -->
    <documentTitle>Vila Cap</documentTitle>
    
    <!-- report name - displayed at top-nav -->
    <reportName></reportName>
    
    <!-- report headline - displayed at top-nav, after reportHeadline -->
    <reportHeadline>Api TPAR</reportHeadline>
    
    <!-- global date format override -->
    <!-- defaults to yyyy-MM-dd -->
    <dateFormat>yyyy-MM-dd</dateFormat>
    
    <!-- global time format override -->
    <!-- defaults to HH:mm:ss -->
    <timeFormat>HH:mm:ss</timeFormat>
   
    
    <!-- custom javascript -->
    <scripts>
      <![CDATA[
        $(document).ready(function() {
          
        });
      ]]>
    </scripts>
    
    <!-- custom styles -->
    <styles>
      <![CDATA[
        
      ]]>
    </styles>
  </configuration>
</extentreports>

*/
