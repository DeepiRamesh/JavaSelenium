package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchPackage {

	public static void main(String[] args) {
	
  System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://www.samsung.com/in/");
  
  driver.manage().window().maximize();  
  

	}

}
