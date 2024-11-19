package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("file:///E:/Rugma/selenium%20notes/alert.html");
	}
	
	@Test
	public void alertmthd()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text="+text);
		a.accept();
	//	a.dismiss(); //to cancel alert
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("arya");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("j");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
	

}
