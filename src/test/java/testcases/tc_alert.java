package testcases;

import org.testng.annotations.Test;

import pageobject.DemoWebSite;
import pageobject.alert;
	

	public class tc_alert extends BaseClass1 {
		
		
		@Test(priority = 2)
		
		public void alertmethop() throws InterruptedException
		{
			alert d = new alert(driver);
			d.method2(driver);
		}

	}


