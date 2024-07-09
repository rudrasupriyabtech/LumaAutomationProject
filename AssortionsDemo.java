package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssortionsDemo {
	WebDriver driver;
	@BeforeMethod

	public void setup() {
		driver = new ChromeDriver();
		
	}
	@Test
	public void ValiadteTitle() {
		String expTitle ="Home Page";
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actTitle = driver.getTitle();	
		Assert.assertEquals(actTitle, expTitle);
	}
	

	@Test
	public void loadingLoginPage() {
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean flag = driver.findElement(By.xpath("//h1[@class='page-title']")).isDisplayed();
			Assert.assertTrue(flag);
	}
	 @AfterMethod
		
		public void closesetup() {
			driver.close();
		}
}
