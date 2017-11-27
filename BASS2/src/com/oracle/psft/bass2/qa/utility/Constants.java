package com.oracle.psft.bass2.qa.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Constants {
	
	private static Properties prop;
	
	static
	{
		try {
			String configFile="config.properties";
			FileInputStream fs= new FileInputStream(configFile);
			prop=new Properties(System.getProperties());
			prop.load(fs);
			Log.info("Config file config.properties file found");
		}catch(Exception e){
			Log.error("Config file config.properties cannot be found"+e.getMessage());
			
		}
	}
	
	public static final String ChromeBrowserPath=prop.getProperty("ChormeBrowserPath");
	public static final String BrowserPath="C:\\OracleImage\\selenium\\webDriver\\chromedriver.exe";
	
	//public static final String URL="http://jqueryui.com/resources/demos/droppable/default.html";
	
	public static final String URL="http://toolsqa.com/automation-practice-switch-windows/";
	
	public static final String UserName="xiaoleisong";
	
	public static final String Password="4883131";
	
	public static final String Path_TestData="C://Users//xiaolson//eclipse-workspace//OnlineStore//src//testData//";
	
	public static final String File_TestData="TestData.xlsx";

}
