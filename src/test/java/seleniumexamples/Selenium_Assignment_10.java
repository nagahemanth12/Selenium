package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Assignment_10 {

	public static void main(String[] args)  throws IOException {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://facebook.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
		String filePath = "//C://hemanth";
		String fileName = "FacebookDetails.xlsx";
		String sheetName ="Sheet1"; 
	    File file = new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    @SuppressWarnings("resource")
		Workbook workBook = new XSSFWorkbook(inputStream);

	    Sheet sheet = workBook.getSheet(sheetName);

	        Row row = sheet.getRow(1);
	        String abc= row.getCell(0).getStringCellValue();
	        String def= row.getCell(1).getStringCellValue();
	        
	        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(abc);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(def);
			driver.findElement(By.xpath("//div/button[@name='login']")).click();
	    }
	}