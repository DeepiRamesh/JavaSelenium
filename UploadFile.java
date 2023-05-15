//7.Upload file

package com.file;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		   
		 
		   WebDriver d = new FirefoxDriver();
		   d.manage().window().maximize();
		   d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
		   d.get("https://www.monsterindia.com/seeker/registration"); 
		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		   JavascriptExecutor js = (JavascriptExecutor)d;
		   js.executeScript("window.scrollBy(0,380)");
		   Thread.sleep(3000);
		 
		   
		 
		   By by;
		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		   
		   browse.sendKeys("C:\\Users\\deepi\\Pictures\\WhatsApp Images"); 
		   System.out.println("File is Uploaded Successfully");
		 
		   }
		 

}
