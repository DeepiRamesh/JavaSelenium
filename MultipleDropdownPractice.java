package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//6.Multiple dropdown

public class MultipleDropdownPractice {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:/Users/deepi/seleniumcourse/Selenium/Drivers/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://output.jsbin.com/osebed/2/");

WebElement fruits = driver.findElement(By.id("fruits"));

Select sc1 = new Select(fruits);

boolean check = sc1.isMultiple();

System.out.println(check);

System.out.println("--------------------------------------");

List<WebElement> list1 = sc1.getOptions();

for (WebElement it1 : list1) {
	
	String text = it1.getText();
	
	System.out.println(text);
}
System.out.println("-------------------------------------");

sc1.selectByVisibleText("Grape");

sc1.selectByValue("Banana");

System.out.println("-------------------------------------");

List<WebElement> list2 = sc1.getOptions();

for (WebElement it2 : list2) {
	
	String text = it2.getText();
	
	System.out.println(text);

}
System.out.println("-------------------------------------");

WebElement fo = sc1.getFirstSelectedOption();

System.out.println(fo.getText());

	}
	
}
