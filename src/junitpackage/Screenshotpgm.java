package junitpackage;

import java.io.File;
import java.util.logging.FileHandler;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotpgm {

	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
    @Test
    public void fblogin()
    {
    	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileHandler
    }
}
