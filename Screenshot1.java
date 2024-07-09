package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		captureScreenshot(driver, "loginPage");
		driver.findElement(By.name("login[username]")).sendKeys("test");
		driver.findElement(By.name("login[password]")).sendKeys("testpw");
		captureScreenshot(driver, "Details Entred");
		driver.close();
	}
public static void captureScreenshot(WebDriver driver, String tcname) {
	String path = "./Screenshot/"+ tcname +".png";
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(temp, new File(path));
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}


}
