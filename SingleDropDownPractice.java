package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
 WebDriver driver = new ChromeDriver();
		  
	driver.manage().window().maximize();
		  
	 driver.get("https://www.facebook.com/");
		  
WebElement btn = driver.findElement(By.xpath("//a[text() = 'Create New ACccount]"));
		  
		 btn.click();
		  
   Thread.sleep(5000);
	WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
	
	firstname.sendKeys("Deepika");
	
WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname'] "));
	
	lastname.sendKeys("Ramesh");
	
WebElement number  = driver.findElement(By.xpath("//input[@number = 'mobilenumber']"));
 
number.sendKeys("8524094869");

WebElement password  = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));

password.sendKeys("Deepika20@");

 WebElement day = driver.findElement(By.xpath("//select [@id = 'day']"));
   
   Select sc1 = new Select(day);
   
   sc1.selectByVisibleText("16");
   
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
		
		
		
	 }
	
		
		
		
		
		
		
	

		  
 
		

	}

