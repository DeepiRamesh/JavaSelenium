//1.Handling multiple windows

package com.windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		 
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com");
	
		Thread.sleep(8000);
		}
		  

	}


