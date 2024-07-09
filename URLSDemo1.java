package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLSDemo1 {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		WebElement a = driver.findElement(By.linkText("Forgot Your Password?"));
		System.out.println(urls.size());
		
		for (WebElement abc : urls) {
			System.out.println(abc.getText());
			System.out.println(abc.getAttribute("tittle"));
			System.out.println(abc.getAttribute("href"));
			System.out.println();
		}
		
		driver.close();
	
	}
	
}
