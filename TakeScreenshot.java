//8.Write code for taking Screenshot

package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
    
	System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
	WebDriver driver = new ChromeDriver();
		  
	driver.manage().window().maximize();
		  
	 driver.get("https://www.facebook.com/");
	 
	 WebElement btn1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	 
   	btn1.click();
   	
   	Thread.sleep(3000);
   	
   	WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
	
	firstname.sendKeys("Deepika");
	
WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname'] "));
	
	lastname.sendKeys("Ramesh");
	
WebElement  id  = driver.findElement(By.xpath("//input[@id = 'u_5_g_h1']"));
  
 id.sendKeys("deepikramesh21@gmail.com");
 
 WebElement password  = driver.findElement(By.xpath("//input[@type = 'password']"));

 password.sendKeys("Deepika20@");
 
 
 WebElement day = driver.findElement(By.xpath("//select [@id = 'day']"));
 
 Select sc1 = new Select(day);
 
 sc1.selectByVisibleText("14");
 
 System.out.println("---------------------------");
 
 List<WebElement> list1 = sc1.getOptions();
 
 for (WebElement it1:list1) { //1 2 3.......31
	 
	 System.out.println(it1.getText());
	 
 }
 
 System.out.println("----------------------------");
	
	WebElement month = driver.findElement(By.xpath("//select [@title = 'Month']"));
	
	Select sc2 = new Select(month);
	
	sc2.selectByValue("6");
	
	List<WebElement> list2 = sc2.getOptions();
	
	for (WebElement it2:list2) {
		
		System.out.println(it2.getText());
	}
	System.out.println("----------------------");
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select sc3 = new Select(year);
	
	sc3.selectByIndex(10);
	
	List<WebElement> list3 = sc3.getOptions();
	
	for (WebElement it3:list3) {
		
		System.out.println(it3.getText());
	
	}
	
	WebElement btn2 = driver.findElement(By.xpath("//label[text()='female']"));
	
	btn2.click();
	
	WebElement btn3 = driver.findElement(By.xpath("//button[@name ='websubmit']"));
	
	btn3.click();
	
	Thread.sleep(10000);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File des = new File("C:\\Users\\deepi\\seleniumcourse\\Selenium\\Screenshots\\pic1.png");
	
	FileHandler.copy(source, des);	
		
		
		
		}

}
