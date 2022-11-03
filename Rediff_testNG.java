package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_testNG {
	public static WebDriver driver;
	
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void launchingRediffHomePage () {
		driver.get("https://rediff.com");
		System.out.println("this is the title :  " + driver.getTitle());
	}
	
	@Test
	public void checkRediffMailLink() {
		driver.get("https://rediff.com");
		driver.findElement(By.className("mailicon")).click();
	}
	
	@Test
	public void checkMoneyLink() {
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//div [@class = 'cell topicons']/child :: a[2]")).click();
			
	}
	
	@Test
	public void checkBusinessEmailLink() {
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//div [@class = 'cell topicons']/child :: a[2]/following-sibling :: a[1]")).click();
			
	}
	

	@Test
	public void checkVideosLink() {
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//div [@class = 'cell topicons']/child :: a[2]/following-sibling :: a[1]/following-sibling :: a[1]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
