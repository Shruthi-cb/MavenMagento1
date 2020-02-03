package com.abc.testobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.testmain.Login;
import com.abc.testmain.MyAccount;
import com.abc.testmain.Welcome;

public class MagentoTest 
{
	public static void main(String args[])
	{
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.magento.com");
    
	Welcome w = new Welcome(driver);
	w.clickOnMyAccount();
	
	Login l = new Login(driver);
	l.enterEmail("shruthicb1947@gmail.com");
	l.enterPassword("Welcome@123");
	l.clickOnLogin();
	
	MyAccount m = new MyAccount(driver);
	m.clickOnLogout();
	driver.quit();
	}
	
	
}

