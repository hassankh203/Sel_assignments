package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apple_testNG {

	public static WebDriver driver;
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void launchingAppleHomePage() {
		driver.get("https://apple.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkStoreButton() {
		driver.get("https://apple.com");
		driver.findElement(By.xpath("//a [@class = 'ac-gn-link ac-gn-link-store']")).click();
	}
	
	@Test
	public void checkMacLink() {
		driver.get("https://apple.com");
		driver.findElement(By.xpath("//a [@class = 'ac-gn-link ac-gn-link-mac']")).click();
			
	}
	
	@Test
	public void checIpadLink() {
		driver.get("https://apple.com");
		driver.findElement(By.xpath("//a [@class = 'ac-gn-link ac-gn-link-ipad']")).click();
			
	}
	

	@Test
	public void checkIphoneLink() {
		driver.get("https://apple.com");
		driver.findElement(By.xpath("//a [@class = 'ac-gn-link ac-gn-link-iphone']")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}	
	
}
