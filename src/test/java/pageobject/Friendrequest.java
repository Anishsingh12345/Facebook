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


public class Friendrequest {
	
	public static	WebDriver  dr1;
	
	public Friendrequest(WebDriver dr1)
	{
		
		//by webelemnt
		this.dr1=dr1;
		
	}
	
	
	By peoplrsymbol = By.xpath("//*[@class='xfx01vb x1lliihq x1tzjh5l x1k90msu x2h7rmj x1qfuztq']");
	By friendrequest=By.xpath("//div[@class='x78zum5 xdt5ytf x1xmf6yo x1e56ztr xq8finb x1n2onr6 xqcrz7y']//*[@data-visualcompletion='css-img' and @class='x1b0d499 xep6ejk']");    //text will work - input , div etc....svg/span - it wil fail
	By viewfriend = By.xpath("//*[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x4zkp8e x676frb x1nxh6w3 x1sibtaa xo1l8bm x1fey0fg']");
	By sarkatasunil = By.xpath("//*[contains(text(),'Sarkata Sunil')]");
	By popup = By.xpath("//div[@class='x2bj2ny x1afcbsf x78zum5 xdt5ytf x1t2pt76 x1n2onr6 x1cvmir6 xcoz2nd xxzkxad x1r98mxo xiylbte xoa9owu x19d5s1r xwn1f64']");
	By popupp=By.xpath("//*[@class='x9f619 x1n2onr6 x78zum5 xdt5ytf x193iq5w xeuugli x2lah0s x1t2pt76 x1xzczws x1cvmir6 x1vjfegm']");
    By popuppp = By.xpath("//*[@class='xb57i2i x1q594ok x5lxg6s x78zum5 xdt5ytf x6ikm8r x1ja2u2z x1pq812k x1rohswg xfk6m8 x1yqm8si xjx87ck xx8ngbg xwo3gff x1n2onr6 x1oyok0e x1odjw0f x1e4zzel x1tbbn4q x1y1aw1k x4uap5 xwib8y2 xkhd6sd']");
    By sarkataname = By.xpath("//*[@class='html-h1 xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1vvkbs x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']");
public void Friendrequesttestcase(WebDriver driver1)
{
	
	
	//people symbol 
	JavascriptExecutor js = (JavascriptExecutor)driver1;
	

	

	List <WebElement> peoplrsymbolwebele = driver1.findElements(peoplrsymbol);
	int size1 = peoplrsymbolwebele.size();
	
	for(int i=0 ; i<size1;i++)
	{
		try
		{
			if(i==3)
			{
				  peoplrsymbolwebele.get(i).click();

			}
		}
		catch(Exception e)
		{
			if(i==3)
			{
			  js.executeScript("arguments[0].scrollIntoView(true);",peoplrsymbolwebele.get(i));

			  peoplrsymbolwebele.get(i).click();
			}

		}
	}

	
	
	
	//friend request
	WebElement popupwebele = driver1.findElement(popup);
	  Actions a = new Actions(driver1);
	  a.moveToElement(popupwebele);

	
		List <WebElement> friendrequestwebele = driver1.findElements(friendrequest);
		
		int size3 = friendrequestwebele.size();
		
		for(int k=0 ; k<size3 ; k++)
		{
			try
			{
				if(k==0)
				{
					friendrequestwebele.get(k).click();

				}
			}
			catch(Exception e)
			{
				if(k==3)
				{
				  js.executeScript("arguments[0].scrollIntoView(true);",friendrequestwebele.get(k));

				  friendrequestwebele.get(k).click();
				}

			}
		}
	


	
	//view friend request
		
		WebElement popupwebelee = driver1.findElement(popupp);
		  Actions aa = new Actions(driver1);
		  aa.moveToElement(popupwebelee);

	WebElement viewfriendwebele = driver1.findElement(viewfriend);
	  js.executeScript("arguments[0].scrollIntoView(true);",viewfriendwebele);
	  viewfriendwebele.click();


	
	//sarkata friend request
	  
	  WebElement popupwebeleee = driver1.findElement(popuppp);
	  Actions aaa = new Actions(driver1);
	  aaa.moveToElement(popupwebeleee);

List	<WebElement> sarkatasunilwebele = driver1.findElements(sarkatasunil);
int size = sarkatasunilwebele.size();
	  
	  for(int i=0 ; i<size ; i++)
	  {
		  try
		  {
			  sarkatasunilwebele.get(0).click();

		  }
		  catch(Exception e)
		  {
			  js.executeScript("arguments[0].scrollIntoView(true);",sarkatasunil);

			  sarkatasunilwebele.get(0).click();

		  }
	  }

	  
	  //sarkata details
	  
	
	
	
	  List	<WebElement> sarkatanamewebele = driver1.findElements(sarkataname);
	  int size4 = sarkatanamewebele.size();
	  	  
	  	  for(int i=0 ; i<size4 ; i++)
	  	  {
	  		  try
	  		  {
	  			  if(i==1) {
	  	  			sarkatanamewebele.get(i).getTagName();
	  			  }
	  		  }
	  		  catch(Exception e)
	  		  {
	  			  if(i==1) {
	  			  js.executeScript("arguments[0].scrollIntoView(true);",sarkatanamewebele.get(i));
	  			sarkatanamewebele.get(i).getTagName();
	  		
	  			  }


	  		  }
	  	  }

	 	  
	  	  
	  	
	  	
	  	
   







}
}





