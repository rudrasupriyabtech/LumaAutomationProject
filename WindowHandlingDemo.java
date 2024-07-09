package Selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandlingDemo {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		
		//at this point there is only one window
		System.out.println(driver.getTitle());
		String pwid =  driver.getWindowHandle();
		System.out.println("Parent Window ID ==>>" + pwid);
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		//at this point there are two window
		Set<String> ids = driver.getWindowHandles();
		
		
		Iterator<String> it = ids.iterator();
		it.next();
		String cwid = it.next();
		System.out.println("Child Window ID ==>>  " + cwid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
		
		
		driver.quit();//will close all the window
		
		
	}

}