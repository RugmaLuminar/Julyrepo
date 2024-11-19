package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void googlesearch()
	{
		WebElement day= driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select ob=new Select(day);
		ob.selectByValue("02");
		
	}
	@Test
	public void buttontext()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		System.out.println(buttontext);
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
