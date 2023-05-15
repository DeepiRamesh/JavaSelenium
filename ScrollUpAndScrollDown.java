package com.scrollupscrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown {

	public static void main(String[] args) throws InterruptedException {
	
	String url = "https://www.amazon.com/";

	System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
				  
	WebDriver driver = new ChromeDriver();
				  
    driver.manage().window().maximize();
		    
	driver.get(url);	
	    
	Thread.sleep(5000);
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
	
	WebElement bp = driver.findElement(By.xpath("a[class = 'nav_a']"));

    je.executeScript("arguments[0].scrollIntoView()", bp);
    
    WebElement btn = driver.findElement(By.xpath("a[class = 'nav_a']"));
    
    btn.click();
    
   
	
	}

}
