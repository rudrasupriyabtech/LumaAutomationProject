package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//thread.sleep(4000);
		driver.findElement(By.name("login[username]")).sendKeys("Admin");
		driver.findElement(By.name("login[password]")).sendKeys("admin123");
		driver.findElement(By.xpath("/button[@type='submit']")).click();
		
		
		}
}
