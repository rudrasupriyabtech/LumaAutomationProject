package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.findElement(By.name("login[username]")).sendKeys("userId");
		driver.findElement(By.name("login[password]")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String filepath = ".\\src/main/java/Selenium/readingExcel.xlsx";
		FileInputStream inputStream = new FileInputStream(filepath);
		
		XSSFWorkbook workbook= new XSSFWorkbook(inputStream);
		XSSFSheet sheet =workbook.getSheet("sheet1");
		
		int rowcount= sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount][colcount];
		for (int row=0;row<rowcount; row++) {
			for (int col=0;col<colcount;col++) {
			data [row][col]=sheet.getRow(row).getCell(col).getStringCellValue();	
			}
		}
		
	}


}
