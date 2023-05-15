package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) throws InterruptedException {
	
	String url = "https://globalsqa.com/demo-site/draganddrop/";

	System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
			  
	WebDriver driver = new ChromeDriver();
			  
	driver.manage().window().maximize();
	    
    driver.get(url);	
    
    Thread.sleep(3000);
    
   WebElement outerframe = driver.findElement(By.xpath("//iframe [@class = 'demo-frame lazyloaded']"));

   driver.switchTo().frame(outerframe);
    
   Thread.sleep(3000);
   
WebElement from1 = driver.findElement(By.xpath("//li [@class = 'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));

WebElement to1 = driver.findElement(By.xpath("//div [@id = 'trash']"));

	Actions act1 = new Actions(driver);
	
	act1.dragAndDrop(from1, to1).build().perform();
	
	Thread.sleep(3000);
	
	WebElement from2 = driver.findElement(By.xpath("//li [@class = 'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	
	WebElement to2 = driver.findElement(By.xpath("//div [@class = 'ui-widget-content ui-state-default ui-droppable']"));
	
Actions act2 = new Actions(driver);
	
	act2.dragAndDrop(from2, to2).build().perform();
	
	Thread.sleep(3000);
	
	
	}


}
