package com.vcentry.lab.testCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.lab.initializer.Initializer;
import com.vcentry.lab.inputReader.InputReader;
import com.vcentry.lab.pages.CheckOutPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.LoginPage;
import com.vcentry.lab.pages.LogoutPage;
import com.vcentry.lab.utils.ScreenshotGenerator;
public class HomePageTest extends Initializer{

	@Test(dataProvider = "HomePageTest")
	public  void validateHomePage(String testid,String username,String password, String product,String mobile,String mail,String productcat,String productqty,String name) throws IOException {
		initilize();
		wd.get(envprop.getProperty("url"));
		
		 /** 
		 * Stage 1	
		 * 		//Login
				wd.findElement(By.linkText("Login")).click();
				wd.findElement(By.name("username")).sendKeys("user1");//0
				wd.findElement(By.name("password")).sendKeys("Guru@12345");//1
				wd.findElement(By.name("password")).submit();
				
				//HomePage
				wd.findElement(By.id("navbarDropdownMenuLink")).click();
				wd.findElement(By.linkText("Lab Practice")).click();
				wd.findElement(By.id("element44")).click();
				wd.findElement(By.id("element45")).click();
				
				//CheckoutPage
				wd.findElement(By.id("id0")).sendKeys("sample");//2
				wd.findElement(By.id("id1")).sendKeys("123456");//3
				wd.findElement(By.id("id2")).sendKeys("abc@123.com");//4
				WebElement prodcat=wd.findElement(By.id("id3"));//5
				Select s=new Select(prodcat);
				s.selectByVisibleText("Electrical");
				wd.findElement(By.id("id4")).sendKeys("12");//6
				wd.findElement(By.id("id5")).sendKeys("user3");//7
				
				wd.findElement(By.id("idyes")).click();
				wd.findElement(By.id("cod")).click();
				wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div[1]/div/div/form/div/div/div[10]/div[2]/button")).click();
				*/
		//Stage2
		
//		//Loginpage
//		wd.findElement(By.linkText(locatorprop.getProperty("LOGINPAGE_CLICK_LOGIN_LINKTEXT"))).click();
//		wd.findElement(By.name(locatorprop.getProperty("loginpage_type_username_name"))).sendKeys("user13");
//		wd.findElement(By.name(locatorprop.getProperty("loginpage_type_password_name"))).sendKeys("ragav1234");
//		wd.findElement(By.name(locatorprop.getProperty("loginpage_type_password_name"))).submit();
//		
//		//HomePage
//		wd.findElement(By.id(locatorprop.getProperty("homepage_click_skill_id"))).click();
//		wd.findElement(By.linkText(locatorprop.getProperty("homepage_click_labpractice_linktext"))).click();
//		wd.findElement(By.id(locatorprop.getProperty("homepage_click_framework_id"))).click();
//		wd.findElement(By.id(locatorprop.getProperty("homepage_click_sampleform_id"))).click();
//		
//		//CheckoutPage
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_productname_id"))).sendKeys("sample");
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_mobilenum_id"))).sendKeys("123456");
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_email_id"))).sendKeys("abcd@123.com");
//		WebElement prodcat=wd.findElement(By.id(locatorprop.getProperty("checkoutpage_select_prodcat_id")));
//		Select s=new Select(prodcat);
//		s.selectByVisibleText("Electrical");
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_productqty_id"))).sendKeys("12");
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_type_purchasename_id"))).sendKeys("user");
//		
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_check_gst_id"))).click();
//		wd.findElement(By.id(locatorprop.getProperty("checkoutpage_check_cod_id"))).click();
//		wd.findElement(By.name(locatorprop.getProperty("checkoutpage_click_placeoder_id"))).click();
//		
		//Stage 3
		LoginPage.clickLoginLink();
		LoginPage.enterUserName(username);//0
		LoginPage.enterPassword(password);//1
		LoginPage.submitLoginButton();
		
		HomePage.clickSkillLink();
		HomePage.clickLabLink();
		HomePage.clickFrameworkLink();
		HomePage.clickSimpleFormLink();
		
		CheckOutPage.enterProductName(product);//2
		CheckOutPage.enterMobileNumber(mobile);//3
		CheckOutPage.enterEmail(mail);//4
		CheckOutPage.selectProductcat(productcat);//5
		CheckOutPage.enterProductQty(productqty);//6
		CheckOutPage.enterPurchaserName(name);//7
		CheckOutPage.checkGst();
		CheckOutPage.checkCod();
		CheckOutPage.clickPlaceOrder();
		LogoutPage.clickLogoutLink();
		
		log=reports.startTest(testid+"---completed---");
	}
	@DataProvider(name="HomePageTest")
	public static Object[][] getCheckoutData() throws Exception {
		
		if(InputReader.runModeVerification("HomePageTest"))
		{
			Object [][] data= InputReader.selectSingleDataOrMulitiData("HomePageTest");
			return data;
//		Object[][] data=new Object[3][8];
//		//1st data set
//		data[0][0]="user13";
//		data[0][1]="ragav1234";
//		data[0][2]="123";
//		data[0][3]="534534";
//		data[0][4]="abc@123";
//		data[0][5]="Electrical";
//		data[0][6]="12";
//		data[0][7]="userabc";
//		
//		//2nd data set
//		data[1][0]="user13";
//		data[1][1]="ragav1234";
//		data[1][2]="123";
//		data[1][3]="5345534";
//		data[1][4]="abc1@123";
//		data[1][5]="Electrical";
//		data[1][6]="11";
//		data[1][7]="userabc1";
//		
//		//3rd data set
//		data[2][0]="user13";
//		data[2][1]="ragav1234";
//		data[2][2]="123";
//		data[2][3]="5344534";
//		data[2][4]="abc2@123";
//		data[2][5]="Electrical";
//		data[2][6]="13";
//		data[2][7]="userabc2";
//		return data;
			
		}
		return null;
	}
	@AfterMethod
	public void teardown(ITestResult it) throws Exception {
		ScreenshotGenerator.screenshotGenerator(it);
	}
}
