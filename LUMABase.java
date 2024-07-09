package Com.luma.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LUMABase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void initialization() {
		loadPropertyFile();
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}else if (browser.equalsIgnoreCase("ie")) {
		driver = new InternetExplorerDriver();
}else if (browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
}else if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
}else {
	
	System.out.println("Please specify correct browser name");
}
		
		driver.get(prop.getProperty("url"));
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	public void tearDown() {
		driver.quit();
		
	}
	
	public void loadPropertyFile() {
	  prop = new Properties();
	String configFilePath = "./src/main/java/Com/ohrm/config/config.properties";
    try {
		FileInputStream fis = new FileInputStream(configFilePath);
		prop.load(fis);
	} catch (FileNotFoundException e) {
		System.out.println("Configuration File Not Found !!!");
	}catch (Exception e) {
		System.out.println("Unable to read the configuration File  !!!");
	}
    
  
  
  }
}
