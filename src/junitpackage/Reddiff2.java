package junitpackage;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff2 {
	WebDriver driver;
	 @Before
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://register.rediff.com/register/register.php");
	        driver.manage().window().maximize();
	 }
	        @Test
	        	public void verifyhomereddiff()
	        {
	    	        WebElement rediflogo = driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/img"));
	    	        boolean l=rediflogo.isDisplayed();
	    	        if(l)
	    	        {
	    	        	System.out.println("logo is present");
	    	        }
	    	        else
	    	        {
	    	        	System.out.println("logo is not present");
	    	        }
	        	}
	        }
	    	        
	    	        
	  