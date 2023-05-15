package com.mouseandkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardPractice {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
	WebDriver driver = new ChromeDriver();
					  
	driver.manage().window().maximize();
					  
	driver.get("https://www.google.com/");
		
	WebElement btn = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[2]/a"));

	Actions act = new Actions(driver);
	
	act.click(btn).build().perform();
	
	
	
	}

}
