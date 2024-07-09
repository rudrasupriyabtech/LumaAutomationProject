package Selenium;

public class NavigationDemo1 {
	package SeleniumBasics;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NavigationDemo {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(3000);
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.close();
			
		}
	}





}
