package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Admin{
	WebDriver driver = new ChromeDriver();
	void login1()
	{
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();

}
	void search(String userName)
	{
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a/span")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	void search(String userrole, String empName)
	{
		driver.findElement(By.xpath("//a/span")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(userrole);
		//WebElement s=driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]"));
		//Select select=new Select(s);
		//select.selectByVisibleText("1");
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
	
		Admin obj2=new Admin();
		obj2.login1();
		//obj2.search("Admin");
		obj2.search("Admin","Kiran");
	}
}

	
	

