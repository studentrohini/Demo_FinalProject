package TestNGDemo.TestNGDemo;
import org.testng.annotations.*;

public class AutoMobileClass {
	
	@Parameters({"AutoMobileName"})
	@Test
	public void testCase1(String name)
	{
		System.out.println(name);
	}

}
