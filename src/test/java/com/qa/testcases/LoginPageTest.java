package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void testResults() throws InterruptedException{
		loginPage.fillForm();
	   boolean flag = loginPage.validateResults();
		Assert.assertTrue(flag);	
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	
	
	

}
