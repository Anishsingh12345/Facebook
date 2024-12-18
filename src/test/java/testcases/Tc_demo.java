package testcases;

import org.testng.annotations.Test;

import pageobject.DemoWebSite;

public class Tc_demo extends BaseClass1 {
	
	
	@Test(priority = 2)
	
	public void registermethod() throws InterruptedException
	{
		DemoWebSite d = new DemoWebSite(driver);
		d.method(driver);
	}

}
