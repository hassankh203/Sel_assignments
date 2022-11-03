package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay_tesNG {
	public static WebDriver driver;
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void launchingEbayHomePage() {
		driver.get("https://ebay.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkSearchButton() {
		driver.get("https://ebay.com");
		driver.findElement(By.name("_nkw")).sendKeys("tv");
		driver.findElement(By.id("gh-btn")).click();
	}
	
	@Test
	public void checkMotorsLink() {
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//li  [@class = 'hl-cat-nav__js-tab'][1]")).click();
			
	}
	
	@Test
	public void checkElectronicsLink() {
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//li  [@class = 'hl-cat-nav__js-tab'][1]/following-sibling :: li/child :: a[contains (text(), 'E')]")).click();
			
	}
	

	@Test
	public void checkCollectibleAndArtsLink() {
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//li  [@class = 'hl-cat-nav__js-tab'][1]/following-sibling :: li/following-sibling :: li/child :: a[contains (text(), 'Co')]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
