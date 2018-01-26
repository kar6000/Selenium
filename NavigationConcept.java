package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRC/Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
