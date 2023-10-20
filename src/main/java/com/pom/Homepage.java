package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Baseclass;
import com.utilities.utility;

public class Homepage extends Baseclass {
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@alt='client brand banner']") private WebElement logo;
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") private WebElement Title;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") private WebElement dropdown;
	@FindBy(xpath="//a[text()='About']") private WebElement about;
	@FindBy(xpath="//a[text()='Support']") private WebElement Support;
	@FindBy(xpath="//a[text()='Change Password']") private WebElement changepassword;
	@FindBy(xpath="//a[text()='Logout']") private WebElement Logout;
	@FindBy(xpath="//input[@fdprocessedid='ruwi0k']") private WebElement SearchInput;
	@FindBy(xpath="//span[text()='Admin']") private WebElement Admin_Module;
	@FindBy(xpath="//span[text()='PIM']") private WebElement PIM_Module;
	
	
	public boolean Logo()
	{
		utility.WaitForVisibility("//img[@alt='client brand banner']");
		boolean a=logo.isDisplayed();
		System.out.println(a);
		return a;
	}
	
     public String Title()
     {
    	
    	String a= Title.getText();
    	 return a;
     }
     
     public Select Dropdown()
     {
    	 Select s=new Select(dropdown);
    	 System.out.println(s.isMultiple());
    	 s.selectByVisibleText("about"); 
    	
    	 return s;
     }
     
     public void ClickOnLogout()
     {
    	 Logout.click();
     }
     
     public void ClickOnAdmin()
     {
    	 Admin_Module.click();
     }
     
     public void SearchBox(String s)
     {
    	 SearchInput.sendKeys(s);
     }
     
     public String text()
     {
    	
    	String a= PIM_Module.getText();
    	 return a; 
    	 
     }
     
     
     

}
