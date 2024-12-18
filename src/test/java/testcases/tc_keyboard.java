package testcases;

import org.testng.annotations.Test;

import pageobject.alert;
import pageobject.keyboard;
import pageobject.window;

public class tc_keyboard extends BaseClass1 {
	
	

	@Test(priority = 2)
	
	public void framemethopbb() throws InterruptedException
	{
		keyboard d = new keyboard(driver);
		d.windowmethod1(driver);
	}

}


