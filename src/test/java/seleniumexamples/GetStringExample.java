package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetStringExample {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String m=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
		System.out.println("Company is : " + m);
	}

}
