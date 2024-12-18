package testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageobject.posting;
import reporting.Loggerclass;
import util.config;
import util.screensortcode;


@org.testng.annotations.Listeners(reporting.listenerinterface.class)
public class tc_posting extends BaseClass {
	
	private String methodName;
	public static screensortcode sc;
	public static Loggerclass l;
	config c = new config();
	public  String titlelocator = c.title();
	
	@Test
	public  void ThisISpostingTestCase()
	{
         methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

	
		try {
			posting p = new posting(driver);
           p.Postingtestcase(driver);
           
           if(titleofpage.contains(titlelocator)) {
           	//console output passed
   		     Assert.assertTrue(true);
           }
           else
           {
        	   Assert.fail();
           }
          
   		
            
          
		}
		catch(Exception e)
		{
    		
          Assert.fail();
		}
	
        	
	}
}
                
                
              
        

	
	
        
        
       