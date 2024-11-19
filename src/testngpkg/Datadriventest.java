package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream ob=new FileInputStram("path of your excel");
		XSSFWorkbook ob
	}

}
