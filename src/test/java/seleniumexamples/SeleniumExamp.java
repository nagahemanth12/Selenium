package seleniumexamples;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class SeleniumExamp 
	{

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nagahemanth");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("nagahemanth257@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nagahemanth257@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Hemanth@887");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByIndex(2);
		select.selectByVisibleText("7");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	}


