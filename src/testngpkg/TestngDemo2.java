package testngpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo2 {
	WebDriver driver;
	
	
	
	 @BeforeTest
	   public void setup()
	   {
		   System.out.println("https://www.Reddiff.com/");
	   }
	 @BeforeMethod
	   public void mthd() {
	   
	    System.out.println("url loading");
	 }
	 @Test
	 public void verifyhomepagetitle()
	 {
		 System.out.println("Books");
	 }
	 @Test
	 public void verifyloginlink()
	 
	 
	 
	 
