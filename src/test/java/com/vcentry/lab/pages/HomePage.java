package com.vcentry.lab.pages;

import org.openqa.selenium.By;

import com.vcentry.lab.initializer.Initializer;

public class HomePage extends Initializer {

	public static void clickSkillLink(){
		wd.findElement(By.id(locatorprop.getProperty("homepage_click_skill_id"))).click();
	
	}
	public static void clickLabLink(){
		wd.findElement(By.linkText(locatorprop.getProperty("homepage_click_labpractice_linktext"))).click();

	}
public static void clickFrameworkLink(){
		wd.findElement(By.id(locatorprop.getProperty("homepage_click_framework_id"))).click();

	}
	public static void clickSimpleFormLink(){
		wd.findElement(By.id(locatorprop.getProperty("homepage_click_sampleform_id"))).click();

	}
}
