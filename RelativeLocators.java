package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		
	WebElement email = driver.findElement(By.name("login[username]"));
	WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
	WebElement signin = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));
	password.sendKeys("TestPassword");

}

}
