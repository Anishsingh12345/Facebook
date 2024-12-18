package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class alert {
	
	
	public WebDriver dr ;
public alert(WebDriver dr)
{
	dr=this.dr;
}


By email = By.xpath("//*[@id='email']");
By logo =By.xpath("//*[@id='enterimg']");

By moveto = By.xpath("//*[@class='dropdown-toggle' and text()='SwitchTo']");
By Alerts = By.xpath("//*[contains(text(),'Alerts')]");

By button = By.xpath("//*[@class='btn btn-danger']");

By alert2 = By.xpath("//*[contains(text(),'Alert with Textbox ')]");
By clickalert = By.xpath("//*[contains(text(),'click the button to demonstrate the prompt box ')]");

public void method2(WebDriver dr2) throws InterruptedException
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

	
	WebElement buttonwe= dr2.findElement(button);
	js.executeScript("arguments[0].scrollIntoView();",buttonwe);
	buttonwe.click();
	Thread.sleep(3000);
	
Alert alt =dr2.switchTo().alert();
alt.accept();
Thread.sleep(3000);





WebElement alert2we= dr2.findElement(alert2);
js.executeScript("arguments[0].scrollIntoView();",alert2we);
alert2we.click();

Thread.sleep(3000);

WebElement clickalertwe= dr2.findElement(clickalert);
js.executeScript("arguments[0].scrollIntoView();",clickalertwe);
clickalertwe.click();

Thread.sleep(3000);

alt.sendKeys("my name is anish singh nathyal");
Thread.sleep(3000);

alt.accept();
Thread.sleep(3000);





}
}
