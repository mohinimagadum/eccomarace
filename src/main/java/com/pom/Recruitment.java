package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Recruitment extends Baseclass {
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Recruitment']") private WebElement Recruitment;
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") private WebElement Title;
	@FindBy(xpath="//a[text()='Vacancies']") private WebElement Vaccancies;
	
	public void ClickOnRecruitment_Module()
	{
		if(Recruitment.isDisplayed())
		{
			Recruitment.click();
		}
	}
	
	public String HomePageTitle()
	{
		String a = driver.getTitle();
		System.out.println("* Home Page Title *");
		return a;
	}
	
}
