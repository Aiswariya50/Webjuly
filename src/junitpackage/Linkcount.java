package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
   @Test
   public void countLinks() 
   {
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   System.out.println("Total number of links: " + links.size());
	   
	   for (WebElement link : links)
	   {
           String linkText = link.getText();   // Get the visible text of the link
           String linkHref = link.getAttribute("href");  // Get the href attribute (URL
           
        // Print the link's text and href (URL)
           System.out.println("Link Text: " + (linkText.isEmpty() ? "[No Text]" : linkText) 
                   + " - URL: " + linkHref);
}
}
}
       
  