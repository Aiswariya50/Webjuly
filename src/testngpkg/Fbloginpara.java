package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbloginpara {
	
	ChromeDriver driver;
	 @BeforeTest(alwaysRun=true)
	   public void setup()
	   {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
	   }
	 @Parameters({"username","password"})
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");//locate email field
    	driver.findElement(By.id("pass")).sendKeys("123r3ef");
    	driver.findElement(By.id("pass")).click();
	}

}
