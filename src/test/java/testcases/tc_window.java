package testcases;

import org.testng.annotations.Test;

import pageobject.alert;
import pageobject.window;

public class tc_window extends BaseClass1 {
	
	

	@Test(priority = 2)
	
	public void framemethop() throws InterruptedException
	{
		window d = new window(driver);
		d.windowmethod(driver);
	}

}


