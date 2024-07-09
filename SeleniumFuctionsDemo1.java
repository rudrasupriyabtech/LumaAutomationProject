package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFuctionsDemo1 {
public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getPageSource());
	 System.out.println(driver.getTitle());
	 
	 driver.manage().window().maximize();
	 
	 driver.close();
	}

}
