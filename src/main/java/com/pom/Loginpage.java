package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;
import com.utilities.utility;

public class Loginpage extends Baseclass {
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Username : Admin']") private WebElement username;
	@FindBy(xpath="//p[text()='Password : admin123']") private WebElement password;
	@FindBy(name="username") private WebElement inputusername;
	@FindBy(name="password") private WebElement inputpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	@FindBy(xpath="//p[text()='Forgot your password? ']") private WebElement forgotpasswordlink;
	@FindBy(xpath="//img[@alt='company-branding']") private WebElement logo;
	
     public String getUsername()
     {
    	
    	String a= username.getText();
    	 return a.substring(a.indexOf('A')); 
    	 
     }
     
     public String getPassword()
     {
    	
    	 String a=password.getText();
    	 return a.substring(11);
     }
     
     public void ClickOnLoginButton()
     {
    	 LoginButton.click();
     }

	
	public void setInputusername(String Setusername) {
		 inputusername.sendKeys(Setusername);
	}

	
	public void setInputpassword(String Setpassword) {
		 inputpassword.sendKeys(Setpassword);
	}
	
	
	public boolean Logo()
	{
		utility.WaitForVisibility("//img[@alt='company-branding']");
		boolean a=logo.isDisplayed();
		System.out.println(a);
		return a;
	}
	
	public void ClickOnforgotpasswordLink()
	{
		forgotpasswordlink.click();
	}

}
