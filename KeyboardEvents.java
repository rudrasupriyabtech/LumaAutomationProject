package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
	private static void keyboardEvents() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		WebElement email = driver.findElement(By.name("login[username]"));
		WebElement pass = driver.findElement(By.name("login[password]"));
		
		Actions act = new Actions(driver);
		act.click(email).keyDown(Keys.SHIFT).sendKeys("testsupriya")
		.keyUp(Keys.SHIFT).
		doubleClick()
		.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		act.moveToElement(pass).
		click(pass).keyDown(Keys.CONTROL).sendKeys("V").perform();
		
		act.sendKeys(email,"testsupriya").doubleClick().perform();

		
		}

}
