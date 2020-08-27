package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.lab.utils.ReportOptimizer;

public class Initializer {
	/**
	 * create environment variables
	 */

	public static FileInputStream envfis=null;
	public static Properties envprop=null;
	
	/**
	 * create locator variable
	 */
	public static FileInputStream locatorfis=null;
	public static Properties locatorprop=null;
	
	/**
	 * Create Webdriver variable
	 */
	public static WebDriver wd=null;
	
	/**
	 * create Report Variables
	 */
	
	public static ExtentReports reports;
	public static ExtentTest log;
	public static boolean isReport=true;
	
	/**
	 * @author RAGAVAN
	 * @created date - 21 Aug 2020
	 * @throws IOException
	 * Initialize your property file, webdrivers and reports
	 */
	public static void initilize() throws IOException 
	{
		
		if(isReport) {
		ReportOptimizer.optimizeReport();
		reports=new ExtentReports("C:\\WORKSPACE\\DDDTest\\report\\tcreport.html");
		 isReport=false;
		}
		
		/**
		 * +File.separator+ -/ or \\
		 */
		
		envfis=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"lab"+File.separator+"config"+File.separator+"env.properties"));
		 envprop=new Properties();
		envprop.load(envfis);
		
		locatorfis=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"lab"+File.separator+"config"+File.separator+"locator.properties"));
		 locatorprop=new Properties();
		locatorprop.load(locatorfis);
		
		if(wd==null) {
		if(envprop.get("browser").equals("firefox"))
		{
			
			wd=new FirefoxDriver();
		}
		else if(envprop.get("browser").equals("chrome"))
		{
			wd=new ChromeDriver();
		}
		else if(envprop.get("browser").equals("ie"))
		{
			wd=new InternetExplorerDriver();
		}
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
}
