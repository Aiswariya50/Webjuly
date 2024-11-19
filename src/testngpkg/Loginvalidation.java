package testngpkg;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	
	WebDriver Driver;
	
	@BeforeTest()
	public void beforeTest() {
		Driver=new ChromeDriver();
	}
	
	@Test
	public void main() throws IOException,Exception
	{
		Driver.get("https://keralaproperty.in/member/login/");
		Driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("aiswariyaprasheel5@gmail.com");
		Driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("Aiswariya@123");
		Driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		String expurl="https://keralaproperty.in/member/myhome/";
		String actualurl=Driver.getCurrentUrl();
		if(expurl.equals(actualurl))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("login failed");
		}
	}

}
