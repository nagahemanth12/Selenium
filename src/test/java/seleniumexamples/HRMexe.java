package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMexe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
