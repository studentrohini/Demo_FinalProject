package TestNGDemo.TestNGDemo;
import org.testng.annotations.*;

public class TestNGParameterDemo {
	
	@Test
	@Parameters({"i" , "j"})
	public void add(int a, int b)
	{
		System.out.println("Addition:" + (a+b));
	}
	
	@Test
	@Parameters({"i" , "j"})
	public void sub(int a, int b)
	{
		System.out.println("Subtraction:" + (a-b));
	}
	
	@Test
	@Parameters({"i" , "j"})
	public void multi(int a, int b)
	{
		System.out.println("multiplication:" + (a*b));
	}



}
