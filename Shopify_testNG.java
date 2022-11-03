package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shopify_testNG {
public static WebDriver driver;
	
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void launchingShopifyHomePage () {
		driver.get("https://shopify.com");
		System.out.println("this is the title :  " + driver.getTitle());
	}
	
	@Test
	public void checkPricingLink() {
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//a [ @class = 'marketing-nav__item marketing-nav__item--user'][1]")).click();
	}
	
	@Test
	public void checkLearnLink() {
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//div [ @class = 'popover-wrapper js-popover-dropdown popover-wrapper--dropdown']/child :: button[contains (text(), 'Learn')]")).click();
			
	}
	
	@Test
	public void checkSellLink() {
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//a [ @class = 'marketing-nav__item marketing-nav__item--user'][contains (text(), 'Log')]")).click();
			
	}
	

	@Test
	public void checkStartFreeTrialButton() {
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//a [ @class = 'marketing-nav__item marketing-nav__item--user'][contains (text(), 'Log')]/parent :: li/following-sibling :: li/child :: form/child :: button")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	

}
