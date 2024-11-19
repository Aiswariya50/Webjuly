package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkavailability {

	
ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("");
		
	}
	@Test
	public void checkavail()
	{
		String buttontext=driver.findElement(By.xpath("//*id='tblcrtac']/tbody/tr[7]td[3]/input[2]")).getAttribute("value");
		if(buttontext.equals("Check availbality"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
