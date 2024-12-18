package pageobject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class window {
	
	public WebDriver dr ;
	public window(WebDriver dr)
	{
		dr=this.dr;
	}

	By email = By.xpath("//*[@id='email']");
	By logo =By.xpath("//*[@id='enterimg']");

	


By moveto = By.xpath("//*[@class='dropdown-toggle' and text()='SwitchTo']");
By Alerts = By.xpath("//*[contains(text(),'Windows')]");

By newtab= By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");

By ok = By.xpath("//*[@id=\"Tabbed\"]/a/button");

By okk = By.xpath("//*[@id=\"Seperate\"]/button");

public void windowmethod(WebDriver dr2) throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)dr2;
	
	
	WebElement emailwe= dr2.findElement(email);
	js.executeScript("arguments[0].scrollIntoView();",emailwe);
	emailwe.click();
	emailwe.clear();
	emailwe.sendKeys("anishnathyal@gmail.com");
	Thread.sleep(3000);
	
	
	WebElement logowe= dr2.findElement(logo);
	js.executeScript("arguments[0].scrollIntoView();",logowe);
	logowe.click();
	
	Thread.sleep(3000);
	
	
	WebElement movetowe= dr2.findElement(moveto);
	js.executeScript("arguments[0].scrollIntoView();",movetowe);
	
	WebElement Alertswe= dr2.findElement(Alerts);
	js.executeScript("arguments[0].scrollIntoView();",Alertswe); 
	Thread.sleep(3000);

	
	Actions act = new Actions(dr2);
	act.moveToElement(movetowe).click(Alertswe).build().perform();
	Thread.sleep(3000);
	
	
	String orginal =dr2.getWindowHandle();

	WebElement okwe= dr2.findElement(ok);
	js.executeScript("arguments[0].scrollIntoView();",okwe);
	okwe.click();
	
	Set <String> child = dr2.getWindowHandles();
	for(String c : child)
	{
		if(!c.equals(orginal))
		{
			dr2.switchTo().window(c);
			break;
			
			//12345
		}
	}
	
			//
	   String s1 = dr2.getTitle();
	   System.out.println(s1);
	
	
dr2.switchTo().window(orginal);


	WebElement newtabwe=dr2.findElement(newtab);
	js.executeScript("arguments[0].scrollIntoView();",newtabwe);
	newtabwe.click();
	
	
	String orginal1 =dr2.getWindowHandle();
	
	WebElement okte= dr2.findElement(okk);
	js.executeScript("arguments[0].scrollIntoView();",okte);
	okte.click();
	
	Set <String> child1 = dr2.getWindowHandles();
	for(String c1 : child1)
	{
		if(!c1.equals(orginal1))
		{
			dr2.switchTo().window(c1);
			break;
		}
	}
	
	   String s2 = dr2.getTitle();	
	   System.out.println(s2);

	   

	
	
	
	
}
	
	
	

}
