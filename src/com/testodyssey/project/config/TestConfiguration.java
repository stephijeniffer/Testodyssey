package com.testodyssey.project.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.testodyssey.project.utils.DataHandler;

public class TestConfiguration 
{
public static WebDriver getInstance()
{
	WebDriver driver=null;
	String browserType=DataHandler.readDataFormPropertyFile("configuration","browser");
	String url=DataHandler.readDataFormPropertyFile("configuration", "url");
	if(browserType.equalsIgnoreCase("firefox"))
	{
	System.setProperty("WebDriver.firefox.marionette","./browser-server/geckodriver.exe");
	driver=new FirefoxDriver();
	}
	else if(browserType.equalsIgnoreCase("chrome"))
	{
		System.setProperty("WebDriver.chrome.driver","./browser-server/chromedriver.exe");
		driver=new ChromeDriver();	
	}
	else
	{
		System.err.println("---Inavlid browser--");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(url);
	return driver;
}


}
