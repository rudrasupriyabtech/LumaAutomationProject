package Com.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ohrm.base.LUMABase;

public class LoginPage extends Com.luma.base.LUMABase {
	By un = By.name("login[username]");
	By pwd = By.name("login[password]");
	By loginBtn = By.xpath("//button[@type='submit']");
	
	@FindBy(name = "login[username]")
	WebElement username;
	
	@FindBy(name = "login[password]")
	WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement loginButton;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	 public String getPageTitle() {
		return driver.getTitle();
	}
	 
	public String login() {
		driver.findElement(un).sendKeys(prop.getProperty("login[username]"));
		driver.findElement(pwd).sendKeys(prop.getProperty("login[password]"));
		driver.findElement(loginBtn).click();
		return driver.getCurrentUrl();

}
}