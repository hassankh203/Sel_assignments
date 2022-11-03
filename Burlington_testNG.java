package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Burlington_testNG {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void launchingBurlingtonHomePage() {
		driver.get("https://burlington.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkCreditCardButton() {
		driver.get("https://burlington.com");
		driver.findElement(By.xpath("//div[contains (text(), 'credit')]")).click();
	}
	
	@Test
	public void checkLoyaltyLink() {
		driver.get("https://burlington.com");
		driver.findElement(By.xpath("//div[contains (text(), 'loyal')]")).click();
			
	}
	
	@Test
	public void checkEmailSignupLink() {
		driver.get("https://burlington.com");
		driver.findElement(By.xpath("//div[contains (text(), 'sign u')]")).click();
			
	}
	

	@Test 
	public void checkBuyGiftCardsLink() {
		driver.get("https://burlington.com");
		driver.findElement(By.xpath("//div[contains (text(), 'buy')]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
