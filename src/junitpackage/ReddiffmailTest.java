package junitpackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddiffmailTest {
	 WebDriver driver;

	    @Before
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://register.rediff.com/register/register.php");
	        driver.manage().window().maximize();
	    }
	    @Test
	    public void verifyTotalLinks() {
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Total number of links on the page: " + links.size());
	        
	        assertEquals("Expected 30 links but found a different number", 30, links.size());
	    }
	    @Test
	    public void verifyCreateAccountText() {
	        WebElement heading = driver.findElement(By.xpath("//b[contains(text(), 'Create a Rediffmail Account')]"));
	        assertTrue("The text 'Create a Rediffmail account' is not present", heading.isDisplayed());

	        System.out.println("'Create a Rediffmail account' text is present on the page.");
	    }
}

