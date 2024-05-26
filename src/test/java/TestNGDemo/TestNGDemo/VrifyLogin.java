package TestNGDemo.TestNGDemo;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.BaseClass;

public class VrifyLogin extends BaseClass {
	
	@Test
	public void verifyloginbutton() throws InterruptedException, IOException
	{
		driverInitialize();
		
		Thread.sleep(2000);
	}

}
