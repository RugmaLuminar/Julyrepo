package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	
//		chromedriver
//		edgedriver
//		firefoxdriver
		
		
		ChromeDriver  driver=new ChromeDriver(); //to open chrome browser
		driver.get("https://www.google.com"); //to launch webapplication
		
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
		
		
	}

}
