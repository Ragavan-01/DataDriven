package com.vcentry.lab.pages;

import org.openqa.selenium.By;

import com.vcentry.lab.initializer.Initializer;

public class LoginPage extends Initializer{

	public static void clickLoginLink() {
		wd.findElement(By.linkText(locatorprop.getProperty("LOGINPAGE_CLICK_LOGIN_LINKTEXT"))).click();

	}

	public static void enterUserName(String user) {
		wd.findElement(By.name(locatorprop.getProperty("loginpage_type_username_name"))).sendKeys(user);//0

	}
public static void enterPassword(String password) {
		wd.findElement(By.name(locatorprop.getProperty("loginpage_type_password_name"))).sendKeys(password);//1

	}

	public static void submitLoginButton() {
		wd.findElement(By.name("password")).submit();

	}
}
