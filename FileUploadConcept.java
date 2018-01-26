package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRC/Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");

		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys(" ");

	}

}
