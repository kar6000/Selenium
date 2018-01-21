package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRC/Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");

		// Find total number of Radiobuttons
		List<WebElement> rb = driver.findElements(By.xpath("//input[@type ='radio']"));
		System.out.println("Total no of radio buttons are : " + rb.size());

		// Select the 2nd radio button(index 1)
		for (int i = 0; i < rb.size(); i++) {
			rb.get(1).click();// Index 1
		}
		driver.close();

	}

}
