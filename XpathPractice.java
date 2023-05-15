package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {


	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  driver.manage().window().maximize();
		  

WebElement email = driver.findElement(By.xpath("//input [@name='email']"));
		  
		  email.sendKeys("mnop@gmail.com");
		  
     WebElement pass = driver.findElement(By.xpath("//input [@name='pass']"));
     
     pass.sendKeys("mnop1234");
     
     WebElement btn = driver.findElement(By.xpath("//button [@name='login']"));
     
     btn.click();
     
     Thread.sleep(5000);
     
         
    
     
     
     
    
     
     
     
     
     
		  
	
		  
		  

	}

}
