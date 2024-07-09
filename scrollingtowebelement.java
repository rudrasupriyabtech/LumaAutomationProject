package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingtowebelement {
	
	

	private static void scrollingtowebelement() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	WebElement target = driver.findElement(By.xpath("//span[@class='product-image-wrapper']"));
		Actions act = new Actions(driver);
		act.scrollToElement(target).perform();
		
	}

}
