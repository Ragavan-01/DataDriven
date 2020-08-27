package com.vcentry.lab.pages;

import org.openqa.selenium.By;

import com.vcentry.lab.initializer.Initializer;

public class LogoutPage extends Initializer {

	public static void clickLogoutLink()
	{
		wd.findElement(By.linkText("Logout")).click();
	}
}
