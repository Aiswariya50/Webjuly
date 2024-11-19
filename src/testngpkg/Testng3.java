package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng3 {
	 @BeforeTest
	   public void setup()
	   {
		   System.out.println("beforetest, browser open");
	   }
	   
	   @BeforeMethod
		   public void mthd() {
		   
		    System.out.println("url loading");
	   }
	   @Test(priority=2,invocationCount=3,groups="sanity")
	   public void test1()
	   {
		   System.out.println("test 1");
	   }
	   @Test(priority=4)
	   public void test2()
	   {
		   System.out.println("test 2");
	   }
	   @Test(priority=1,enabled=false)
	   public void test3()
	   {
		  System.out.println("test 3") ;
	   }
	   @Test(priority=3,groups= {"smoke","sanity"})
	   public void test4()
	   {
		   System.out.println("test 4") ;
	   }
	   @AfterMethod
	   public void aftermthd()
	   {
		   System.out.println("Aftermthd");
	   }
	   @AfterTest
	   public void Teardown()
	   {
		   System.out.println("AfterTest");
	   }
	}


