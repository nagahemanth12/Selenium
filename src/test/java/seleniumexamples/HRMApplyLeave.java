package seleniumexamples;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMApplyLeave {
	WebDriver driver = new ChromeDriver();
	void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	void leave()
	{
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("2022-09-23");
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("textarea")).sendKeys("Feelingsick");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		HRMApplyLeave obj=new HRMApplyLeave();
		obj.login();
		obj.leave();
	}

}
