package reporting;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class listenerinterface implements ITestListener {

public String filepath ="C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.pro\\test-output\\EXTEND-REPORTS\\";
 

	public ExtentSparkReporter esr;
	
	public ExtentReports ehr;
	
	public ExtentTest test;
	
	public File file;
	public String filepath1="C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.pro\\test-output\\screensortTESTCASES\\";
	
	 public WebDriver driver;

	
	//change
	//no
	//date
	@Override
    public void onStart(ITestContext context) {
        // Initialize ExtentHtmlReporter
		
		String c = context.getSuite().getName();
	    LocalDateTime now = LocalDateTime.now();

        // Define a format for the date-time string (e.g., yyyy-MM-dd_HH-mm-ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM-dd-yyyy, hh-mm a ");

        // Format the date-time and print
        String dateStamp = now.format(formatter);
        
        
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        
		 esr = new ExtentSparkReporter(filepath+methodName+"-TestCase-"+dateStamp+".html");
			esr.config().setDocumentTitle("ExtendReportsAutomation");
			esr.config().setReportName("AutomationFacebookReport");
			 ehr = new ExtentReports();
			ehr.attachReporter(esr);
       
    }

    // This method will be invoked when the test starts
    @Override
    public void onTestStart(ITestResult result) {
    	
    	String s =result.getName();
		test = ehr.createTest(s,s);

    }

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String sucess =	result.getName();
				
		System.out.println("success:-" + sucess);
		
             
            
		
		//extend
		
		 test.pass(sucess+ " " +" testCase" +" pass");
			test.log(Status.PASS, sucess+" pass log");
			
			
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String fail =	result.getName();
		System.out.println("fail:-" + fail);
	
         
		//extend
		 test.fail(fail+ " " +" testCase" +" fail");
			test.log(Status.FAIL, fail+" fail log");
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String skip =	result.getName();
		System.out.println("skip:-" + skip);
		 
         
        

		 test.skip(skip+ " " +" testCase" +" skip");
			test.log(Status.SKIP, skip+" skip log");
		ITestListener.super.onTestSkipped(result);
	}

	 // This method will be invoked when the test suite finishes
    @Override
    public void onFinish(org.testng.ITestContext context) {
        // Flush the report to the file system
    	ehr.flush();
    }

	
   
   
	

}
