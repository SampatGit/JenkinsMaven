import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest {
	
	@Test
	public void unitTest(){
		int a = 10;	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		System.out.println("title"+ driver.getTitle());
		System.out.println("title"+ driver.getTitle());
		System.out.println("title"+ driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("MakeMyTrip"));
		
	}
}


