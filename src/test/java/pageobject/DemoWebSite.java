package pageobject;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.BaseClass1;

public class DemoWebSite {
	
	public static	WebDriver  dr1;
	
	public DemoWebSite(WebDriver dr2)
	{
		dr2=this.dr1;
	}
	
	By email = By.xpath("//*[@id='email']");
	By logo =By.xpath("//*[@id='enterimg']");
	By firstname = By.xpath("//*[@placeholder='First Name']");
	By lastname = By.xpath("//*[@placeholder='Last Name']");	
	By adress = By.xpath("//*[@class='form-control ng-pristine ng-valid ng-touched']");
	By email1 = By.xpath("//*[@type='email']");
	By phone = By.xpath("//*[@type='tel']");
	By gender = By.xpath("//*[@type='radio' and @value='Male']");
	By check = By.xpath("//*[@type='checkbox']");
	By lang = By.xpath("//*[@id='msdd']");
	By landsel = By.xpath("//*[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[6]//a");
	By selectskill = By.xpath("//select[@id='Skills']");
	By country = By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']");
	
	By popup= By.xpath("//*[@id='basicBootstrapForm']");
	
	
	public void method(WebDriver dr1) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)dr1;

		WebElement emailwe= dr1.findElement(email);
		js.executeScript("arguments[0].scrollIntoView();",emailwe);
		emailwe.click();
		emailwe.clear();
		emailwe.sendKeys("anishnathyal@gmail.com");
		Thread.sleep(3000);
		
		
		WebElement logowe= dr1.findElement(logo);
		js.executeScript("arguments[0].scrollIntoView();",logowe);
		logowe.click();
		
		Thread.sleep(3000);
		
		
		WebElement firstnamewe= dr1.findElement(firstname);
		js.executeScript("arguments[0].scrollIntoView();",firstnamewe);
		firstnamewe.sendKeys("ANISH");
		Thread.sleep(3000);
		
		Actions act4 = new Actions(dr1);
		act4.sendKeys(Keys.CONTROL, "a").perform();
		act4.sendKeys(Keys.CONTROL, "c").perform();
		act4.sendKeys(Keys.CONTROL, "v").perform();

		act4.sendKeys(Keys.CONTROL, "v").perform();
		act4.sendKeys(Keys.CONTROL, "v").perform();



		
		
		
		
		WebElement lastnameWE= dr1.findElement(lastname);
		js.executeScript("arguments[0].scrollIntoView();",lastnameWE);
		lastnameWE.click();
		lastnameWE.clear();
		lastnameWE.sendKeys("NATHYAL");
		Thread.sleep(3000);
		
		
		
		/*WebElement adresswe= dr1.findElement(adress);
		js.executeScript("arguments[0].scrollIntoView();",adresswe);
		adresswe.click();
		adresswe.clear();
		adresswe.sendKeys("jourian kothi ward no 6");
*/		
		
		WebElement email1we= dr1.findElement(email1);
		js.executeScript("arguments[0].scrollIntoView();",email1we);
		email1we.click();
		email1we.clear();
		email1we.sendKeys("anishnathyal@gmail.com");
		Thread.sleep(3000);
		
		
		
		
		WebElement phonewe= dr1.findElement(phone);
		js.executeScript("arguments[0].scrollIntoView();",phonewe);
		phonewe.click();
		phonewe.clear();
		phonewe.sendKeys("969689");
		
		Thread.sleep(3000);
		
		
		
		
		WebElement genderwe = dr1.findElement(gender);
		if(genderwe.isEnabled())
		{
			try
			{
			js.executeScript("arguments[0].scrollIntoView();",genderwe);
			genderwe.click();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
		
		
		
		List <WebElement> checkwe = dr1.findElements(check);
		int s = checkwe.size();
		
		for(int i=0 ; i<s ; i++)
		{
		if(i==0 || i==2)	
		{
			try
			{
			js.executeScript("arguments[0].scrollIntoView();",checkwe.get(i));
			checkwe.get(i).click();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
		}
		
		
		
		
		
		//
		WebElement langwe= dr1.findElement(lang);
		js.executeScript("arguments[0].scrollIntoView();",langwe);
		langwe.click();
		
	
		WebElement landselwe= dr1.findElement(landsel);
		js.executeScript("arguments[0].scrollIntoView();",landselwe);
		landselwe.click();
		Thread.sleep(3000);
		
		WebElement popupwe = dr1.findElement(popup);
		js.executeScript("arguments[0].scrollIntoView();",popupwe);

		Actions act = new Actions(dr1);
		act.moveToElement(popupwe).click().build().perform();
				
		
		Thread.sleep(10000);

		
		
		//
		WebElement selectskillwe = dr1.findElement(selectskill);
		js.executeScript("arguments[0].scrollIntoView();",selectskillwe);

		Select sel = new Select(selectskillwe);
		sel.selectByValue("Certifications");
		
		
	
		
		
		
	}
	
	
	

}
