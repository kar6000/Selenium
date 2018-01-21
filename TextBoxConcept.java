package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumRC\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		// Find total number of text fields in the page
		List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type ='text']"));
		System.out.println("total no of textbox are: " + textBoxes.size());

		// Enter text in the text box
		driver.findElement(By.id("email")).sendKeys("test1234");
		
		driver.close();

	}

}
