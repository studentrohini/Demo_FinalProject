package TestNGDemo.TestNGDemo;
import org.testng.annotations.*;

public class Annotationattributes {
	
	//@Test(description="This is testcase1.")
	@Test(priority=1)
	public void testCase1()
	{
		System.out.println("Mobile login TestCase..");
	}
	
	
	
	//@Test(description="This is testcase2.")
	@Test(priority=2)
	public void testCase2()
	{
		System.out.println("Web login TestCase..");
	}
	
	//@Test(timeOut=200)
	@Test(priority=3)
	public void testCase3()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("API login TestCase..");
	}



}
