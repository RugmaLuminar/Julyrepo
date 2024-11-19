package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Santamonica {
	
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	  driver.get("https://santamonicaedu.in/");
	}
	
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String exp="Santamonica Study Abroad Pvt. Ltd. | Education Consultants";
		Assert.assertEquals(actualtitle,exp);
	}

}
