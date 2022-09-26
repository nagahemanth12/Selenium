package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		  driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.switchTo().alert().accept();
		  
		  
		  

	}

}
