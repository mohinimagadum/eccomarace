package com.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Baseclass;
import com.pom.Homepage;
import com.pom.Loginpage;

public class HomePageTest extends Baseclass {
	

	Homepage home;
	Loginpage login;
	SoftAssert soft = new SoftAssert();
	@BeforeMethod
	public void SetUp() throws IOException
	{
		LaunchTheWeb();
		login = new Loginpage();
		login.setInputusername(login.getUsername());
		login.setInputpassword(login.getPassword());
		login.ClickOnLoginButton();
		home = new Homepage();
	}
	
	@Test (priority=1)
	public void ValidateLogoIsDisplayed()
	{
		boolean Actual = home.LogoisDisplayed();
		soft.assertTrue(Actual);
		soft.assertAll();
	}
	
	@Test (priority=2)
	public void ValidateHomePageURL()
	{
		String Actual = home.HomePageURL();
		String Expected = prop.getProperty("HomePageLink");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test (priority=3)
	public void ValidateHomePageTitle()
	{
		String Actual = home.HomePageTitle();
		String Expected = prop.getProperty("HomePageTitle");
		soft.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=4)
	public void ValidateClickedOnAdminModule()
	{
		home.ClickOnAdmin_Module();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("AdminModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test  (priority=5)
	public void ValidateClickedOnPIM_Module()
	{
		home.ClickOnPIM_Module();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("PIMModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	
	@Test  (priority=6)
	public void ValidateClickedOnLeave_Module()
	{
		home.ClickOnLeave_Module();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("LeaveModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	@Test  (priority=7)
	public void ValidateClickedOnTime_Module()
	{
		home.ClickOnTime_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("TimeModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	@Test  (priority=8)
	public void ValidateClickedOnRecruitment_Module()
	{
		home.ClickOnRecruitment_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("RecruitmentTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
	
	}
	
	@Test  (priority=9)
	public void ValidateClickedOnInfo_Module()
	{
		home.ClickOnMyInfo_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("MyInfoTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
	
	}
	
	@Test  (priority=10)
	public void ValidateClickedOnPerformance_Module()
	{
		home.ClickOnPerformance_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("PerformanceTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
	
	}
	
	@Test  (priority=11)
	public void ValidateClickedOnDirectory_Module()
	{
		home.ClickOnDirectory_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("DirectoryTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test  (priority=12)
	public void ValidateClickedOnMaintenance_Module()
	{
		home.ClickOnMaintenance_Module();
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("MaintenanceURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=13)
	public void ValidateClickedOnClaim_Module()
	{
		home.ClickOnClaim_Module();
	    String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("ClaimTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	@Test  (priority=14)
	public void ValidateClickedOnBuzz_Module()
	{
		home.ClickOnBuzz_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("BuzzTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
	
	}
	
	@Test (priority=15)
	public void ValidateClickedOnHelp()
	{
		home.ClickOnHelp();
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("HelpURL");
		Assert.assertEquals(Actual, Expected);
	}
	

	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	
	

}
