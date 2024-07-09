package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo1 {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		Set<Cookie> data = driver.manage().getCookies();
		for (Cookie abc : data) {
		System.out.println(abc);
		System.out.println(abc.getExpiry());
		System.out.println();
		
		}
		
	}

}
