package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
ChromeDriver driver;

      @BeforeTest
      public void setup()
      {
           driver=new ChromeDriver();
           driver.get("https://www.ebay.com/");
      }
      @Test
      public void test()
      {
    	 
    	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	  Actions act=new Actions(driver);
    	  WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
    	  act.moveToElement(electronics).perform();
    	  driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
    	 
      }


}
