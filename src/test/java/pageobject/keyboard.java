package pageobject;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	
	public WebDriver dr ;
	public keyboard(WebDriver dr)
	{
		dr=this.dr;
	}

	By email = By.xpath("//*[@id='email']");
	By logo =By.xpath("//*[@id='enterimg']");
	
	By popup = By.xpath("//*[@style='margin-top: 20px']");

	


By moveto = By.xpath("//*[contains(text(),'More')]");
By Alerts = By.xpath("//*[text()='File Upload']");
By newtab= By.xpath("//a[contains(text(),'Download') and @type='button']");

By fileupload = By.xpath("//input[@type='file']");

By okk = By.xpath("");

public void windowmethod1(WebDriver dr2) throws InterruptedException
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
	
WebElement fileuploadwe= dr2.findElement(fileupload);
	js.executeScript("arguments[0].scrollIntoView();",fileuploadwe);
	
	fileuploadwe.sendKeys("C:\\Users\\Acer-Aspire7\\Pictures\\Aadhar.JPG");
	Thread.sleep(8000);
	
	
	
	
	
	
}
	
	
	

}
