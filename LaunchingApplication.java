package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingApplication {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// recommended
		
	
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
	 WebElement email = driver.findElement(By.name("login[username]"));
	
	email.sendKeys("TestEmail"); 
	
	driver.findElement(By.name("login[password]")).sendKeys("TestPassword");
	 
	driver.findElement(By.name("send")).click();
	
	driver.close();
	}
	
}


