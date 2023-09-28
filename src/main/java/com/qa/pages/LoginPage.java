package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(id="retirement-age")
	WebElement retirementage;
	
	@FindBy(id="current-age")
	WebElement currentage;
	
	@FindBy(id="current-income")
	WebElement currentincome;
	
	@FindBy(id="spouse-income")
	WebElement spouseincome;
	
	@FindBy(id="current-total-savings")  
	WebElement currentsavings;
	
	@FindBy(id="current-annual-savings")
	WebElement currentsavingseachyear;  
	
	@FindBy(id="savings-increase-rate")
	WebElement savingsincreaserate;   
	
	@FindBy(id="yes-social-benefits")
	WebElement yessocialbenefits;     
	
	@FindBy(id="married")
	WebElement marriedyes;

	@FindBy(id="social-security-override")
	WebElement socialsecurityoverride;
	
	@FindBy(xpath=".//a[text()='Adjust default values']")
	WebElement adjustdefaultvalueslink;
	

	@FindBy(id="additional-income")
	WebElement additionalincome;

	@FindBy(id="retirement-duration")
	WebElement retirementduration;

	@FindBy(id="include-inflation") 
	WebElement includeinflationyes;

	@FindBy(id="expected-inflation-rate")
	WebElement expectedinflationrate;      
	
	@FindBy(id="retirement-annual-income")
	WebElement retirmentannualincome;      
	
	@FindBy(id="pre-retirement-roi")
	WebElement preretirementroi;     
	
	
	@FindBy(id="post-retirement-roi")
	WebElement postretirementroi; 
	
	@FindBy(xpath=".//button[text()='Save changes']")
	WebElement savebutton;                              
	

	@FindBy(xpath=".//button[@data-tag-id='submit']")
	WebElement calculate;  
	
	@FindBy(xpath=".//div[@id='calculator-results-container']")
	WebElement results;
	  
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void fillForm() throws InterruptedException{
		retirementage.sendKeys("68");
		currentage.sendKeys("40");
		currentincome.click();
		currentincome.sendKeys("100000");
		currentsavings.click();
		currentsavings.sendKeys("500000");
		currentsavingseachyear.sendKeys("10");
		savingsincreaserate.sendKeys(".25");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", yessocialbenefits);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", marriedyes);
		socialsecurityoverride.sendKeys("4000");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", adjustdefaultvalueslink);
		additionalincome.sendKeys("500");
		retirementduration.sendKeys("20");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", includeinflationyes);
		retirmentannualincome.sendKeys("75");
		preretirementroi.sendKeys("8");
		postretirementroi.sendKeys("5");
		savebutton.click();
		calculate.click();
		Thread.sleep(5000);

			
	}
	
	public boolean validateResults(){
		return results.isDisplayed();
	}
}

