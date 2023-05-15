package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
	WebDriver driver = new ChromeDriver();
				  
	driver.manage().window().maximize();
				  
	driver.get("https://demoqa.com/alerts");

	WebElement btn1 = driver.findElement(By.xpath("button[@onclilck = 'alertButton()']"));	
	
		btn1.click();
	
	Alert a1 = driver.switchTo().alert();
	
	a1.accept();
	
	Thread.sleep(3000);
	
	WebElement btn2 = driver.findElement(By.xpath("button[@onclick ='timerAlertButton()']"));
	
	btn2.click();
	
	Thread.sleep(5000);

	WebElement btn3 = driver.findElement(By.xpath("button[@onclick ='confirmButton()']"));
	
	btn3.click();
	
	Alert a2 = driver.switchTo().alert();
	
	a2.dismiss();
	
	Thread.sleep(3000);
	
WebElement btn4 = driver.findElement(By.xpath("button[@onclick = 'promptButton()']"));
	
	btn4.click();
	
Alert a3 = driver.switchTo().alert();

	a3.dismiss();
	
	
	}

}
