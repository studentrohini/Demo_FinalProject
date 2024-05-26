package TestNGDemo.TestNGDemo;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNgParameterGoogleSearch {
	
	@Parameters({"Keywords"})
	@Test
	public void googlesearch(String searchdata)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.google.com");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(searchdata);
		
		Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
		
		driver.quit();
	}

}
