package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeDepot_testNG {

	
	
	
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
		driver.get("https://homedepot.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkStoreFinderLink() {
		driver.get("https://homedepot.com");
		driver.findElement(By.xpath("//a[contains (text(), 'Store Finder')][1]")).click();
	}
	
	@Test
	public void checkTruckAndToolLink() {
		driver.get("https://homedepot.com");
		driver.findElement(By.xpath("//a[contains (text(), 'Truck & Tool Rental')][1]")).click();
			
	}
	
	@Test
	public void checkForTheProLink() {
		driver.get("https://homedepot.com");
		driver.findElement(By.xpath("//a[contains (text(), 'For the ')][1]")).click();
			
	}
	

	@Test
	public void checkGiftCardsLink() {
		driver.get("https://homedepot.com");
		driver.findElement(By.xpath("//a[contains (text(), 'Gift Cards')][1]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
