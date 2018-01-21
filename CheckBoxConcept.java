package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRC/Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");

		// Find total number of Checkbox
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type ='checkbox']"));
		System.out.println("Total no of checkboxes : " + checkboxes.size());

		// Select the 1st and 3rd Checkbox
		// checkboxes.get(1).click();
		// checkboxes.get(3).click();

		// Select all checkboxes
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
			checkboxes.get(i).clear();

		}

		// Check if the 1st checkbox is selected
		boolean b = checkboxes.get(2).isSelected();
		System.out.println(b);
		
		driver.close();

	}

}
