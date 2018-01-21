package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumRC\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// 1. Find total number of links in the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " + links.size());

		// 2. Display all the links
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			String linkText = links.get(i).getText();

			// 3. Click on Gmail link
			if (linkText.equals("Gmail")) {
				links.get(i).click();
				break;
			}

		}
		driver.close();

	}

}
