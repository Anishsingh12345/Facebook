package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class frame {
	
	public WebDriver dr ;
	public frame(WebDriver dr)
	{
		dr=this.dr;
	}

	
	By email = By.xpath("//*[@id='email']");
	By logo =By.xpath("//*[@id='enterimg']");

	


By moveto = By.xpath("//*[@class='dropdown-toggle' and text()='SwitchTo']");
By Alerts = By.xpath("//*[text()='Frames']");

By frame = By.xpath("//iframe[@id='singleframe']");

By frame1 = By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']");

By button = By.xpath("//input[@type='text']");

By button1 = By.xpath("//input[@type='text']");


By nestedframe= By.xpath("//a[contains(text(),'Iframe with in an Iframe')]");

By nesframe=By.xpath("//iframe[@style='float: left;height: 300px;width:600px']");


	public void method3(WebDriver dr2) throws InterruptedException
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

		
		WebElement framewe=dr2.findElement(frame);
		js.executeScript("arguments[0].scrollIntoView();",framewe);

		 dr2.switchTo().frame(framewe);
		
		List <WebElement> buttonwe= dr2.findElements(button);
		int s1 = buttonwe.size();
		for(int i=0 ; i<s1;i++)
		{
			try
			{
				if(i==0)
				{
		js.executeScript("arguments[0].scrollIntoView();",buttonwe.get(i));
		buttonwe.get(i).click();
		buttonwe.get(i).sendKeys("my name is anish");
				}
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
		Thread.sleep(3000);
		
		
		dr2.switchTo().defaultContent();
		
		
		
		
		WebElement nestedframewe = dr2.findElement(nestedframe);
		js.executeScript("arguments[0].scrollIntoView();",nestedframewe);
		nestedframewe.click();
		
		
		 
		 WebElement nesframewe=dr2.findElement(nesframe);
			js.executeScript("arguments[0].scrollIntoView();",nesframewe);

			 dr2.switchTo().frame(nesframewe);
			

				WebElement framewe1=dr2.findElement(frame1);
				js.executeScript("arguments[0].scrollIntoView();",framewe1);

				 dr2.switchTo().frame(framewe1);
			 
				 
				 
				 
					List <WebElement> buttonwe1= dr2.findElements(button1);
					int s2 = buttonwe1.size();
			 for(int j=0 ; j<s2;j++)
				{
					try
					{
						if(j==1)
						{
				js.executeScript("arguments[0].scrollIntoView();",buttonwe1.get(1));
				buttonwe1.get(1).click();
				buttonwe1.get(1).sendKeys("my name is anish jatt");
						}
					}
					catch(Exception e)
					{
						e.getMessage();
					}
				}
				Thread.sleep(3000);
				
				dr2.switchTo().defaultContent();

				dr2.switchTo().defaultContent();

	}
	
	
	
	
	
	//
	//

	
}
