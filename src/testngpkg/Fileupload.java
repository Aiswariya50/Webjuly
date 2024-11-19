package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
ChromeDriver driver;

       @BeforeTest
       public void setup()
       {
    	   driver=new ChromeDriver();
    	   driver.get("https://demo.guru99.com/test/upload/");
       }
       @Test
       public void test()
       {
    	   driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendkeys("E://Book1.xls");
    	   driver.findElement(By.xpath(" //*[@id=\"terms\"]")).click();
    	   driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
    	   String text=driver.findElement(By.xpath("//*[@id=\\\"submitbutton\\")).getText();
    	   if(text.equalsIgnoreCase("submit"))
    	   {
    		   System.out.println("passed");
    	   }
    	   else
    	   {
    		   System.out.println("Failed");
    	   }
       }

}
