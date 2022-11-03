package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Target_testNG {
	
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
		driver.get("https://target.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkCategoriesButton() {
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [contains (text(), \"Cat\")]")).click();
	}
	
	@Test
	public void checkDealsLink() {
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [contains (text(), \"Dea\")]")).click();
			
	}
	
	@Test
	public void checkWhatsNewLink() {
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [contains (text(), \"Wh\")]")).click();
			
	}
	

	@Test
	public void checkPickupAndDeliveryLink() {
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [contains (text(), \"Pick\")]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	
	

}
