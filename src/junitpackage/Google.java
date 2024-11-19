package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {
	
ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
	}
	@Test
    public void Googlesearch()
    {
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("books", Keys.ENTER);
		
    }

}

