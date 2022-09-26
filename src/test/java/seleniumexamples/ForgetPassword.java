package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ForgetPassword {
	
	public static void main(String[] args) {
		//Assertion softAssert=new SoftAssert;
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		String URL = driver.getCurrentUrl();
		SoftAssert soft = new SoftAssert();
		String actual="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        soft.assertEquals(actual,URL);
		
}
}
