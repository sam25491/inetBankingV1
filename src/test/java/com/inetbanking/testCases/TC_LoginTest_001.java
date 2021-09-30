package com.inetbanking.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("username is entered");
		
		
		lp.setPassword(password);
		logger.info("password is entered");
		lp.clickSubmit();
		
		 if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		 {
			 Assert.assertTrue(true);
			 logger.info("Login test passed");
		 }
		 else
		 {
			 captureScreen(driver,"logintest");
			 Assert.assertTrue(false);
			 logger.info("Login Test failed");
		 }
			 
	}

}
