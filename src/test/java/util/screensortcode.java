package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screensortcode {
	public File file;
	public String filepath="C:\\Users\\Acer-Aspire7\\eclipse-workspace\\com.pro\\test-output\\screensortTESTCASES\\";
	
	public WebDriver dr;
	public screensortcode( WebDriver dr)
	{
    this.dr=dr;		
	}
	
	
	public void screensortmethod(WebDriver dr,String pathname)
	{
		
		 LocalDateTime now = LocalDateTime.now();

	        // Define a format for the date-time string (e.g., yyyy-MM-dd_HH-mm-ss)
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM-dd-yyyy, hh-mm a ");

	        // Format the date-time and print
	        String dateStamp = now.format(formatter);
		
		file = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);

		try {
			Files.copyFile(file,  new File(filepath+pathname+"-"+dateStamp+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 