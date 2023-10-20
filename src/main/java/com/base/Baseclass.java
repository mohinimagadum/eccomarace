package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	
	public static  Properties prop;
	public static WebDriver driver;
	
	public static String projectpath= System.getProperty("user.dir");
	
	 public WebDriver LaunchTheWeb() throws IOException
	 {
		System.out.println(projectpath);
		 
		 
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		  prop= new Properties();
		  FileInputStream fileinputstream = new FileInputStream(".\\src\\main\\resources\\Exceldata\\Property\\config.properties");
		 
		 prop.load(fileinputstream);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get(prop.getProperty("WebUrl"));
		 return driver;
		 
	 }
	 
	

}
