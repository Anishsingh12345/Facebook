package pageobject;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class sharegroup {
	
	public static	WebDriver  dr1;
	
	public sharegroup(WebDriver dr1)
	{
		
		//by webelemnt
		this.dr1=dr1;
		
	}
	
	//1st level
	        By clickgroup= By.xpath("//*[@class='xfx01vb x1lliihq x1tzjh5l x1k90msu x2h7rmj x1qfuztq']");
			By yourgroup= By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[3]/div[1]/div[2]/div/div[3]/a/div/div[2]/div/div/div/div");
By viewgroup= By.tagName("a");			
			
			//2nd level
			By sharegroup= By.xpath("//*[@id='mount_0_0_PL']/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]");
			By groupdescription= By.xpath("");
			By twiteer = By.xpath("");
			
			//3rd level
			By clicktwitterlogin= By.xpath("");
			By logindescriptionTEXT= By.xpath("");
			
			
			//4th level
			By popup1= By.xpath("//*[@class='x9f619 x1n2onr6 x78zum5 xdt5ytf x193iq5w xeuugli x2lah0s x1t2pt76 x1xzczws x1cvmir6 x1vjfegm']");
			By popup2= By.xpath("");
			By popup3= By.xpath("");
			By newwindowscreen= By.xpath("");
			
			
			//span , svg 
			//text use
			//copy full xpath
			//remove span,svg from last
public void shareGrouptestcase(WebDriver driver1)
{
	
	//click group code -ok
JavascriptExecutor js = (JavascriptExecutor)driver1;
	List <WebElement> clickgroupwebele = driver1.findElements(clickgroup);
	int size1=clickgroupwebele.size();
	for(int i=0 ; i<size1 ; i++)
	{
		try
		{
			if(i==6)
			{
			clickgroupwebele.get(i).click();
			}
		}
		catch(Exception e)
		{
			if(i==6)
			{
			js.executeScript("arguments[0].scrollIntoView(true);",clickgroupwebele.get(i));
			 clickgroupwebele.get(i).click();
			}

		}
	}
	
	
	
	
	//your group code popup - ok
	  Actions a = new Actions(driver1);

	WebElement popup1we = driver1.findElement(popup1);
	js.executeScript("arguments[0].scrollIntoView(true);",popup1we);
	popup1we.click();
	 
	 
	 // your group code -ok
	WebElement yourgroupwe = driver1.findElement(yourgroup);
	js.executeScript("arguments[0].scrollIntoView(true);",yourgroupwe);
	yourgroupwe.click();
	
	
	
//view group click code -ok
	List <WebElement> viewgroupwe = driver1.findElements(viewgroup);
	int sizesize = viewgroupwe.size();
	for(int i=0 ; i<sizesize ;i++)
	{
  try
  {
	  if(i==20)
	  {
		viewgroupwe.get(20).click();
	  }
  }
  catch(Exception e){
	  if(i==20)
	  {
		js.executeScript("arguments[0].scrollIntoView(true);",viewgroupwe.get(20));
		viewgroupwe.get(20).click();
	  }
  }
	}
	
	//a[you can glock by get that number] or //a[tag=valyue] 1of1 
	
	//
/*	WebElement sharegroupwe = driver1.findElement(sharegroup);
	js.executeScript("arguments[0].scrollIntoView(true);",sharegroupwe);
	sharegroupwe.click();
	 */
	 
	 
	 
	 
	 
	 
	


}
}





