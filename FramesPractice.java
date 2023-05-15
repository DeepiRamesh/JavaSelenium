//4.Handling frames

package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
	
	String url = "https://demo.automationtesting.in/Frames.html";

	System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
	WebDriver driver = new ChromeDriver();
		  
    driver.manage().window().maximize();
    
    driver.get(url);
    
    List<WebElement> count = driver.findElements(By.tagName("iframe"));
    
    int size = count.size();
 
    System.out.println(size);
    
    System.out.println("--------------------------------------");
    
    WebElement outerframe1 = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
    
    driver.switchTo().frame(outerframe1);
    
    WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
    
    textbox.sendKeys("Deepika");
    
    driver.switchTo().defaultContent();
    
    WebElement btn = driver.findElement(By.xpath("//a[text() ='Iframe with an Iframe"));
    
    btn.click();
    
    WebElement outerframe2 = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
    
    driver.switchTo().frame(outerframe2);
    
    WebElement innerframe = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
    
    driver.switchTo().frame(innerframe);
    
    WebElement textbox2 = driver.findElement(By.xpath("//input[@type = 'text']"));
    
    textbox2.sendKeys("Ramesh");
    
    driver.switchTo().defaultContent();
    
    WebElement btn2 = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle']"));
    
    btn2.click();
    
    
    
    
   }

}
