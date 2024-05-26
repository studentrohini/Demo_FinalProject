package TestNGDemo.TestNGDemo;
import org.testng.annotations.*;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite..");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite..");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test..");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test..");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class..");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class..");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method..");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method..\n");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("This is test1...");
	}

	@Test
	public void test2()
	{
		System.out.println("This is test2...");
	}

}
