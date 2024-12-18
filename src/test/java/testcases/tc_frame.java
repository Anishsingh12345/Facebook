package testcases;

import org.testng.annotations.Test;

import pageobject.alert;
import pageobject.frame;

public class tc_frame extends BaseClass1 {
	
	

	@Test(priority = 2)
	
	public void framemethop() throws InterruptedException
	{
		frame d = new frame(driver);
		d.method3(driver);
	}

}


