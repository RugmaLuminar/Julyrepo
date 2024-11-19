package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");

	}
	
	@Test
	public void main() throws IOException, Exception
	{  
		
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("rugma@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("123456");
	 driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
	 Thread.sleep(3000);
	 String expurl="https://keralaproperty.in/member/myhome/";
	 String actualurl=driver.getCurrentUrl();
	 System.out.println(actualurl);
	 if(expurl.equals(actualurl))
	 {
		 System.out.println("login successfull");
		 Reporter.log("login succesfull");
	 }
	 else
	 {
		 System.out.println("login failed");
		 Reporter.log("login failed");
	 }
	}
	

}
