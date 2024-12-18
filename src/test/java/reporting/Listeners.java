package reporting;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.reporters.TestHTMLReporter;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig.ExtentSparkReporterConfigBuilder;

public class Listeners{
	
	public String filepath ="C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.pro\\test-output\\EXTEND-REPORTS\\";
	
	public ExtentSparkReporter esr;
	
	public ExtentReports ehr;
	
	public ExtentTest test;
	public  Listeners(String filename)
	{
		
		 esr = new ExtentSparkReporter(filepath+filename+"TestCase"+".html");
		esr.config().setDocumentTitle("ExtendReportsAutomation");
		esr.config().setReportName("AutomationFacebookReport");
		 ehr = new ExtentReports();
		ehr.attachReporter(esr);
		
		
	}
		
	
		
		
		public void pass(String n1 , String n2,String n6)
		{
		
			test = ehr.createTest(n1+" MethodStatus",n2+"MethodInfo");

		        test.pass(n6+ " " +" testCase" +" pass");
				test.log(Status.PASS, "pass log");
				}
		
		public void fail(String n1 , String n2,String n7)
		{
		
			test = ehr.createTest(n1+" MethodStatus",n2+"MethodInfo");

		        test.fail(n7+" " + " TestCase"+" fail");
				test.log(Status.FAIL, "fail log");
				}
		
		public void skip(String n1 , String n2,String n8)
		{
			
			test = ehr.createTest(n1+" MethodStatus",n2+"MethodInfo");

		
		        test.skip(n8+" "+ " testCase" +" skip");
				test.log(Status.SKIP, "skip log");
				}
		
		

		public void flushcode()
		{
		
		      ehr.flush();
				}
		
		
//here test code mean = if else , try catch status
	//you can use this in assertion from this calss to code class main

	
}

