package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\new files//WebTable.html");
	driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input[@name=\"select1\"]")).click();
}
}