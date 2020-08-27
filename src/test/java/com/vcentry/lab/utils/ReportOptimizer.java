package com.vcentry.lab.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ReportOptimizer {

	
	public static void optimizeReport() throws IOException {
		
		//copy screenshot to old 
		
		//create new folder - current date
		
		//clean screenshot
		//Date date=new Date();
		SimpleDateFormat sf= new SimpleDateFormat("dd-M-yyyy hh-mm-ss");
		//String data =sf.format(date);
		String data=sf.format(new Date());

		
		File src=new File("C:\\WORKSPACE\\DDDTest\\screen");
		File dst=new File("C:\\WORKSPACE\\DDDTest\\oldscreenshot\\"+data);
		FileUtils.copyDirectory(src, dst);
		FileUtils.cleanDirectory(src);
		
	}
}
