package com.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodsPractice {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.zomato.com/");
		  
		  driver.navigate().to("https://www.swiggy.com/");
		  
		  driver.navigate().back();
		  
		  driver.navigate().forward();
		  
		  driver.navigate().refresh();
		  
		  String title = driver.getTitle();
		  
		  System.out.println(title);
		  
		  String cu = driver.getCurrentUrl();
		  
		  System.out.println(cu);
		  
		  driver.close();
		  
		  driver.quit();
	}
		  
		    
		  
	}
			
		


	


