package com.mycompany.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.gargoylesoftware.htmlunit.javascript.host.geo.Geolocation;


public class SelTestCase {
	protected WebDriver driver;
	@BeforeMethod
	@Parameters({"Browser"})
	public void openbrowser(char Browser)
	{
		switch(Browser)
		{ case 'c': System.setProperty("webdriver.chrome.driver", "C:/selenium-2.43.0/drivers/chromedriver.exe");
			             driver=new ChromeDriver();
			            
			break;
		case 'f' :driver=new FirefoxDriver();
					
		
		
		}        
		
	}
	
	public void openpage(String url)
	{
		driver.get(url);
	}
	@AfterMethod
	public void closebrowser(ITestResult result) throws IOException
	{
		if(!result.isSuccess())
		{
			File imagefile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String failureImageFileName=result.getMethod().getMethodName()+new SimpleDateFormat("MM-dd-yy_HH-ss")
			.format(new GregorianCalendar().getTime()) +".png";
			File failureimagefile= new File(failureImageFileName);
			FileUtils.moveFile(imagefile, failureimagefile);
		}
		driver.close();
		driver.quit();
	}

}

