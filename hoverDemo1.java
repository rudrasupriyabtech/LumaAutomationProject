package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoverDemo1 {


	private static void hover() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/hero-hoodie.html");
		WebElement Herohoodie = driver.findElement(By.xpath("//body[@class=page-product-configurable catalog-product-view product-hero-hoodie page-layout-1column"));
		Actions act = new Actions(driver);
		act.moveToElement(Herohoodie).perform();
	
	}
	
	


}
