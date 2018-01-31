package computer.technology.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumRC\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// 1. Find total number of footer links in the google page
		WebElement footer = driver.findElement(By.xpath("//div[@id='footer']"));
		//int size = footer.findElements(By.tagName("a")).size();
		
		List<WebElement> footlinks = footer.findElements(By.tagName("a"));
		System.out.println("Total number of footer links in footer: "+footlinks.size());
		
		//2. print the text of the links			
			for(int i =0; i<footlinks.size(); i++) {
				System.out.println(footlinks.get(i).getText());				
				String footlinks_href = footlinks.get(i).getAttribute("href");
				//System.out.println(footlinks_href);
				footlinks.get(i).click();
				driver.navigate().back();
				Thread.sleep(5000);
				footlinks =driver.findElements(By.tagName("a"));// as DOM changes after navigating back and throws stale element exception
				
			}
			
		}
	}


