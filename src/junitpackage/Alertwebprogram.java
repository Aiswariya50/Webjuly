package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwebprogram {
ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("C:/Users/chait/OneDrive/Desktop/alert1.html");
		
	}
	@Test
	public void alert()
	{
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text="+text);
		a.accept();
		
		//a.dissmiss()
		driver.findElement(By.xpath("//input[@type='firstname']")).sendKeys("Aiswariya");
		driver.findElement(By.xpath("/input[@type='lastname]")).sendKeys("PV");
		driver.findElement(By.xpath("/input[@type='submit']")).click();
			
				
	}

}
