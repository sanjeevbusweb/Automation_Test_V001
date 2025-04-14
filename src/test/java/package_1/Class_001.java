package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_001 {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:/Program IMP/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	void method1()

    {
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("James Bond");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9999999999");
		driver.findElement(By.id("textarea")).sendKeys("Mohali");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("sunday")).click();
		
		System.out.println("Success");
	}
}
