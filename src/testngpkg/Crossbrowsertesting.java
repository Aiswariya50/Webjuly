package testngpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowsertesting {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
	}
		@Test
		public void test()
		{
		driver.get("https://www.google.com/");
		
	}
	
}

