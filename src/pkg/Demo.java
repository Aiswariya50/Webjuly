package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
//		chromedriver
//		edgedriver
//		firefoxdriver
		
		ChromeDriver driver=new ChromeDriver();   // to open chrome browser
		driver.get("http://www.google.com");
		
		String actualTitle=driver.getTitle();      //title is correct or not,STORE THE VALUE
		String expTitle="Google";
		
		if (actualTitle.equals(expTitle)) 
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
	
 