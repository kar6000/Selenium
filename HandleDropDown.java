package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumRC\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		// select.selectByVisibleText("May");
		// select.selectByIndex(6);

		// Print all values of Month Dropbox
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println("Total number of months are: " + monthList.size());

		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
		}

		// Print all values of Day Dropbox
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']//option"));
		System.out.println("Total nu mber of months are: " + dayList.size());

		for (int i = 0; i < dayList.size(); i++) {
			System.out.println(dayList.get(i).getText());

			if (dayList.get(i).getText().equals("5")) {
				dayList.get(i).click();
				break;
			}
		}

		driver.close();
	}

}
