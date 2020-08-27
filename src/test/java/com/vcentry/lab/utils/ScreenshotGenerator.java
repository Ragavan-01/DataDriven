package com.vcentry.lab.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;

public class ScreenshotGenerator extends Initializer {

	public static void screenshotGenerator(ITestResult it) throws IOException
	{
		
		 
			 Object [] data= it.getParameters();
			 String testid=data[0].toString();
			
		    	 if(it.isSuccess())
		    	 {
		    	 String path=takeScreenshot(testid);
		    	 
		    	 log.log(LogStatus.PASS, "testcase pass", log.addScreenCapture(path));
		    	 }else 
		    	 {
		        	 String path=takeScreenshot(testid);
		        	 log.log(LogStatus.FAIL, "testcase failed", log.addScreenCapture(path));
		          }
		    	 reports.endTest(log);
		    	 reports.flush();
		     }
			
			public static String takeScreenshot(String name) throws IOException{
				File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				File dst=new File("C:\\WORKSPACE\\DDDTest\\screen\\"+name+".jpg");
				FileUtils.copyFile(src, dst);
				return dst.toString();	
			}
	}

