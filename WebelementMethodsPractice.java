package com.webelementmethods;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethodsPractice {

	public static void main(String[] args) {
	
 System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  
		  driver.get("https://www.facebook.com/");
		  
		  
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("deepikramesh21@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("Deepu");
		
		WebElement btn = driver.findElement(By.name("login"));
		
		btn.click();
		
		
		  
		    
		  

			
	
	

	}

}
