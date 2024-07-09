package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClicksDemo1 {
	public static void main(String [] args ) {
		
		clicks();
		
	}

	
	private static void clicks() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		Actions act = new Actions(driver);
		WebElement login =  driver.findElement(By.name("login[username]"));
		act.sendKeys(login,"testmail").doubleClick().perform();
	}


	

}
