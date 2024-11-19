package testngpkg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
   @BeforeTest
   public void setup()
   {
	   System.out.println("beforetest, browser open");
   }
   
   @BeforeMethod(alwaysRun=true)
	   public void mthd() {
	   
	    System.out.println("url loading");
   }
   @Test(priority=2,groups= {"Sanity","Sanity"})
   public void test1()
   {
	   System.out.println("test 1");
   }
   @Test(priority=4,invocationCount=3,groups= {"Regression"})
   public void test2()
   {
	   System.out.println("test 2");
   }
   @Test(priority=1,groups= {"Sanity"})
   public void test3()
   {
	  System.out.println("test 3") ;
   }
   @Test(priority=3,groups= {"Regression","Sanity"})
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
