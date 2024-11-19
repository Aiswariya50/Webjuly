package Practisejunit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc2 {

	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		
		String actualTitle=driver.getTitle();
		String expTitle="YouTube";
		
		if(actualTitle.equals(expTitle));
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

        driver.quit();   // close the browser
    }
}
