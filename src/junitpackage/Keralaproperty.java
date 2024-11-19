package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://Keralaproperty.in/member/login");
		}
	    @Test
	    public void fblogin()
	    {
	    	driver.findElement(By.id("ulogin")).sendKeys("Aiswariya");//locate Username field
	    	driver.findElement(By.id("upass")).sendKeys("123@90");
	    	driver.findElement(By.name("sub_logbtn")).click();
	    }
	}


