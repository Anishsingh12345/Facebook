package testcases;

import util.config;
import util.screensortcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import reporting.Listeners;

public class BaseClass1 {
	
	
	public static Listeners lis;
	public static screensortcode sc ;
 public static WebDriver driver;
 public String browser = "Chrome";
	public static String titleofpage;

 config c = new config();
   String urllocator= c.url();
		
	 
	@SuppressWarnings("deprecation")
	@Test(priority =  1)
	public void setup()
	{
		if(browser.equalsIgnoreCase("chrOME")) {
		System.setProperty("chrome.driver.webdriver", "C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.project\\Driver\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.navigate().to(urllocator);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		titleofpage =driver.getTitle();
		System.out.println(titleofpage);
		
		try
		{
			Alert a = driver.switchTo().alert();
			a.accept();
		}
		catch(Exception e)
		{
			System.out.println();
		}
		}
		else
		{
			System.out.println("browser error");
		}
	}
	
	
	/* @Test(priority = 2)
		public void login()
		{
		 
		 //login code
		 tc_loginpage tc = new tc_loginpage();
		 tc.loginpagetestcase();
		} */
	 

	
	
    @Test(priority = 3)
    public  void teardown()
    {
    	
    	driver.quit();
    }

    
    
   
    
    
	
    
    public  void screensortyes(String path)    {
    	 sc = new screensortcode(driver);
         sc.screensortmethod(driver,path);

    }
    
  
	
   
   

}
