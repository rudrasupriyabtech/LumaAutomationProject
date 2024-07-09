package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scrolling by pixel
		
		js.executeScript("window,scrollTo(0,400)");
		
		//Scroll to the bottom of the page
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement target = driver.findElement(By.xpath("//a[@class='block-promo home-main']"));
		
		
	//Scroll to a specific element
		js.executeScript("arguments[0].scrollIntoview",target);
		
	}

}



