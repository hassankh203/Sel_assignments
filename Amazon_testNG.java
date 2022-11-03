package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_testNG {
	
	public static WebDriver driver;
	 
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void checkAmazonHomePage() {
		driver.get("https://amazon.com");
		System.out.println("this is the url title : " + driver.getTitle());
		
	}
	@Test
	public void CheckSignUpButton() {
		driver.get("https://amazon.com");
		driver.findElement(By.xpath("//div [@class = 'nav-line-1-container']/child :: span")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.name("customerName")).sendKeys("samir sami");
		driver.findElement(By.name("email")).sendKeys("samir123@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Myaccount123");
		driver.findElement(By.id("ap_password_check")).sendKeys("Myaccount123");
		driver.findElement(By.id("continue")).click();
		
	}
	@Test
	public void CheckbestSellersButton() {
		driver.get("https://amazon.com");
		driver.findElement(By.xpath("//a [@class = 'nav-a  '][1]")).click();
	}
	@Test
	public void CheckamazonBasicsButton() {
		driver.get("https://amazon.com");
		driver.findElement(By.xpath("//a [@class = 'nav-a  '][1]/following-sibling :: a[1]")).click();
	}
	@Test
	public void CheckcustomerService() {
		driver.get("https://amazon.com");
		driver.findElement(By.xpath("//a [@class = 'nav-a  '][1]/following-sibling :: a[2]")).click();
		
			
		}
		@AfterTest
		public void quitBrowser() {
			driver.quit();
		}
		
		
	
	
	

}
