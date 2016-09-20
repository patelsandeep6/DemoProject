package com.learnautomation.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoforMevan {
	
	WebDriver driver;
	
	
	@Test
	public void login()
	{
	
		driver= new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		//System.out.println("Maven setup is done");
		//driver.quit();
		
		
		
	}

}
