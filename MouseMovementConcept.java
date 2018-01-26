package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRC/Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");

		// Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("FAQ"))).click();

	}

}