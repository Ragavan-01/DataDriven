package com.vcentry.lab.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.lab.initializer.Initializer;

public class CheckOutPage extends Initializer {

	
	public static void enterProductName(String product)
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_productname_id"))).sendKeys(product);
	}
	public static void enterMobileNumber(String mobile)
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_mobilenum_id"))).sendKeys(mobile);
	}
	public static void enterEmail(String mail)
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_email_id"))).sendKeys(mail);
		
	}
	public static void selectProductcat(String option)
	{
		WebElement prodcat=wd.findElement(By.id(locatorprop.getProperty("checkoutpage_select_prodcat_id")));
		Select s=new Select(prodcat);
		s.selectByVisibleText(option);
	}
	public static void enterProductQty(String qty)
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_productqty_id"))).sendKeys(qty);
		
	}
	public static void enterPurchaserName(String name)
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_purchasename_id"))).sendKeys(name);
		
	}
	public static void checkGst()
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_check_gst_id"))).click();
		
	}
	public static void checkCod()
	{
		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_check_cod_id"))).click();
		
		
	}
	public static void clickPlaceOrder()
	{
		wd.findElement(By.name(locatorprop.getProperty("checkoutpage_click_placeoder_id"))).click();
		
	}
}
