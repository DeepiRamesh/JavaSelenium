package com.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
    String url = "https://www.amazon.in/";

    System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
				  
	WebDriver driver = new ChromeDriver();
				  
	driver.manage().window().maximize();
		    
	driver.get(url);	
	    
	Thread.sleep(3000);	
	
	WebElement bs = driver.findElement(By.xpath("//a[text() = 'Best Sellers']"));
	
	Actions act = new Actions(driver);
	
	act.contextClick(bs).build().perform();
	
	Robot robo = new Robot();
	
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
    robo.keyPress(KeyEvent.VK_ENTER);
	
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	//Expect result = Orange colour
	
	//Actual result = Orange colour
		
	//Test case = Pass
	
	System.out.println("----------------------------------------");
	
	String cu = driver.getCurrentUrl();
	
	System.out.println(cu);
	
	Thread.sleep(3000);
	
	System.out.println("-----------------------------------------");
	
	System.out.println("------------------------------------------");
	
	WebElement sm = driver.findElement(By.xpath("//a[text() ='See More']"));
	
	sm.click();
	
	//Expect result = https://www.amazon.in/gp/bestsellers/luggage
	
	//Actual result = https://www.amazon.in/gp/bestsellers/luggage
	
	//Test case = Pass
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
