package testngpkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	 @Test
	    public void test() {
	        String parentWindow = driver.getWindowHandle();
	        System.out.println("Title of google: " + driver.getTitle());
	        
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("http://www.facebook.com");
	        
	        driver.switchTo().window(parentWindow);
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("http://www.ebay.com");
	        System.out.println(driver.getTitle());
	        
	        ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
	        
	        driver.switchTo().window(windowdetails.get(1));
	        System.out.println(driver.getTitle());
	    }
	}