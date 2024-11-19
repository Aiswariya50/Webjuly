package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	WebDriver driver;
	
	By fbemail=By.id("email");           //object repository
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbloginpage(WebDriver driver) {     //constructor call, constructor is invoked when object create
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)    //method
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}
