package com.oracle.psft.bass2.qa.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
	
	public static WebDriver LunchChrome()
	{
		String exePath=Constants.ChromeBrowserPath;
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		return driver;
	}

}
