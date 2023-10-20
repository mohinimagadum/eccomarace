package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Baseclass;
import com.utilities.utility;

public class Homepage extends Baseclass {
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='client brand banner']") private WebElement Logo;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-main-menu-button']") private WebElement HideElement;
	
	@FindBy(xpath="//input[@fdprocessedid='ruwi0k']") private WebElement SearchInput;
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active toggle']") private WebElement Admin_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[1]") private WebElement PIM_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[2]") private WebElement Leave_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[3]") private WebElement Time_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[4]") private WebElement Recruitment_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[5]") private WebElement MyInfo_Module;
	
	@FindBy(xpath="//span[text()='Performance']")private WebElement Performance_Module;
	
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement Dashboard_Module;
	
	@FindBy(xpath="//span[text()='Directory']") private WebElement Directory_Module;
	
	@FindBy(xpath="//span[text()='Maintenance']")private WebElement Maintenance_Module;
	
	@FindBy(xpath="//span[text()='Claim']") private WebElement Claim_Module;
	
	@FindBy(xpath="//span[text()='Buzz']") private WebElement Buzz_Module;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") private WebElement Profile;
	
	@FindBy(xpath="//button[@title='Help']") private WebElement Help;
	
	
	
	public boolean LogoisDisplayed()
	{
		boolean a = Logo.isDisplayed();
		System.out.println("** Home Page Logo is displayed");
		return a;
	}
	
	public String HomePageTitle()
	{
		String a = driver.getTitle();
		System.out.println("* Home Page Title *");
		return a;
	}
	
	public String HomePageURL()
	{
		String a = driver.getCurrentUrl();
		System.out.println("** Home Page URL **");
		return a;
	}

	
	public void ClickOnAdmin_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnPIM_Module()
	{
		if(PIM_Module.isDisplayed())
		{
			PIM_Module.click();
		}
	}
	
	public void ClickOnLeave_Module()
	{
		if(Leave_Module.isDisplayed())
		{
			Leave_Module.click();
		}
	}
	
	public void ClickOnTime_Module()
	{
		if(Time_Module.isDisplayed())
		{
			Time_Module.click();
		}
	}
	
	public void ClickOnRecruitment_Module()
	{
		if(Recruitment_Module.isDisplayed())
		{
			Recruitment_Module.click();
		}
	}
	
	public void ClickOnMyInfo_Module()
	{
		if(MyInfo_Module.isDisplayed())
		{
			MyInfo_Module.click();
		}
	}
	
	public void ClickOnPerformance_Module()
	{
		if(Performance_Module.isDisplayed())
		{
			Performance_Module.click();
		}
	}
	
	public void ClickOnDirectory_Module()
	{
		if(Directory_Module.isDisplayed())
		{
			Directory_Module.click();
		}
	}
	
	public void ClickOnMaintenance_Module()
	{
		if(Maintenance_Module.isDisplayed())
		{
			Maintenance_Module.click();
		}
	}
	
	public void ClickOnClaim_Module()
	{
		if(Claim_Module.isDisplayed())
		{
			Claim_Module.click();
		}
		System.out.println("** Clicked on ");
	}
	
	public void ClickOnBuzz_Module()
	{
		if(Buzz_Module.isDisplayed())
		{
			Buzz_Module.click();
		}
		
		System.out.println("* Click on Admin Module *");
	}
	
	public void ClickOnHelp()
	{
		if(Help.isDisplayed())
		{
			Help.click();
		}
	}
	
	
	

}
