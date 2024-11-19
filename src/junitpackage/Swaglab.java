package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Swaglab {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
	}
    @Test
    public void swaglogin() throws Exception
    {
    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("problem_user");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
    	driver.findElement(By.xpath("//input[@name='login-button']")).click();
    	driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
    
    	driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[1]")).click();
    
    	driver.findElement(By.xpath("//button[@id='checkout']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aishu");
    	
    	
    	
    }

}
