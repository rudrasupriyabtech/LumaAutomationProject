package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> company = driver.findElements(By.tagName("div"));
		

			
			for (WebElement abc : company) {
				
				
				System.out.println(abc.getText());
				System.out.println();
				
			}
		
		driver.close();
		
	}

}
