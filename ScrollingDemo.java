package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingDemo {
	public static void main(String [] args ) {
		
			
		 scrolling();
			
			
			
		}

		
		private static void scrolling() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://magento.softwaretestingboard.com/");
			Actions act = new Actions(driver);
			act.scrollByAmount(0, 400).perform();
			
		}
}