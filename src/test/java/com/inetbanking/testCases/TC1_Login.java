package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC1_Login extends BaseClass{
	
	
	@Test
	public void LoginTest() throws Exception
	{
		driver.get(baseUrl1);
		Logger.info("Url entered");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.pfName(firstName);
		Logger.info("first name entered");
		Thread.sleep(5000);
		
		lp.plName(lastName);
		Logger.info("last name entered");
		Thread.sleep(5000);
		
		lp.personAddress(address);
		Logger.info("Address entered");
		Thread.sleep(5000);
		
		lp.pemail(mailid);
		Logger.info("email entered");
		Thread.sleep(5000);
		
		lp.pGender();
		Logger.info("Gender entered");
		Thread.sleep(5000);
		
		lp.perCheckbox();
		Logger.info("checkbox entered");
		Thread.sleep(5000);
		
		
	}

}
