//11.Handling multiple browser

package com.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        
         driver.findElement(By.id("windowButton")).click();
         WebElement text = driver.findElement(By.id("sampleHeading"));
         
            
         System.out.println("Element found using text: " + text.getText());
         driver.quit();
    }
}
