package TestCase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium4_Window_Handling 
{
	@Test
	public void WHandling()
	{
		//Selenium 4
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		String omayoID = driver.getWindowHandle();  //Id of window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/login/");
		driver.switchTo().window(omayoID);
		driver.close();
		
	}
	

}
