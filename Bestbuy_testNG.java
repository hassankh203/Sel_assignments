package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bestbuy_testNG {

	public static WebDriver driver;
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void launchingBestBuyHomePage() {
		driver.get("https://bestbuy.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkTopDealsLink() {
		driver.get("https://bestbuy.com");
		driver.findElement(By.xpath("//a [contains(text(), 'Top D')]")).click();
		
	}
	
	@Test
	public void checkDealOfTheDayLink() {
		driver.get("https://bestbuy.com");
		driver.findElement(By.xpath("//a [contains(text(), 'Deal of')]")).click();
			
	}
	
	@Test
	public void checkTotaltechMembershipLink() {
		driver.get("https://bestbuy.com");
		driver.findElement(By.xpath("//a [contains(text(), 'Totaltech M')]")).click();
			
	}
	

	@Test
	public void checkCreditCardsLink() {
		driver.get("https://bestbuy.com");
		driver.findElement(By.xpath("//a [contains(text(), 'Credit Cards')]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
