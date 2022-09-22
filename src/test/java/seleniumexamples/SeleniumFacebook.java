package seleniumexamples;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class SeleniumFacebook {
			public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/reg/");
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nagahemanth");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("k");
			driver.findElement(By.name("reg_email__")).sendKeys("nagahemanth257@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nagahemanth257@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Hemanth@887");
			driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("27");
			driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Nov");
			driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2000");
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			}
	}


