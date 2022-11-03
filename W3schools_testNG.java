package Assignment_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3schools_testNG {
	
	public static WebDriver driver;
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	@Test
	public void launchingHomePage() {
		driver.get("https://w3schools.com");
		System.out.println("the title for this url is :  " + driver.getTitle());
	}
	@Test
	public void checkTutorialsButton() {
		driver.get("https://w3schools.com");
		driver.findElement(By.id("navbtn_tutorials")).click();
	}
	
	@Test
	public void checkReferencesLink() {
		driver.get("https://w3schools.com");
		driver.findElement(By.id("navbtn_references")).click();
			
	}
	
	@Test
	public void checkExercisesLink() {
		driver.get("https://w3schools.com");
		driver.findElement(By.id("navbtn_exercises")).click();
			
	}
	
	@Test
	public void checkVideosLink() {
		driver.get("https://w3schools.com");
		driver.findElement(By.xpath("//a[contains (text(),  'Videos')][1]")).click();
			
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
