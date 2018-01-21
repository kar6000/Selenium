package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumRC\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		/*//1.id
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("admin123");
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("admin123");
				
		//2. name
		driver.findElement(By.name("email")).sendKeys("admin123");
		driver.findElement(By.name("pass")).sendKeys("admin");
		
		//3.xpath
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		
		//4.CSS Selector
		
		
		//5.linkText
		driver.findElement(By.linkText("Create a Page")).click();*/
		
		//6. Partial LinkTest		
		driver.findElement(By.partialLinkText("Create a"));
		
		//7. className
		
		
		//8. Tag name
		
		
		
		
		//driver.close();
		
		

	}

}
