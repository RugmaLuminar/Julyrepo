package testngpkg;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titleverification {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String act=driver.getTitle();
		String exp="google";
		
		Assert.assertEquals(act, exp,"title verification failed");
		
		System.out.println("hii");
		
		
//		if(act.equals(exp))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		
	}

}
