package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.Friendrequest;
import pageobject.loginpage;
import reporting.Listeners;
import reporting.Loggerclass;
import util.config;
import util.screensortcode;


@org.testng.annotations.Listeners(reporting.listenerinterface.class)
public class tc_Friend_request extends BaseClass {
	
	private String methodName;
	public static screensortcode sc;
	public static Loggerclass l;
	config c = new config();
	public String titlelocator = c.title();
	
	




{
	
}

		 
		
	@Test(priority = 3 , dependsOnMethods = {"login"})
	public  void friendrequest()
	{
         methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

	if(titleofpage.contains(titlelocator)) {
        	//console output passed
		Assert.assertTrue(true);
		
		try {
			Friendrequest p = new Friendrequest(driver);
            p.Friendrequesttestcase(driver);
            
            BaseClass b = new BaseClass();
            b.screensortyes(methodName);
		}
		catch(Exception e)
		{
    		System.out.println(methodName + "testCase failed successfully");

		}
	}
        	else
        	{	
        		//console fail
        		System.out.println(methodName + "testCase failed successfully");
        			}	
        	
                }
}
                
                
              
        

	
	
        
        
       