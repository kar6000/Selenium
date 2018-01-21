package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumRC\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		// Get Title
		String title = driver.getTitle();
		System.out.println("Title of this page is: " + title);

		// Title Validation
		if (title.equals("Facebook - Log In or Sign Up")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}

		// Get current URL
		String url = driver.getCurrentUrl();
		System.out.println("The url of this page is: " + url);

		// URL validation
		if (url.contains("facebook")) {
			System.out.println("The url is correct");

		} else {
			System.out.println("This is the wrong url");

			// Get page source

			// String pageSource =driver.getPageSource();
			// System.out.println("The page source: "+pageSource);

			// driver.close();
			driver.quit();
		}

	}

}
